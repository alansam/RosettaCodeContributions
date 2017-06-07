/*REXX program shows permutations of '''N''' number of objects (1,2,3, ...).*/
parse arg n .
if n == '' then n = 3     /*Not specified?   Assume default*/
                                       /*populate the first permutation.*/
do pop = 1 for n
  A.pop = pop
  end pop

call tell n

do while nextperm(n, 0)
  call tell n
  end

exit                                   /*stick a fork in it, we're done.*/

/*──────────────────────────────────NEXTPERM subroutine─────────────────*/
nextperm:
procedure expose A.
  parse arg n, i
  nm = n - 1

  do k = nm by -1 for nm
    kp = k + 1
    if A.k < A.kp then do
      i = k
      leave
      end
    end k

  do j = i + 1 while j < n
    parse value A.j A.n with A.n A.j
    n = n - 1
    end j

  if i == 0 then return 0

  do j = i + 1 while A.j < A.i
    end j

  parse value A.j A.i with A.i A.j
  return 1

/*──────────────────────────────────TELL subroutine─────────────────────*/
tell:
procedure expose A.
  _ = ''
  do j = 1 for arg(1)
    _ = _ A.j
    end j
  say _
  return

