/*REXX program demonstrates Amd operator (choosing 4 words from 4 sets).*/
/* Standardization fixup: @ replaced by !, & # by ? in symbol names */
/* (ooRexx does not permit $, #, @ in symbols. Prefer _, !, ? instead) */
/*
The example didn't say so, but an assumption made (for this program)
that lowercase and uppercase letters are considered to be a match.
*/
 
!.=''                                  /*default value for any # of sets*/
!.1="the that a"
!.2="frog elephant thing"
!.3="walked treaded grows"
!.4="slowly quickly"
 
  do j=1 until !.j==''; end;  !.0=j-1  /*find how many sets there are.  */
                                       /*!.0   contains number of sets. */
call Amb 1                             /*find combo of words that works.*/
exit
 
/*─────────────────────────────────────AMB procedure────────────────────*/
Amb: procedure expose !.; parse arg ? _; arg . u; if ?=='' then return
if ?>!.0 then do; if u=='' then return
              w=word(u,1)              /*(Below) use upper case version.*/
                   do n=2 to words(_)
                   c=word(u,n); if left(c,1)\==right(w,1) then return; w=c
                   end
              say strip(_)             /*_ has an extra leading blank.  */
              end
  do j=1 for words(!.?)
  call amb ?+1 _ word(!.?,j)           /*generate the next combination. */
  end
return

