/* Rexx */

-- =============================================================================
parse arg size .
if \size~datatype('W') then do
  call printArray generateArray(3)
  say
  call printArray generateArray(4)
  say
  call printArray generateArray(5)
  say
  end
else do
  call printArray generateArray(size)
  say
  end

return

-- -----------------------------------------------------------------------------
::routine generateArray
  use arg dimension
  -- the output array
  array = .array~new(dimension, dimension)
 
  -- get the number of squares, including the center one if
  -- the dimension is odd
  squares = dimension % 2 + dimension // 2
  -- length of a side for the current square
  sidelength = dimension
  current = 0
  loop i = 1 to squares
      -- do each side of the current square
      -- top side
      loop j = 0 to sidelength - 1
          array[i, i + j] = current
          current += 1
      end
      -- down the right side
      loop j = 1 to sidelength - 1
          array[i + j, dimension - i + 1] = current
          current += 1
      end
      -- across the bottom
      loop j = sidelength - 2 to 0 by -1
          array[dimension - i + 1, i + j] = current
          current += 1
      end
      -- and up the left side
      loop j = sidelength - 2 to 1 by -1
          array[i + j, i] = current
          current += 1
      end
      -- reduce the length of the side by two rows
      sidelength -= 2
  end
  return array

-- -----------------------------------------------------------------------------
::routine printArray
  use arg array
  dimension = array~dimension(1)
  rl = formatSize(array)
  loop i = 1 to dimension
      line = "|"
      loop j = 1 to dimension
          line = line array[i, j]~right(rl)
      end
      line = line "|"
      say line
   end

-- -----------------------------------------------------------------------------
::routine formatSize
  use arg array
  dim = array~dimension(1)
  maxNum = (dim * dim - 1)~length()

  return maxNum

-- =============================================================================
/*

Output:

|  0  1  2 |
|  7  8  3 |
|  6  5  4 |

|  0  1  2  3 |
| 11 12 13  4 |
| 10 15 14  5 |
|  9  8  7  6 |

|  0  1  2  3  4 |
| 15 16 17 18  5 |
| 14 23 24 19  6 |
| 13 22 21 20  7 |
| 12 11 10  9  8 |
*/

