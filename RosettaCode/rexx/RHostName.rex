/* Rexx */

address command 'hostname -f'
address command "echo $HOSTNAME"
address command 'uname -n'

address command "echo $HOSTNAME | rxqueue"
address command "hostname -f | rxqueue"
address command 'uname -n | rxqueue'
loop q_ = 1 while queued() > 0
  parse pull hn
  say q_~right(2)':' hn
  end q_

qq = .rexxqueue~new()
address command "echo $HOSTNAME | rxqueue"
address command "hostname -f | rxqueue"
address command 'uname -n | rxqueue'
loop q_ = 1 while qq~queued() > 0
  hn = qq~pull()
  say q_~right(2)':' hn
  end q_

exit

