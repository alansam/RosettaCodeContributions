/*REXX program to implement a stateless  Y  combinator.  */
numeric digits 1000                                         /*allow some big 'uns*/
say '    fib' Y(fib (50))                                   /*Fibonacci series*/
say '    fib' Y(fib (12 11 10 9 8 7 6 5 4 3 2 1 0))         /*Fibonacci series*/
say '   fact' Y(fact (60))                                  /*single factorial*/
say '   fact' Y(fact (0 1 2 3 4 5 6 7 8 9 10 11))           /*single factorial*/
say '  Dfact' Y(dfact (4 5 6 7 8 9 10 11 12 13))            /*double factorial*/
say '  Tfact' Y(tfact (4 5 6 7 8 9 10 11 12 13))            /*triple factorial*/
say '  Qfact' Y(qfact (4 5 6 7 8 40))                       /*quadruple factorial*/
say ' length' Y(length (when for to where whenceforth))     /*lengths*/
say 'reverse' Y(reverse (23 678 1007 45 MAS I MA))          /*reverses*/
say '  trunc' Y(trunc (-7.0005 12 3.14159 6.4 78.999))      /*truncs*/
exit
        Y: lambda=''; parse arg Y _; do j=1 for words(_); interpret ,
          'lambda=lambda' Y'('word(_,j)')'; end; return lambda
      fib: procedure; arg x; if x<2 then return x; s=0; a=0; b=1
                      do j=2 to x; s=a+b; a=b; b=s; end; return s
    dfact: procedure; arg x; !=1; do j=x to 2 by -2;!=!*j; end; return !
    tfact: procedure; arg x; !=1; do j=x to 2 by -3;!=!*j; end; return !
    qfact: procedure; arg x; !=1; do j=x to 2 by -4;!=!*j; end; return !
     fact: procedure; arg x; !=1; do j=2 to x      ;!=!*j; end; return !

