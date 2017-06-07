/* Rexx */
parse version v
parse source s
say v
say s
parse var v . '-' interp '_' .

vars = 'TEMP HOME USER'
do w = 1 to words(vars)
  ev = word(vars, w)
  if interp = 'Regina' then do
    x = value(ev,, 'SYSTEM')
    say right('SYSTEM', 16) ev'=' || x
    end
  if interp = 'ooRexx' | interp = 'Regina' then do
    x = value(ev,, 'ENVIRONMENT')
    say right('ENVIRONMENT', 16) ev'=' || x
    end
  end w
return
exit

