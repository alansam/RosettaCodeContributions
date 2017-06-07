/* Rexx */
-- -----------------------------------------------------------------------------

call e1
call e2
call e3

return
exit

-- -----------------------------------------------------------------------------
e1: procedure

  a.1 = 10
  a.2 = 22.7
  a.7 = -12

  return
  exit

-- -----------------------------------------------------------------------------
e2: procedure

  fact.0 = 8
  fact.1 =     1
  fact.2 =     2
  fact.3 =     6
  fact.4 =    24
  fact.5 =   120
  fact.6 =   720
  fact.7 =  5040
  fact.8 = 40320

  return
  exit

-- -----------------------------------------------------------------------------
e3: procedure

  p.=''       /*a short list of primes.*/
  p.1  =  2;  p.2  =  3; p.3  =  5;
  p.4  =  7;  p.5  = 11; p.6  = 13;
  p.7  = 17;  p.8  = 19; p.9  = 23;
  p.10 = 27;  p.11 = 31; p.12 = 37;
 
  f.=''       /*a short list of Fibonacci numbers.*/
  f.1 = 1;  f.2 =  1; f.3 =  2; f.4 =  3; f.5  =  5;
  f.6 = 8;  f.7 = 13; f.8 = 21; f.9 = 34; f.10 = 55;
 
  n = 0
 
  do j = 1 while p.j \== ''
    n = n + 1
    c.n = p.j
    end
 
  do k = 1 while f.k \== ''
    n = n + 1
    c.n = f.k
    end
 
  say 'n' = n
 
  do m = 1 for n
    say 'c.'m"="c.m
    end
  
  return
  exit

-- -----------------------------------------------------------------------------
/*
output

elements=22
c.1=2
c.2=3
c.3=5
c.4=7
c.5=11
c.6=13
c.7=17
c.8=19
c.9=23
c.10=27
c.11=31
c.12=37
c.13=1
c.14=1
c.15=2
c.16=3
c.17=5
c.18=8
c.19=13
c.20=21
c.21=34
c.22=55
*/
-- -----------------------------------------------------------------------------
