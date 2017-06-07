/* REXX **********************************************************************************
 * Test frame for computing Christian holidays, related to Easter
 * 16.04.2013 Walter Pachl
 *****************************************************************************************/
oid = 'data/ee.txt'; 'rm' oid
 
month.3 = 'mar'; days.3 = 31
month.4 = 'apr'; days.4 = 30
month.5 = 'may'; days.5 = 31
month.6 = 'jun'; days.6 = 30
Call o 'Christian holidays, related to Easter, for each centennial',
                                                'from 400 to 2100 CE:'
Do y = 400 To 2100 By 100
  Call line y
  End
Call o ' '
Call o 'Christian holidays, related to Easter, for years',
                                                'from 2010 to 2020 CE:'
Do y = 2010 To 2020
  Call line y
  End
Exit
 
line: Parse Arg y
Parse Value easter(y) With y m d
Parse Value add(d,   m, 39) With ad am
Parse Value add(ad, am, 10) With pd pm
Parse Value add(pd, pm,  7) With td tm
Parse Value add(td, tm,  4) With cd cm
ol = right(y, 4) 'Easter:' right(d, 2) month.m
ol = ol'  Ascension:' right(ad, 2) month.am ' Pentecost:' right(pd, 2) month.pm
ol = ol'  Trinity:' right(td, 2) month.tm'  Corpus:' right(cd, 2) month.cm
Call o ol
Return
 
o: Return lineout(oid, arg(1))
 
add: Procedure Expose days.
Parse Arg d, m, dd
res = d + dd
Do While res > days.m
  res = res - days.m
  m = m + 1
  End
Return res m
 
easter: Procedure
/***********************************************************
 * translated from FORTRAN (mod -> //; / -> %)
 * Input  year
 * Output year month day of Easter Sunday
 * 16.04.2013 Walter Pachl
 c See:
 c Jean Meeus, "Astronomical Formulae for Calculators",
 c 4th edition, Willmann-Bell, 1988, p.31
 *********************************************************/
Parse Arg year
a = year // 19
b = year % 100
c = year // 100
d = b % 4
e = b // 4
f = (b + 8) % 25
g = (b - f + 1) % 3
h = (19 * a + b - d - g + 15) // 30
i = c % 4
k = c // 4
l = (32 + 2 * e + 2 * i - h - k) // 7
m = (a + 11 * h + 22 * l) % 451
n = h + l - 7 * m + 114
month = n % 31
day = n // 31 + 1
Return year month day

/*
Output:
Christian holidays, related to Easter, for each centennial from 400 to 2100 CE:
 400 Easter:  2 apr  Ascension: 11 may  Pentecost: 21 may  Trinity: 28 may  Corpus:  1 jun
 500 Easter:  4 apr  Ascension: 13 may  Pentecost: 23 may  Trinity: 30 may  Corpus:  3 jun
 600 Easter: 13 apr  Ascension: 22 may  Pentecost:  1 jun  Trinity:  8 jun  Corpus: 12 jun
 700 Easter: 15 apr  Ascension: 24 may  Pentecost:  3 jun  Trinity: 10 jun  Corpus: 14 jun
 800 Easter: 23 apr  Ascension:  1 jun  Pentecost: 11 jun  Trinity: 18 jun  Corpus: 22 jun
 900 Easter: 28 mar  Ascension:  6 may  Pentecost: 16 may  Trinity: 23 may  Corpus: 27 may
1000 Easter: 30 mar  Ascension:  8 may  Pentecost: 18 may  Trinity: 25 may  Corpus: 29 may
1100 Easter:  8 apr  Ascension: 17 may  Pentecost: 27 may  Trinity:  3 jun  Corpus:  7 jun
1200 Easter:  9 apr  Ascension: 18 may  Pentecost: 28 may  Trinity:  4 jun  Corpus:  8 jun
1300 Easter: 18 apr  Ascension: 27 may  Pentecost:  6 jun  Trinity: 13 jun  Corpus: 17 jun
1400 Easter: 20 apr  Ascension: 29 may  Pentecost:  8 jun  Trinity: 15 jun  Corpus: 19 jun
1500 Easter:  1 apr  Ascension: 10 may  Pentecost: 20 may  Trinity: 27 may  Corpus: 31 may
1600 Easter:  2 apr  Ascension: 11 may  Pentecost: 21 may  Trinity: 28 may  Corpus:  1 jun
1700 Easter: 11 apr  Ascension: 20 may  Pentecost: 30 may  Trinity:  6 jun  Corpus: 10 jun
1800 Easter: 13 apr  Ascension: 22 may  Pentecost:  1 jun  Trinity:  8 jun  Corpus: 12 jun
1900 Easter: 15 apr  Ascension: 24 may  Pentecost:  3 jun  Trinity: 10 jun  Corpus: 14 jun
2000 Easter: 23 apr  Ascension:  1 jun  Pentecost: 11 jun  Trinity: 18 jun  Corpus: 22 jun
2100 Easter: 28 mar  Ascension:  6 may  Pentecost: 16 may  Trinity: 23 may  Corpus: 27 may

Christian holidays, related to Easter, for years from 2010 to 2020 CE:
2010 Easter:  4 apr  Ascension: 13 may  Pentecost: 23 may  Trinity: 30 may  Corpus:  3 jun
2011 Easter: 24 apr  Ascension:  2 jun  Pentecost: 12 jun  Trinity: 19 jun  Corpus: 23 jun
2012 Easter:  8 apr  Ascension: 17 may  Pentecost: 27 may  Trinity:  3 jun  Corpus:  7 jun
2013 Easter: 31 mar  Ascension:  9 may  Pentecost: 19 may  Trinity: 26 may  Corpus: 30 may
2014 Easter: 20 apr  Ascension: 29 may  Pentecost:  8 jun  Trinity: 15 jun  Corpus: 19 jun
2015 Easter:  5 apr  Ascension: 14 may  Pentecost: 24 may  Trinity: 31 may  Corpus:  4 jun
2016 Easter: 27 mar  Ascension:  5 may  Pentecost: 15 may  Trinity: 22 may  Corpus: 26 may
2017 Easter: 16 apr  Ascension: 25 may  Pentecost:  4 jun  Trinity: 11 jun  Corpus: 15 jun
2018 Easter:  1 apr  Ascension: 10 may  Pentecost: 20 may  Trinity: 27 may  Corpus: 31 may
2019 Easter: 21 apr  Ascension: 30 may  Pentecost:  9 jun  Trinity: 16 jun  Corpus: 20 jun
2020 Easter: 12 apr  Ascension: 21 may  Pentecost: 31 may  Trinity:  7 jun  Corpus: 11 jun
*/

