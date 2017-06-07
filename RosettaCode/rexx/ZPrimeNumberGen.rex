/* Rexx */
--trace ?r;nop

numeric digits 20
ranges = 100 1000 5000 10000

et = time('e')
loop n_ = 1 to ranges~words()
  v_ = ranges~word(n_)
  pl = pg1(v_)
  pf = pl~words()
  say 'Found' pf 'primes in the range' 1 'to' v_
  et = time('r')
  say et
  say pl~space(1, ',')~changestr(',', ', ')
  say
  pl = pg2(v_)
  pf = pl~words()
  say 'Found' pf 'primes in the range' 1 'to' v_
  et = time('r')
  say et
  say pl~space(1, ',')~changestr(',', ', ')
  say
  pl = pg3(v_)
  pf = pl~words()
  say 'Found' pf 'primes in the range' 1 'to' v_
  et = time('r')
  say et
  say pl~space(1, ',')~changestr(',', ', ')
  say
  end n_

return
exit

-- ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
-- simple prime number generator
pg1:
procedure
  parse arg lim
  T = (1 == 1)
  F = \T
  pp = 2
  ps = pp
  loop while pp < lim
    pp = pp + 1
    pn = T
    loop p_ = 1 to ps~words()
      pq = ps~word(p_)
      if (pp // pq) = 0 then do
        pn = F
        leave p_
        end
      end p_
      if pn then
        ps = ps pp
    end
    ps~space()
  return ps

-- ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
-- simple prime number generator optimized to bypass all even numbers
pg2:
procedure
  parse arg lim
  T = (1 == 1)
  F = \T
  pp = 3
  ps = 2 3
  loop while pp + 2 < lim
    pp = pp + 2
    pn = T
    loop p_ = 1 to ps~words()
      pq = ps~word(p_)
      if (pp // pq) = 0 then do
        pn = F
        leave p_
        end
      end p_
      if pn then
        ps = ps pp
    end
    ps~space()
  return ps

-- ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
-- simple prime number generator optimized to bypass all even numbers
-- and limit the testing process to only checking if the potential prime
-- can be factored by those primes less than or equal to the square root
-- of the potential prime, since primes larger than the square root
-- of the potential prime will be complementary factors of at least one
-- prime less than the square root of the potential prime.
pg3:
procedure
  parse arg lim
  T = (1 == 1)
  F = \T
  pp = 3
  ps = 2 3
  loop while pp + 2 < lim
    pp = pp + 2
    pn = T
    sqrtpp = sqrt(pp)
    loop p_ = 1 to ps~words()
      pq = ps~word(p_)
      if pq > sqrtpp then
        leave p_
      if (pp // pq) = 0 then do
        pn = F
        leave p_
        end
      end p_
      if pn then
        ps = ps pp
    end
    ps~space()
  return ps

/* ------------------------------------------------------------- */
sqrt:
procedure
  arg num                             /* get the number          */
  xnew = 0
  if num > 0 then do                  /* check for 0             */
    xnew = num                        /* initialize answer       */
                                      /* calculate maximum       */
    eps = 0.5 * 10 ** (1 + fuzz() - digits()) /* accuracy        */
    /* Loop until a sufficiently accurate answer is obtained.    */
    do until abs(xold - xnew) < (eps * xnew)
      xold = xnew                     /* save the old value      */
      xnew = 0.5 * (xold + num / xold) /* calculate the new      */
    end
    xnew = xnew / 1                   /* strip unnecessary zeros */
    end
  return xnew

