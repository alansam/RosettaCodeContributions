/* REXX *************************************************************
* The task description specifies a continued fraction for pi
* that gives a reasonable approximation.
* Literature shows a better CF that yields pi with a precision of
* 200 digits.
* http://de.wikipedia.org/wiki/Kreiszahl
*                    1
* pi = 3 + ------------------------
*                      1
*          7 + --------------------
*                         1
*              15 + ---------------
*                            1
*                   1 + -----------
*
*                       292 + ...
*
* This program uses that CF and shows the first 50 digits
* PI =3.1415926535897932384626433832795028841971693993751...
* PIX=3.1415926535897932384626433832795028841971693993751...
* 201 correct digits
* 18.09.2012 Walter Pachl
**********************************************************************/
  pi='3.1415926535897932384626433832795028841971'||,
     '693993751058209749445923078164062862089986280348'||,
     '253421170679821480865132823066470938446095505822'||,
     '317253594081284811174502841027019385211055596446'||,
     '229489549303819644288109756659334461284756482337'||,
     '867831652712019091456485669234603486104543266482'||,
     '133936072602491412737245870066063155881748815209'||,
     '209628292540917153643678925903600113305305488204'||,
     '665213841469519415116094330572703657595919530921'||,
     '861173819326117931051185480744623799627495673518'||,
     '857527248912279381830119491298336733624'
  Numeric Digits 1000
  al='7 15 1 292 1 1 1 2 1 3 1 14 2 1 1 2 2 2 2 1 84 2',
     '1 1 15 3 13 1 4 2 6 6 99 1 2 2 6 3 5 1 1 6 8 1 7 1 2',
     '3 7 1 2 1 1 12 1 1 1 3 1 1 8 1 1 2 1 6 1 1 5 2 2 3 1',
     '2 4 4 16 1 161 45 1 22 1 2 2 1 4 1 2 24 1 2 1 3 1 2',
     '1 1 10 2 5 4 1 2 2 8 1 5 2 2 26 1 4 1 1 8 2 42 2 1 7',
     '3 3 1 1 7 2 4 9 7 2 3 1 57 1 18 1 9 19 1 2 18 1 3 7',
     '30 1 1 1 3 3 3 1 2 8 1 1 2 1 15 1 2 13 1 2 1 4 1 12',
     '1 1 3 3 28 1 10 3 2 20 1 1 1 1 4 1 1 1 5 3 2 1 6 1 4'
  a.=3
  Do i=1 By 1 while al<>''
    Parse Var al a.i al
    End
  pix=calc(194)
  Do e=1 To length(pi)
    If substr(pix,e,1)<>substr(pi,e,1) Then Leave
    End
  Numeric Digits 50
  Say 'PI ='||(pi+0)||'...'
  Say 'PIX='||(pix+0)||'...'
  Say (e-1) 'correct digits'
  Exit

Get_Coeffs: procedure Expose a b a.
  Parse Arg n
  a=a.n
  b=1
  Return

Calc: procedure Expose a b a.
  Parse Arg n
  Temp=0
  do ni = n to 1 by -1
    Call Get_Coeffs ni
    Temp = B/(A + Temp)
    end
  call Get_Coeffs 0
  return (A + Temp)

