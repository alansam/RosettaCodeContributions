/*REXX program to calculate the Ackermann function. */
 
                         /*Note: the Ackermann function (as implemented */
                         /*      is higly recursive and is limited by   */
                         /*      the highest number that can have  "1"  */
                         /*      added to a number  (N).                */
 
Numeric Digits 10000     /*tell REXX to use up to 10,000 digit integers.*/
 
                         /*When REXX raises a number to a power         */
                         /* (via the   **  operator), the power must be */
                         /* an integer  (positive, zero, or negative).  */
 
  Do j = 0 to 4          /*Ackermann(5,1)  is a bit impractical to calc.*/
    Say                  /*display a blank (separator) line.            */
    Do k = 0 to 10
      Call Ackermann_tell j, k
      End k
    End j
 
Exit

/*------------------------------------ACKERMANN_TELL subroutine (echo). */
ackermann_tell:
  Parse arg mm, nn              /*display an echo message.*/
  Say 'Ackermann('mm","nn')='ackermann(mm, nn)
  Return

/*------------------------------------ACKERMANN subroutine (recusive).  */
ackermann: Procedure                    /*compute the Ackerman function.*/
  Parse Arg m,n
  If m == 0 then Return n + 1
  If m == 1 then Return n + 2
  If m == 2 then Return n + n + 3
  If m == 3 then Return 2 ** (n + 3) - 3
  If m == 4 then Return 2 ** (2 ** n + 3) - 3       /*ugh.*/
  If n == 0 then Return ackermann(m - 1, 1)
                 Return ackermann(m - 1, ackermann(m, n - 1))

