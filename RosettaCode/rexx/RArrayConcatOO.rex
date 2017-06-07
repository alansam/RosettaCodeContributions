a = .array~of(1,2,3)
say "Array a has " a~items "items"
call display a
b = .array~of(4,5,6)
say "Array b has " b~items "items"
call display b
a~appendall(b)        -- adds all items from b to a
say "Array a now has " a~items "items"
call display a
return
exit

display: procedure
  use arg q
  r_ = ''
  loop i_ over q~allItems
    r_ = r_ || i_','
    end i_
  say r_~strip('T', ',')
  return
exit

