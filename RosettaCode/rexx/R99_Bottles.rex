/*REXX pgm displays the words to the song "99 Bottles of Beer on the Wall" */
  do j=99 by -1 to 1
  say j 'bottle's(j) "of beer the wall,"
  say j 'bottle's(j) "of beer."
  say 'Take one down, pass it around,'
  n=j-1
  if n==0 then n='no'                         /*cheating to use 0. */
  say n 'bottle's(j-1) "of beer the wall."
  say
  end
 
say 'No more bottles of beer on the wall,'    /*the last verse. */
say 'no more bottles of beer.'
say 'Go to the store and buy some more,'
say '99 bottles of beer on the wall.'
exit
 
s: if arg(1)=1 then return '';   return 's'   /*a simple pluralizer.*/

