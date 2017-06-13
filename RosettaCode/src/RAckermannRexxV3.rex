#!/usr/bin/env rexx
/*REXX program to calculate the Ackermann function. */

                         /*Note: the Ackermann function (as implemented */
                         /*      is higly recursive and is limited by   */
                         /*      the highest number that can have  "1"  */
                         /*      added to a number  (N).                */

numeric digits 10000     /*tell REXX to use up to 10,000 digit integers.*/

                         /*When REXX raises a number to a power         */
                         /* (via the   **  operator), the power must be */
                         /* an integer  (positive, zero, or negative).  */

  do j = 0 to 4          /*Ackermann(5,1)  is a bit impractical to calc.*/
    say                  /*display a blank (separator) line.            */
        do k = 0 to 10
          call Ackermann_tell j, k
        end
  end

exit


/*------------------------------------ACKERMANN_TELL subroutine (echo). */
ackermann_tell: parse arg mm, nn              /*display an echo message.*/
say 'Ackermann('mm","nn')='ackermann(mm, nn)
return


/*------------------------------------ACKERMANN subroutine (recusive).  */
ackermann: procedure                    /*compute the Ackerman function.*/
parse arg m, n
if m == 0 then return n + 1
if m == 1 then return n + 2
if m == 2 then return n + n + 3
if m == 3 then return 2 ** (n + 3) - 3
if m == 4 then return 2 ** (2 ** n + 3) - 3       /*ugh.*/
if n == 0 then return ackermann(m - 1, 1)
               return ackermann(m - 1, ackermann(m, n - 1))

