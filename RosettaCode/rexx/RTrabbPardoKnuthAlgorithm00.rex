/*REXX program to implement the  Trabb-Pardo-Knuth  algorthm for N nums.*/
N=11                                   /*N  is the number of numbers.   */
maxValue=400                           /*the maximum value f(x) can have*/
precDigs=200                           /*compute with this many digits. */
showDigs=20                            /*...but only show this many digs*/
numeric digits precDigs                /*the number of digits precision.*/
prompt='enter' N "nunbers for the Trabb-Pardo-Knuth algorthm:   (or Quit)"
say '                           _____               '        /*vinculum.*/
say 'function:        ƒ(x)  ≡  √ │x│   +   (5 * x^3)'
/*██████████████████████████████████████████████████████████████████████*/
  do ask=0;    say;    say prompt;   say;    parse pull yyyU . 1 yyy;  say
  upper yyyU;   if abbrev('QUIT',yyyU,1) then exit
 
     do validate=0
                   select
                   when yyy='' then say 'no numbers entered'
                   when words(yyy)<N then say 'not enough numbers entered'
                   when words(yyy)>N then say 'too many numbers entered'
                   otherwise leave validate
                   end   /*select*/
     iterate ask
     end   /*validate*/
                           do j=1 for N;            _=word(yyy,j)
                           if \datatype(_,'N') then do
                                                    say _ "isn't numeric"
                                                    iterate ask
                                                    end
                           end   /*j*/
     leave ask
  end       /*ask*/
say 'numbers entered:' yyy;    say
/*██████████████████████████████████████████████████████████████████████*/
        do i=N by -1 to 1;   p=word(yyy,i)/1    /*process #s in reverse.*/
        g=f(p)
        numeric digits showdigs;   g=g/1        /*scale down the result.*/
        if g>maxValue then say 'f('p") is > " maxValue '  ['g"]"
                      else say 'f('p") = " g    /*show the (good) result*/
        numeric digits precDigs                 /*re-instate big digits.*/
        end   /*i*/
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────F function──────────────────────────*/
f: procedure;  arg x;   return sqrt(abs(x))    +    5 * x**3
/*──────────────────────────────────SQRT function───────────────────────*/
sqrt: procedure; parse arg x; if x=0 then return 0; d=digits();numeric digits 11
      g=.sqrtGuess();         do j=0 while p>9;    m.j=p;    p=p%2+1;   end
      do k=j+5 to 0 by -1;  if m.k>11 then numeric digits m.k; g=.5*(g+x/g); end
      numeric digits d;     return g/1
.sqrtGuess: numeric form;   m.=11;  p=d+d%4+2
           parse value format(x,2,1,,0) 'E0' with g 'E' _ .;   return g*.5'E'_%2
/*
output when prompted, using the input of: 5 3.3 3 2e-1 1 0 -1 -222 -33 4.0004 +5
                           _____
function:        ƒ(x)  ≡  √ │x│   +   (5 * x^3)

enter 11 nunbers for the Trabb-Pardo-Knuth algorthm:   (or Quit)

numbers entered: 5 3.3 3 2e-1 1 0 -1 -222 -33 4.0004 +5

f(5) is >  400   [627.2360679774997897]
f(4.0004) =  322.09610959782012499
f(-33) =  -179679.25543735346197
f(-222) =  -54705225.100335574249
f(-1) =  -4
f(0) =  0
f(1) =  6
f(0.2) =  0.48721359549995793928
f(3) =  136.73205080756887729
f(3.3) =  181.501590212458495
f(5) is >  400   [627.2360679774997897]
*/

