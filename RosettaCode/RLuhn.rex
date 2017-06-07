/*REXX program to verify credit card numbers via the Luhn algorithm.*/
 
cc. = 0                        /*define default value of zero for CCs.*/
cc.1 = '49927398716'           /*sample credit card number one.       */
cc.2 = '49927398717'           /*sample credit card number two.       */
cc.3 = '1234567812345678'      /*sample credit card number three.     */
cc.4 = '1234567812345670'      /*sample credit card number four.      */
 
  do k_ = 1 while cc.k_ \== 0
  r_ = checksum(cc.k_)
  if r_ == 0 then say right(cc.k_, 20) '  passed the Luhn test.'
             else say right(cc.k_, 20) " flunked the Luhn test!"
  end
 
exit
 
          /*-----Luhn algorith checksum for credit card numbers-----*/
checksum: procedure
  parse arg t_
  if length(t_) // 2 then t_ = '0't_     /*odd #digits?  Pad # on left with 0*/
  t_ = reverse(t_)
  s = 0
 
  do j_ = 1 to length(t_) - 1 by 2
    q_ = 2 * substr(t_, j_ + 1, 1)
    if q_ > 9 then q_ = left(q_, 1) + right(q_, 1)
    s = s + substr(t_, j_, 1) + q_
    end j_

  return s // 10 \== 0

