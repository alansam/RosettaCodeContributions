/* SQRT EXEC                                                */
/* The SQUARE ROOT function.                                   */
/*                                                             */
/* A function to calculate the square root of a number         */
/* using the Newton-Raphson method.                            */
/*                                                             */
/*                SQRT(number)                                 */
/*                                                             */
/* where "number" is a nonnegative REXX number,                */
/* returns the square root of "number".  If the number  */
/* is negative or not a decimal number, then this function will */
/* return a null character and report the error.                */
/*
 * http://publib.boulder.ibm.com/infocenter/zvm/v6r1/index.jsp?topic=/com.ibm.zvm.v610.dmsb0/dup0011.htm
 * (C) Copyright IBM Corporation 1990, 2010
 */
arg num                             /* get the number          */
null = ''

--if ¬datatype(num,'Number')          /* valid number?           */
if \datatype(num,'Number')          /* valid number?           */
  then do
    say 'Invalid input argument:' Num'.  Must be a positive decimal number.'
    return null
  end

if num < 0                          /* check for negative      */
  then do
    say 'Invalid input argument:' Num'.  Must be a positive decimal number.'
    return null
  end
  else if num = 0 then
    return 0                        /* check for 0             */

xnew = num                          /* initialize answer       */

                                    /* calculate maximum       */
eps = 0.5 * 10**(1+fuzz()-digits()) /* accuracy                */

/* Loop until a sufficiently accurate answer is obtained.      */

do until abs(xold-xnew) < (eps*xnew)
  xold = xnew                       /* save the old value      */
  xnew = 0.5 * (xold + num / xold)  /* calculate the new       */
end

xnew = xnew / 1                     /* strip unnecessary zeros */

return xnew

