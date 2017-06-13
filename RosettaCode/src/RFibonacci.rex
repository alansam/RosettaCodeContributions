/*REXX program calculates the Nth Fibonacci number, N can be zero or neg*/
numeric digits 210000                  /*prepare for some big 'uns.     */
parse arg x y .                        /*allow a single number or range.*/
if x=='' then do; x=-30; y=-x; end     /*no input? Then assume -30-->+30*/
if y=='' then y=x                      /*if only one number, show fib(n)*/
     do k=x to y                       /*process each Fibonacci request.*/
     q=fib(k)
     w=length(q)                       /*if wider than 25 bytes, tell it*/
     say 'Fibonacci' k"="q
     if w>25 then say 'Fibonacci' k "has a length of" w
     end
exit

/*-------------------------------------FIB subroutine (non-recursive)---*/
fib: procedure; parse arg n; na=abs(n)
if na<2 then return na                 /*handle special cases.          */
a=0
b=1
      do j=2 to na
      s=a+b
      a=b
      b=s
      end
if n>0 | na//2==1 then return  s       /*if positive or odd negative... */
                  else return -s       /*return a negative Fib number.  */

