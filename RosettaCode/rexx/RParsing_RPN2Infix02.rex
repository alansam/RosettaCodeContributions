/*REXX program converts Reverse Polish Notation (RPN) ──> infix notation*/
?L = 'ce93'x -- Γ == Gamma
?R = 'CE94'x -- Δ == Delta
showAction = 1                         /*  0  if no showActions wanted. */
       !sp = 0                         /*initialize stack pointer to 0. */
       !oS = '+ - / * ^'               /*operator symbols.              */
       !oP = '2 2 3 3 4'               /*operator priorities.           */
       !oA = ?L ?L ?L ?L ?R            /*operator associations.         */
say  "infix: " toInfix( "3 4 2 * 1 5 - 2 3 ^ ^ / +" )
say  "infix: " toInfix( "1 2 + 3 4 + ^ 5 6 + ^" )       /* [Y]  Deutsch.*/
say  "infix: " toInfix( "Mond Sterne Schlamm + * Feur Suppe * ^" )
exit                                   /*stick a fork in it, we're done.*/

/*──────────────────────────────────────────────────────────────────────*/
ppop:
  !pop = !sp
  !sp  = !sp - 1
  return a_.!pop
ppush:
  !sp = !sp + 1
  a_.!sp = arg(1)
  return

/*──────────────────────────────────────────────────────────────────────*/
stack2str:
  s_ = ''
  do j_ = 1 for !sp
    t_ = a_.j_
    y_ = left(t_, 1)
    if pos(' ', t_) == 0 then t_ = '{'strip(substr(t_, 2))"}"
    else                      t_ = substr(t_, 2)
    s_ = s_ '{'strip(y_ t_)"}"
    end j_
return space(s_)

/*──────────────────────────────────────────────────────────────────────*/
toInfix:
  parse arg rpn
  say copies('─', 80 - 1)
  say 'RPN: ' space(rpn)
  ?Y = 'C2A5'x -- ¥ == Yen
 
  do N_ = 1 to words(RPN)
    ?_ = word(RPN, N_) /*process each of the RPN tokens.*/
    if pos(?_, !oS) == 0 then call ppush ?Y || ?_ /*when in doubt, add a Yen to it.*/
    else do
      g_ = ppop()
      gp = left(g_, 1)
      g_ = substr(g_, 2)
      h_ = ppop()
      hp = left(h_, 1)
      h_ = substr(h_, 2)
      tp = substr(!oP, pos(?_, !oS), 1)
      ta = substr(!oA, pos(?_, !oS), 1)
      if hp < tp | (hp == tp & ta == 'R') then h_ = "("h_")"
      if gp < tp | (gp == tp & ta == 'L') then g_ = "("g_")"
      call ppush tp || h_ ?_ g_
      end
   if showAction then say right(?_, 25) "->" space(translate(stack2str(),, ?Y))
   end N_

return space(translate(substr(ppop(), 2),, ?Y))

