/* Rexx */

Do
  placesList = sampleData()
  call show placesList
  say
  sortedList = bubbleSort(placesList)
  call show sortedList
  say

  return
End
Exit

-- -----------------------------------------------------------------------------
bubbleSort:
procedure
Do
  /*
    This can be expressed in pseudocode as follows (assuming 1-based indexing):

    repeat
      hasChanged := false
      decrement itemCount
      repeat with index from 1 to itemCount
        if (item at index) > (item at (index + 1))
          swap (item at index) with (item at (index + 1))
          hasChanged := true
    until hasChanged = false
  
   */

  il = arg(1)
  sl = il~copy
  itemCount = sl~size

  loop label c_ until \hasChanged
    hasChanged = isFalse()
    itemCount = itemCount - 1
    loop i_ = 1 to itemCount
      if sl[i_] > sl[i_ + 1] then do
        t_         = sl[i_]
        sl[i_]     = sl[i_ + 1]
        sl[i_ + 1] = t_
        hasChanged = isTrue()
        end
      end i_
    end c_

  return sl
End
Exit

-- -----------------------------------------------------------------------------
show:
procedure
Do
  al = arg(1)

  loop e_ over al
    say e_
    end e_
  
  return
End
Exit

-- -----------------------------------------------------------------------------
sampleData:
procedure
Do
  placesList = .array~of( ,
    "UK  London",     "US  New York",   "US  Boston",     "US  Washington", ,
    "UK  Washington", "US  Birmingham", "UK  Birmingham", "UK  Boston"      ,
    )

  return placesList
End
Exit

-- -----------------------------------------------------------------------------
isTrue: procedure
  return (1 == 1)

-- -----------------------------------------------------------------------------
isFalse: procedure
  return \isTrue()

