/* Rexx */

bools = 'TRUE FALSE'
TRUE  = (1 == 1)
FALSE = \TRUE

ranges = 0 100 0 1000 -- 9990 10000
loop while ranges~words() > 0
  parse var ranges v1 v2 ranges
  limit = 1000~max(v2)
  numeric digits 200~max(2 * limit)
  probablePrimes = ''
  loop n = v1 to v2
    if isProbablePrime(n, 10) then do
      probablePrimes = probablePrimes n
      end
    end n
  probablePrimes = probablePrimes~space()
  say 'Found' probablePrimes~words() 'probable primes in the range' v1'-'v2
  say changestr(',', space(probablePrimes, 1, ','), ', ')
  end

return
exit

isProbablePrime:
procedure expose (bools)
--trace ?r;nop
  parse arg n, k
  isProbablePrime = FALSE
  if n = 2 then isProbablePrime = TRUE -- special case
  if n > 2 & n // 2 \= 0 then do       -- ensure n is odd
    d = n - 1
    s = 0

    loop while d // 2 = 0
      s = s + 1
      d = d % 2
      end

    loop L00P = 1 for k
      isProbablePrime = TRUE
      a = random(2, n)
      x = (a ** d) // n
      if x = 1 | x = n - 1 then iterate L00P
      loop L11P = 1 for s - 1
        x = (x * x) // n
        if x = 1 then do
          isProbablePrime = FALSE
          leave L00P
          end
        if x = n - 1 then
          iterate L00P
        end L11P
        isProbablePrime = FALSE
      end L00P
    end
  return isProbablePrime

mod:
procedure
  parse arg N, D
  return (D + (N // D)) // D

divmod:
procedure
  parse arg N, D
  dv = N % D
  mv = mod(N, D)
  return dv mv

true_false:
procedure
  parse arg bval .
  if bval then rval = 'True'
  else         rval = 'False'
  return rval

