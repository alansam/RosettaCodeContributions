/*REXX program implements a  PLAYFAIR cipher  (encryption & decryption).*/
trace ?r;nop
parse arg key . 1 oldK omit U_ . '(' text /*TEXT is the phrase to be used*/
if key == '' | key == ',' then do
  key = 'Playfair example.'
  oldK = key "   <---using the default."
  end
if omit == '' | omit == ',' then omit = 'J' /*the  "omitted"  character.     */
if text = ''                then text = 'Hide the gold in the tree stump!!'   /*default.*/
newKey  = scrub(key, 1)                  /* "    "    "       "       "   */
newText = scrub(text)                    /* "    "    "       "       "   */
if U_ \== ''                then call err 'too many arguments specified.'
if newText == ''            then call err 'TEXT is empty or has no letters'
if length(omit) \== 1       then call err 'OMIT letter must be only one letter'
if \datatype(omit, 'M')     then call err 'OMIT letter must be a Latin alphabet letter.'
if pos(omit, newText) \== 0 then call err 'TEXT can''t contain the "OMIT" character: ' omit
parse upper var omit omit                             /*uppercase the  OMIT  character.*/
fill = space(translate('ABCDEFGHIJKLMNOPQRSTUVWXYZ',, omit), 0) /*elide omit*/
xx = 'X'
if omit == xx then xx = 'Q'   /*char used for double characters*/
if length(newKey) < 3 then call err 'cipher key is too short, must be > 2 unique characters.'
fill = space(translate(fill,, newKey), 0)  /*remove any cipher characters.  */
grid = left(newKey || fill, 26)           /*use only the first 25 chars.   */
say '   old  cipher: ' strip(oldK)
padL = 14 + 2
pad  = left('', padL)
say '   new  cipher: ' newKey
padX = left('', padL, '=')
say '     omit char: ' omit
say '   double char: ' xx
say ' original text: ' strip(text)
say '     new  text: ' newText
H_ = 0
do row = 1 for 5          /*build grid  (individual cells).*/
  do col = 1 for 5
    H_ = H_ + 1
    A_.row.col = substr(grid, H_, 1)
    if row == 1 then A_.0.col = A_.1.col
    if col == 5 then do
      A_.row.6 = A_.row.1
      A_.row.0 = A_.row.5
      end
    if row == 5 then do
      A_.6.col = A_.1.col
      A_.0.col = A_.5.col
      end
    end col
  end row

cText = .Playfair(newText, 1)
call show 'cipher', cText
pText = .Playfair(cText)
call show 'plain', pText
qText = space(translate(pText,, xx), 0)    /*remove char used for "doubles."*/
if length(qText) \== length(pText) then call show 'possible', qText
say ' original text: ' newText
say  /*··· and show the original text.*/
if qtext == newText then say padx 'Playfair encryption->decryption->encryption worked.'
exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------one-line subroutines---------------------------*/
getA_:
  parse arg Xrow, Xcol
  return  A_.Xrow.Xcol

err:
  say
  say '***error!***' arg(1)
  say
  exit 13

LR:
  rowL = row(left(UU_, 1))
  colL = U_
  rowR = row(right(UU_, 1))
  colR = U_
  return length(UU_)

row:
  Q_ = pos(arg(1), grid)
  U_ = (Q_ - 1) // 5 + 1
  return  (4 + Q_) % 5

show:
  arg x_, y_
  say
  say right(x_ 'text: ', padL) digram(y_)
  say pad space(y_, 0)
  return

/*----------------------------------SCRUB subroutine--------------------*/
scrub:
procedure
  arg xxx, unique
  xxx = space(xxx, 0)  /*ARG caps all args*/
  S_ = ''
  do j_ = 1 for length(xxx)
    U_ = substr(xxx, j_, 1)
    if unique == 1 then if pos(U_, S_) \== 0 then iterate   /*uniqueQ_*/
    if datatype(U_, 'M') then S_ = S_ || U_     /*only use Latin letters. */
    end j_
  return S_

/*----------------------------------DIGRAM subroutine-------------------*/
digram:
procedure
  parse arg x_
  S_ = ''
  do j_ = 1 by 2 to length(x_)
    S_ = S_ || substr(x_, j_, 2)' '
    end j_
  return strip(S_)

/*----------------------------------.PLAYFAIR subroutine----------------*/
.Playfair:
  arg T, encrypt
  i_ = -1
  if encrypt == 1 then i_ = 1
  S_ = ''
  do k_ = 1 while i_ == 1
    U_ = substr(T, k_, 1)
    if U_ == ' ' then leave
    if U_ == substr(T, k_ + 1, 1) then T = left(T, k_) || xx || substr(T, k_ + 1)
    end k_
  do j_ = 1 by 2 to length(T)
    UU_ = strip(substr(T, j_, 2))
    if LR() == 1 then UU_ = UU_ || xx
      call LR                          /*append X or Q char, rule 1*/
    select
      when rowL == rowR then
        UU_ = getA_(rowL, colL + i_)getA_(rowR, colR + i_) /*rule 2*/
      when colL == colR then
        UU_ = getA_(rowL + i_, colL)getA_(rowR + i_, colR) /*rule 3*/
      otherwise
        UU_ = getA_(rowL, colR)getA_(rowR, colL)           /*rule 4*/
      end /*select*/
    S_ = S_ || UU_
    end j_
  return S_

