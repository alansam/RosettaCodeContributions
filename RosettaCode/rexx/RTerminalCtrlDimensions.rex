/* Rexx */

/*
REXX-Regina_...
REXX-ooRexx_...
REXX/imc ...
*/

parse upper version 'REXX-'vv'_' .

select
  when vv = 'REGINA' then do
    width = 'tput'( 'cols' )
    height = 'tput'( 'lines' )
    end
  when vv = 'OOREXX' then do
    'tput cols  | rxqueue'
    'tput lines | rxqueue'
    parse pull width
    parse pull height
    end
  otherwise do
    width = 0
    height = 0
    end
  end
  say 'The terminal is' width 'characters wide'
  say 'and has' height 'lines'

