/*REXX pgm calculates resistance between any 2 points on a resister grid*/
numeric digits 20                      /*use moderate digits (precision)*/
minVal = (1'e-' || (digits() * 2)) / 1         /*calculate the threshold min val*/
if 1 == 'f1'x then ohms = 'ohms'           /*EBCDIC machine?    Use 'ohms'. */
              else ohms = 'ohms' -- Only on some systems 'ea'x            /* ASCII machine?    Use Greek Ω.*/
parse arg   wide high   Arow Acol   Brow Bcol   .
say 'minVal = ' format(minVal,,,, 0)                          ;   say
say 'resistor mesh is of size: ' wide "wide, " high 'high.'   ;   say
say 'point A is at (row,col): '   Arow","Acol
say 'point B is at (row,col): '   Brow","Bcol                 ;   say
A_. = 0;   cell. = 1
do until S_ <= minVal;
  S_ = 0;
  v = 0
  A_.Arow.Acol = +1 ;
  cell.Arow.Acol = 0
  A_.Brow.Bcol = -1 ;
  cell.Brow.Bcol = 0

  do i   = 1 for high;
    im = i - 1;
    ip = i + 1
    do j = 1 for wide;
      jm = j - 1;
      jp = j + 1;
      n = 0;
      v = 0
      if i \== 1  then do;
        v = v + A_.im.j;
        n = n + 1;
        end
      if j \== 1  then do;
        v = v + A_.i.jm;
        n = n + 1;
        end
      if i < high then do;
        v = v + A_.ip.j;
        n = n + 1;
        end
      if j < wide then do;
        v = v + A_.i.jp;
        n = n + 1;
        end
      v = A_.i.j - v / n;
      H_.i.j = v;
      if cell.i.j then S_ = S_ + v * v
      end   /*j*/
    end     /*i*/

  do r   = 1 for High
    do c = 1 for Wide;
      A_.r.c = A_.r.c - H_.r.c
      end   /*r*/
    end     /*c*/
  end                    /*until S_<=minVal*/

Acur = H_.Arow.Acol * sides(Arow, Acol)
Bcur = H_.Brow.Bcol * sides(Brow, Bcol)
say 'resistance between point A and point B is: ' 4 / (Acur - Bcur) ohms
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────sides subroutine────────-───────────*/
sides:
  parse arg i, j; B_ = 0;
  if i \== 1 & i \== high  then  B_ = B_ + 2
                           else  B_=B_+1
  if j \== 1 & j \== wide  then  B_ = B_ + 2
                           else  B_ = B_ + 1
return B_

