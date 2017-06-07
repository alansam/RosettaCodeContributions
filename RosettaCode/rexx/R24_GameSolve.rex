/*REXX program to help the user find solutions to the game of  24.  */
/*------------------------------------------------------------------+
 | Argument is either of two forms:     ssss    ==or==   ssss-ffff  |
 |                                                                  |
 | where one or both strings must be exactly four numerals (digits) |
 | comprised soley of the numerals (digits)  1 --> 9   (no zeroes). |
 |                                                                  |
 | In    SSSS-FFFF           SSSS  is the start,                    |
 |                           FFFF  is the start.                    |
 +------------------------------------------------------------------*/
parse arg orig               /*get the  guess  from the argument.   */
parse var orig start '-' finish    /*get the start & finish (maybe).*/
start=space(start,0)         /*remove any blanks from the  START.   */
finish=space(finish,0)       /*remove any blanks from the  FINISH.  */
finish=word(finish start,1)  /*if no  FINISH  specified, use  START.*/
call validate start
call validate finish
opers='+-*/'                 /*define the legal arithmetic operators*/
ops=length(opers)            /* ... and the count of them (length). */
         do j=1 for ops      /*define a version for fast execution. */
         o.j=substr(opers,j,1)
         end
finds=0                      /*number of found solutions (so far).  */
x.=0                         /*a method to hold unique expressions. */
indent=left('',30)           /*used to indent display of solutions. */
                             /*alternative:  indent=copies(' ',30)  */
Lpar='('                     /*a string to make REXX code prettier. */
Rpar=')'                     /*ditto.                               */
 
  do g=start to finish       /*process a (possible) range of values.*/
  if pos(0,g)\==0 then iterate   /*ignore values with zero in them. */
 
      do _=1 for 4           /*define a version for fast execution. */
      g._=substr(g,_,1)
      end
 
    do i=1 for ops           /*insert an operator after 1st number. */
      do j=1 for ops         /*insert an operator after 2nd number. */
        do k=1 for ops       /*insert an operator after 2nd number. */
          do m=0 to 4-1
          L.=''              /*assume no left parenthesis so far.   */
            do n=m+1 to 4    /*match left paren with a right paren. */
            L.m=Lpar         /*define a left paren, m=0 means ignore*/
            R.=''            /*un-define all right parenthesis.     */
            if m==1 & n==2 then L.=''   /*special case:  (n)+ ...   */
                           else if m\==0 then R.n=Rpar  /*no (, no )*/
            e=L.1 g.1 o.i L.2 g.2 o.j L.3 g.3 R.3 o.k g.4 R.4
            e=space(e,0)     /*remove all blanks from the expression*/
 
                             /*(below) change expression:           */
                             /*       /(yyy)   ===>   /div(yyy)     */
                             /*Enables to check for division by zero*/
            origE=e          /*keep old version for the display.    */
            if pos('/(',e)\==0 then e=changestr('/(',e,"/div(")
                             /*The above could be replaced by:      */
                             /*   e=changestr('/(',e,"/div(")       */
 
                                 /*INTERPRET stresses REXX's groin, */
                                 /*so try to avoid repeated lifting.*/
            if x.e then iterate  /*was the expression already used? */
            x.e=1                /*mark this expression as unique.  */
                                 /*have REXX do the heavy lifting.  */
            interpret 'x='e
            x=x/1                /*remove trailing decimal points.  */
            if x\==24 then iterate        /*Not correct?  Try again.*/
            finds=finds+1        /*bump number of found solutions.  */
            _=translate(origE,'][',")(")       /*show  [],  not  ().*/
            say indent 'a solution:' _         /*display a solution.*/
            end   /*n*/
          end     /*m*/
        end       /*k*/
      end         /*j*/
    end           /*i*/
  end             /*g*/
 
sols=finds
if sols==0 then sols='No'    /*make the sentence not so geek-like.  */
say
say sols 'unique solution's(finds) "found for" orig     /*pluralize.*/
exit
/*---------------------------DIV subroutine-------------------------*/
div: procedure; parse arg q  /*tests if dividing by  0  (zero).     */
if q=0 then q=1e9            /*if dividing by zero, change divisor. */
return q                     /*changing Q invalidates the expression*/
/*---------------------------GER subroutine-------------------------*/
ger: say; say '*** error! ***'; if _\=='' then say 'guess=' _
say arg(1)
say
exit 13
/*---------------------------validate subroutine--------------------*/
validate: parse arg _
digs=123456789               /*numerals (digits) that can be used.  */
if _==''         then call ger 'no digits entered.'
if length(_)<4   then call ger 'not enough digits entered, must be 4'
if length(_)>4   then call ger 'too many digits entered, must be 4'
if pos(0,_)\==0  then call ger "can't use the digit  0 (zero)"
_=verify(_,digs)
return
/*---------------------------S subroutine---------------------------*/
s:if arg(1)=1 then return ''; return 's'        /*simple pluralizer.*/

