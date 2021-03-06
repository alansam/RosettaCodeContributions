/*REXX program  numerically integrates  using  five  different methods. */
numeric digits 20                      /*use twenty digits precision.   */

parse arg tests .
if tests = '' | tests < 1 | tests > 4 then tests = 4
do test = 1 for tests                  /*perform the test suite.        */
  select
    when test == 1 then do;  L = 0;   H =    1;   i =     100;  end
    when test == 2 then do;  L = 1;   H =  100;   i =    1000;  end
    when test == 3 then do;  L = 0;   H = 5000;   i = 5000000;  end
    when test == 4 then do;  L = 0;   H = 6000;   i = 5000000;  end
    otherwise           do;  L = 0;   H =    1;   i =     100;  end
    end
  say
  say centre('test' test, 79, '-')   /*display a header for the test. */
  say '      left_rectangular('L", "H', 'i") = "       left_rect(L, H, i)
  say '  midpoint_rectangular('L", "H', 'i") = "   midpoint_rect(L, H ,i)
  say '     right_rectangular('L", "H', 'i") = "      right_rect(L, H, i)
  say '               simpson('L", "H', 'i") = "         simpson(L, H, i)
  say '             trapezoid('L", "H', 'i") = "       trapezoid(L, H, i)
  end test
exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------LEFT_RECT subroutine----------------*/
left_rect:
procedure expose test;
  parse arg a, b, n;
  h = (b - a) / n
  sum = 0
  do x = a by h for n
    sum = sum + f(x)
    end x
  return sum * h

/*----------------------------------MIDPOINT_RECT subroutine------------*/
midpoint_rect:
procedure expose test;
  parse arg a, b, n;
  h = (b - a) / n
  sum = 0
  do x = a + h / 2 by h for n
    sum = sum + f(x)
    end x
  return sum * h

/*----------------------------------RIGHT_RECT subroutine---------------*/
right_rect:
procedure expose test;
  parse arg a, b, n;
  h = (b - a) / n
  sum = 0
  do x = a + h by h for n
    sum = sum + f(x)
    end x
  return sum * h

/*----------------------------------SIMPSON subroutine------------------*/
simpson:
procedure expose test;
  parse arg a, b, n;
  h = (b - a) / n
  sum1 = f(a + h / 2)
  sum2 = 0
  do x = 1 to n - 1
    sum1 = sum1 + f(a + h * x + h * 0.5)
    sum2 = sum2 + f(a + x * h)
    end x
 
  return h * (f(a) + f(b) + 4 * sum1 + 2 * sum2) / 6

/*----------------------------------TRAPEZOID subroutine----------------*/
trapezoid:
procedure expose test;
  parse arg a, b, n;
  h = (b - a) / n
  sum = 0
  do x = a to b by h
    sum = sum + h * (f(x) + f(x + h)) * 0.5
    end x
  return sum

/*----------------------------------F subroutine------------------------*/
f:
procedure expose test;
  parse arg z
  if test == 1 then return z ** 3
  if test == 2 then return 1 / z
                    return z

