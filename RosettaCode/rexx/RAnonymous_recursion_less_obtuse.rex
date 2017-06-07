/*REXX program to show anonymous recursion  (of a function/subroutine). */
numeric digits 1e6                        /*in case the user goes kaa-razy.*/
       do j = 0 to word(arg(1) 12, 1)     /*use argument or the default: 12*/
       say 'fibonacci('j") =" fib(j)      /*show Fibonacci sequence: 0──>x */
       end
exit
 
fib: procedure;
  if arg(1) >= 0 then
    return f1(arg(1))
  say "***error!*** argument can't be negative.";
exit

f1: procedure;
  arg _v;
  if _v < 2 then
    return _v;
  return f1(_v - 1) + f1(_v - 2)

