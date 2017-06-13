#!/usr/bin/env rexx
/*REXX program to calculate the Ackermann function. */

                         /*Note: the Ackermann function (as implemented */
                         /*      is higly recursive and is limited by   */
                         /*      the highest number that can have  "1"  */
                         /*      added to a number  (N).                */

high = 24

  Do j = 0 to 3
  Say

    Do k = 0 to high % (max(1, j))
    Call Ackermann_tell j, k
    End
  End

Exit


/*------------------------------------ACKERMANN_TELL subroutine (echo). */
ackermann_tell: Parse arg mm, nn              /*display an echo message.*/
calls = 0

nnn = right(nn, length(high))

Say 'Ackermann('right(mm, 2)","right(nn, 2)')='right(ackermann(mm, nn), digits()),
               '   calls='right(calls, digits())
Return


/*------------------------------------ACKERMANN subroutine (recusive).  */
ackermann: Procedure Expose calls       /*compute the Ackerman function.*/
Parse arg m,n
calls = calls + 1
if m == 0 then return n + 1
if n == 0 then return ackermann(m - 1, 1)
if m == 2 then return n * 2 + 3
               return ackermann(m - 1, ackermann(m, n - 1))

