/*REXX program constructs & displays Floyd's triangle for any H of rows.*/
parse arg rows .
if rows == '' then rows = 1   /*assume 1 row is not given*/
mV = rows * (rows + 1) % 2                           /*calculate the max value. */
say 'displaying a' rows "row Floyd's triangle:";
say
H = 1
do r = 1 for rows;
  i = 0;
  _ = ''
  do H = H for r;
    i = i + 1
    _ = _ right(H, length(mV - rows + i))
    end H
  say _
  end r
           
