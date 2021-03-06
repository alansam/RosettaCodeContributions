/*REXX program finds words with the largest set of anagrams (same size).*/
/* Standardization fixup: @ replaced by !, & # by ? in symbol names     */
/* (ooRexx does not permit $, #, @ in symbols. Prefer _, !, ? instead)  */

n.=0                                   /*number of anagrams for word X. */
a.=''                                  /*          anagrams for word X. */
parse arg ifid .
if ifid = '' then
  ifid='unixdict.txt'                  /*input file identifier.         */
             do j=1 while lines(ifid)
             !.j=linein(ifid)
             end
words=j-1                              /*number of words in dictionary. */
say copies('-',20) words 'words in the dictionary file:' ifid
 
  do j=1 for words                     /*process the words in dictionary*/
  x=!.j; Lx=length(x); if Lx<3 then iterate  /*onezys & twozys can't win*/
  notHas.=1
         do i=1 for Lx                 /*build fast way to compare chars*/
         _=substr(x,i,1);  notHas._=0  /*indicate this char is in word X*/
         end
    do k=1 for words                   /*plow through the other words.  */
    if length(!.k)\==Lx then iterate   /*Y length isn't right, skip it. */
    y=!.k
           do m=Lx by -1 for Lx        /*see if all Y chars are in X.   */
           _=substr(y,m,1)             /*(backwards is faster.)         */
           if notHas._ then iterate k  /*if doesn't have it, skip word. */
           end
    xx=x                               /*make a throwaway copy of  X.   */
         do p=1 for Lx                 /*discount dup chars not in  X.  */
         _=pos(substr(y,p,1),xx)       /*find position of the char in X.*/
         if _==0 then iterate k        /*Not there?  Must be a duplicate*/
         xx=overlay('0'x,XX,_)         /*replace the char with  '00'x.  */
         end
    if k==j then iterate               /*skip doing anagram on itself.  */
    n.j=n.j+1;  a.j=a.j y              /*bump counter, add --> anagrams.*/
    end   /*k*/
  end     /*j*/
 
mA=n.j
 do j=2 to words;  mA=max(mA,n.j);  end      /*find maximum "anagrams". */
 do k=1 for words;  if n.k==mA & word(a.k,1)>!.k then say !.k a.k;  end

/*
output
-------------------- 25104 words in the dictionary file: unixdict.txt
abel  able bale bela elba
alger  glare lager large regal
angel  angle galen glean lange
caret  carte cater crate trace
elan  lane lean lena neal
evil  levi live veil vile
*/

