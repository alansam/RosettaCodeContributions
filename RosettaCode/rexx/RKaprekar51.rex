/*REXX program to generate  Kaprekar  numbers using cast-out-nines test.*/
/*┌────────────────────────────────────────────────────────────────────┐
  │ generate (any maybe show)   Kaprekar   numbers  (and their count). │
  │                                                                    │
  │ Kaprekar numbers were thought of by the mathematician from India,  │
  │ Shri Dattathreya Ramachardra Kaprekar  (1905-1986).                │
  └────────────────────────────────────────────────────────────────────┘*/
call kaprekar    10000                 /*gen Kaprekar #s and &    echo #*/
call kaprekar -1000000                 /*gen Kaprekar #s and & no echo #*/
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────Kaprekar subroutine─────────────────*/
kaprekar:
procedure
  arg limit
  nd = 2 * length((limit + 1) ** 2)
  numeric digits max(10, nd)    /*ensure enough digs for power 2.*/
  HH = 0

  --if 1 <= abs(limit)  then call tell 1
  call tell 1

  do j = 2 to abs(limit) - 1
    s = j * j
    if j // 9 \== s // 9 then iterate j    /*didn't pass cast-out-9s test ? */
                                           /*cast-out-9s test is much faster*/
    do k = 1  for  length(s) % 2
      if j == left(s, k) + substr(s, k + 1) then call tell j      /*Eureka! */
      end k
    end j

  say center("There are" HH 'Kaprekar numbers below' abs(limit)".", 79, '=')
  say
  return

/*──────────────────────────────────TELL subroutine─────echoHH if limit>0*/
tell:
  HH = HH + 1
  if limit > 0 then say right(arg(1), length(limit))
  return

