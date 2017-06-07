/* Rexx */

do
  true = (1 == 1)
  false = \true
  BOOLEAN = 'true false'
  
  parse arg arg1 arg2 otherargs
  if arg1 = '.' then arg1 = ''
  if arg2 = '.' then arg2 = ''
  
  call jumpingDO arg1 arg2 otherargs
  
  return
end
exit

jumpingDO:
procedure expose (BOOLEAN)
do
  --trace ?r; nop
  do outermost = 1 for 100
    say right(outermost, 4)
    do inner = 1 for 100
      if inner > 10 then iterate outermost
      say right(inner, 8)
      do innermost = 1 for 100
        if outermost > 2 then leave outermost
        if innermost // 6 = 0 then iterate inner
        if innermost // 3 = 0 then iterate innermost
        say right(innermost, 12)
        end innermost
      end inner
    end outermost
end
exit

