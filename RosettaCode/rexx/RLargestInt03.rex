/* Rexx */

call runSample
return

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
largestInt:
procedure
  parse arg il
  ri  = ''
  wa. = ''
  -- put the list into an indexed string
  wa.0 = words(il)
  do ww = 1 to wa.0
    wa.ww = word(il, ww)
    end ww

  -- order the list
  do wx = 1 to wa.0 - 1
    do wy = wx + 1 to wa.0
      xx = wa.wx
      yy = wa.wy
      xy = xx || yy
      yx = yy || xx
      if xy < yx then do
        -- swap xx and yy
        wa.wx = yy
        wa.wy = xx
        end
      end wy
    end wx

  -- rebuild list from indexed string
  do ww = 1 to wa.0
    ri = ri wa.ww
    end ww
  return space(ri, 0) -- concatenate the list elements into a single numeric

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
runSample:
procedure
  i_ = 0
  i_ = i_ + 1; ints.0 = i_; ints.i_ = '1 34 3 98 9 76 45 4'
  i_ = i_ + 1; ints.0 = i_; ints.i_ = '54 546 548 60'

  do i_ = 1 to ints.0
    il = ints.i_
    say right(largestInt(il), 20) ':' space(il, 1, ',')
    end i_
  return

