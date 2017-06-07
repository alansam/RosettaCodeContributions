/* REXX ***************************************************************
* 12.06.2014 Walter Pachl translated from Wikipedia's code
**********************************************************************/
list='1 9 3 5 8 4 7 0 6 2'
n=words(list)
Do i=0 To n-1
  array.i=word(list,i+1)
  End
Say list
writes = cyclesort()
Say 'writes='writes
ol=''
Do i=0 To n-1
  ol=ol array.i
  End
Say strip(ol)
Exit
 
cycleSort:
  procedure expose array. n
  writes = 0

  -- Loop through the array to find cycles to rotate.
  Do cycleStart = 0 to n - 1 - 1
    item = array.cycleStart

    -- Find where to put the item.
    pos = cycleStart
    Do i = cycleStart + 1 to n - 1
      if array.i < item Then
        --pos += 1
        pos = pos + 1
      End

    -- If the item is already there, this is not a cycle.
    if pos == cycleStart Then
      Iterate

    -- Otherwise, put the item there or right after any duplicates.
    Do while item == array.pos
      --pos += 1
      pos = pos + 1
      End
    Parse Value array.pos item With item array.pos
    --writes += 1
    writes = writes + 1

    -- Rotate the rest of the cycle.
    Do while pos <> cycleStart

      -- Find where to put the item.
      pos = cycleStart
      Do i = cycleStart + 1 to n - 1
        if array.i < item Then
          --pos += 1
          pos = pos + 1
        End

      -- Put the item there or right after any duplicates.
      Do while item == array.pos
        --pos += 1
        pos = pos + 1
        End
      Parse Value array.pos item With item array.pos
      --writes += 1
      writes = writes + 1
      End
    End
  return writes

