/*REXX pgm interactively plays a game of  "Bulls & Cows"  with  CBLs.   */
                                    /* [CBLs = Carbon Based Lifeforms.] */
?=getRand()                         /*get a random 4-numeral (digit) num*/
 
         do forever                 /*play until guessed or enters QUIT */
         if getN()==? then leave    /*the CBL guessed (or deduced)  "?".*/
         call scorer                /*tell CBL the number of bulls&cows.*/
         call sy "You got" bulls 'bull's(bulls) "and" cows 'cow's(cows)"."
         end   /*forever*/
say
say "         ┌─────────────────────────────────────────┐"
say "         │                                         │"
say "         │  Congratulations, you've guessed it !!  │"
say "         │                                         │"
say "         └─────────────────────────────────────────┘"
say
exit
/*─────────────────────────────────────GETN subroutine──────────────────*/
getN: bulls='[Bulls & Cows game]  '    /*get a guess from the CBL.      */

  do forever
  call sy bulls 'Please enter a four-digit guess   (or QUIT):'
  parse pull n _ .;    nu=n;   upper nu
  if nu=='QUIT' then exit
  if n =='' then do; call ser 'no argument specified.'       ; iterate; end
  if _\=='' then do; call ser 'too many arguments specified.'; iterate; end
  if verify(0,n)==0 then do; call ser 'illegal numeral: 0'   ; iterate; end
  if length(n)<4 then do; call ser 'not enough numerals'     ; iterate; end
  if length(n)>4 then do; call ser 'too many numerals'       ; iterate; end
  _=verify(n,987654321)
  if _\==0 then do; call ser 'illegal character:' substr(n,_,1);iterate;end
  return n
  end   /*forever*/
/*─────────────────────────────────────GETRAND subroutine───────────────*/
getRand: ?='';   do until length(?)==4
                 r=random(1,9)
                 if pos(r,?)\==0 then iterate /*don't allow repeated dig*/
                 ?=? || r
                 end   /*until*/
return ?
/*─────────────────────────────────────SCORER subroutine────────────────*/
scorer: g=?
bulls=0;     do j=1 for 4
             x=substr(n,j,1)
             if x\==substr(g,j,1)  then iterate
             bulls=bulls+1
             g=overlay(' ',g,j)
             end   /*j*/
cows=0
             do k=1 for 4
             cows=cows + (pos(substr(n,k,1),g)\==0)
             end   /*k*/
return
/*─────────────────────────────────────1-liner subroutines──────────────*/
s:    if arg(1)==1  then return ''               ;  return 's'
ser:  call sy '*** error! ***';   call sy arg(1) ;  return
sy:   say;  say arg(1);  say                     ;  return

