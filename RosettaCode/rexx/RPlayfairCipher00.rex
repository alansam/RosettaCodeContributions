/*REXX program implements a  PLAYFAIR cipher  (encryption & decryption).*/
parse arg key . 1 oldK omit _ . '(' text /*TEXT is the phrase to be used*/
if key =='' | key ==','  then do; key='Playfair example.'; oldK=key "   <---using the default."; end
if omit=='' | omit==','  then omit='J' /*the  "omitted"  character.     */
if text=''               then text='Hide the gold in the tree stump!!'   /*default.*/
newKey =scrub(key   ,1)                /* "    "    "       "       "   */
newText=scrub(text)                    /* "    "    "       "       "   */
if    _\==''             then call err 'too many arguments specified.'
if newText==''           then call err 'TEXT is empty or has no letters'
if length(omit)\==1      then call err 'OMIT letter must be only one letter'
if \datatype(omit,'M')   then call err 'OMIT letter must be a Latin alphabet letter.'
if pos(omit,newText)\==0 then call err 'TEXT can''t contain the "OMIT" character: ' omit
upper omit                             /*uppercase the  OMIT  character.*/
fill=space(translate('ABCDEFGHIJKLMNOPQRSTUVWXYZ',,omit),0) /*elide omit*/
xx='X';     if omit==xx  then xx='Q'   /*char used for double characters*/
if length(newKey)<3      then call err 'cipher key is too short, must be > 2 unique characters.'
fill=space(translate(fill,,newKey),0)  /*remove any cipher characters.  */
grid=left(newKey || fill,26)           /*use only the first 25 chars.   */
say '   old  cipher: ' strip(oldK)     ; padL=14+2;   pad=left('',padL)
say '   new  cipher: ' newKey          ; padX=left('',padL,'=')
say '     omit char: ' omit
say '   double char: ' xx
say ' original text: ' strip(text)
say '     new  text: ' newText
#=0
     do row   =1  for 5          /*build grid  (individual cells).*/
        do col=1  for 5;     #=#+1;       @.row.col=substr(grid,#,1)
        if row==1  then      @.0.col=@.1.col
        if col==5  then do;  @.row.6=@.row.1;  @.row.0=@.row.5;  end
        if row==5  then do;  @.6.col=@.1.col;  @.0.col=@.5.col;  end
        end   /*col*/
     end      /*row*/
 
cText=.Playfair(newText, 1);           call show 'cipher'  , cText
pText=.Playfair(cText     );           call show 'plain'   , pText
qText=space(translate(pText,,xx),0)    /*remove char used for "doubles."*/
if length(qText)\==length(pText)  then call show 'possible', qText
say ' original text: ' newText;   say  /*··· and show the original text.*/
if qtext==newText  then say padx 'Playfair encryption->decryption->encryption worked.'
exit                                   /*stick a fork in it, we're done.*/
/*----------------------------------one-line subroutines---------------------------*/
@@:    parse arg Xrow,Xcol;                         return  @.Xrow.Xcol
err:   say;   say '***error!***'  arg(1);           say;    exit 13
LR:    rowL=row(left(__,1)); colL=_; rowR=row(right(__,1)); colR=_; return length(__)
row:   ?=pos(arg(1),grid);        _=(?-1)//5+1;     return  (4+?)%5
show:  arg x,y; say; say right(x 'text: ',padL) digram(y); say pad space(y,0); return
/*----------------------------------SCRUB subroutine--------------------*/
scrub: procedure;  arg xxx,unique; xxx=space(xxx,0)  /*ARG caps all args*/
$=;       do j=1  for length(xxx);     _=substr(xxx,j,1)
          if unique==1  then  if  pos(_,$)\==0  then iterate   /*unique?*/
          if datatype(_,'M')  then $=$||_     /*only use Latin letters. */
          end   /*j*/
return $
/*----------------------------------DIGRAM subroutine-------------------*/
digram: procedure;  parse arg x;  $=;      do j=1  by 2  to length(x)
                                           $=$ || substr(x,j,2)' '
                                           end   /*j*/
return strip($)
/*----------------------------------.PLAYFAIR subroutine----------------*/
.Playfair: arg T,encrypt;        i=-1;    if encrypt==1  then i=1;      $=
        do k=1  while  i==1;     _=substr(T,k,1);     if _==' '  then leave
        if _==substr(T,k+1 ,1)   then T=left(T,k) || xx || substr(T,k+1)
        end   /*k*/
  do j=1  by 2  to length(T);    __=strip(substr(T,j,2))
  if LR()==1  then __=__ || xx;  call LR    /*append X or Q char, rule 1*/
    select
    when rowL==rowR  then __=@@(rowL,  colL+i)@@(rowR,  colR+i) /*rule 2*/
    when colL==colR  then __=@@(rowL+i,colL  )@@(rowR+i,colR)   /*rule 3*/
    otherwise             __=@@(rowL,  colR  )@@(rowR,  colL)   /*rule 4*/
    end   /*select*/
  $=$ || __
  end   /*j*/
return $

