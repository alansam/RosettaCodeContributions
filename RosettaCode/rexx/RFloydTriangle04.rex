/*REXX program constructs & displays Floyd's triangle for any number of rows.*/
parse arg numRows .
if numRows == '' then numRows = 1     -- assume 1 row is not given
maxVal = numRows * (numRows + 1) % 2  -- calculate the max value.
say 'displaying a' numRows "row Floyd's triangle:"
say
digit = 1
loop row = 1 for numRows
  col = 0
  output = ''
  loop digit = digit for row
    col += 1
    colMaxDigit = maxVal - numRows + col
    output = output digit~right(colMaxDigit~length())
    end digit
  say output
  end row

