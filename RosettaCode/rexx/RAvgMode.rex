/* Rexx */

-- will work with just about any collection...
call testMode .array~of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)                                    -- 10 9 8 7 6 5 4 3 2 1
call testMode .list~of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, .11)                    -- 0
call testMode .queue~of(30, 10, 20, 30, 40, 50, -100, 4.7, -11e2)                         -- 30
call testMode .queue~of(30, 10, 20, 30, 40, 50, -100, 4.7, -11e2, -11e2)                  -- 30 -11e2
call testMode .array~of(1, 8, 6, 0, 1, 9, 4, 6, 1, 9, 9, 9)                               -- 9
call testMode .array~of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)                                -- 1 2 3 4 5 6 7 8 9 10 11
call testMode .array~of(8, 8, 8, 2, 2, 2)                                                 -- 8 2
call testMode .array~of('cat', 'kat', 'Cat', 'emu', 'emu', 'Kat')                         -- emu
call testMode .array~of(0, 1, 2, 3, 3, 3, 4, 4, 4, 4, 1, 0)                               -- 4
call testMode .array~of(2, 7, 1, 8, 2)                                                    -- 2
call testMode .array~of(2, 7, 1, 8, 2, 8)                                                 -- 8 2
call testMode .array~of('E', 'n', 'z', 'y', 'k', 'l', 'o', 'p', 'ä', 'd', 'i', 'e')       -- E n z y k l o p ä d i e
call testMode .array~of('E', 'n', 'z', 'y', 'k', 'l', 'o', 'p', 'ä', 'd', 'i', 'e', 'ä')  -- ä
call testMode .array~of(3, 1, 4, 1, 5, 9, 7, 6)                                           -- 1
call testMode .array~of(3, 1, 4, 1, 5, 9, 7, 6, 3)                                        -- 3, 1
call testMode .array~of(1, 3, 6, 6, 6, 6, 7, 7, 12, 12, 17)                               -- 6
call testMode .array~of(1, 1, 2, 4, 4)                                                    -- 4 1

 
::routine testMode
  use arg list
  say "list =" list~makearray~toString("l", ", ")
  say "mode =" mode(list)
  say
 
::routine mode
  use arg list
 
  -- this is a good application for a bag
  -- add all of the items to the bag
  collector = .bag~new
  collector~putAll(list)
  -- now get a list of unique items
  indexes = .set~new~~putall(collector)
  count = 0    -- this is used to keep track of the maximums
  -- now see how many of each element we ended up with
  loop index over indexes
      items = collector~allat(index)
      newCount = items~items
      if newCount > count then do
          mode = items[1]
          count = newCount
      end
  end
 
  return mode
