/*REXX program generates primes via  sieve of Eratosthenes  algorithm.  */
parse arg highest .
if highest == '' then highest = 200                            /*define highest number to use.  */
call time 'e'
primes. = 1                                   /*assume all numbers are prime.  */
w = length(highest)                      /*width of the biggest number,   */
                                       /*  it's used for aligned output.*/
      loop j = 2 to highest                /*strike multiples of integers.  */
      if j * j > highest then leave        /*only process up to  √(highest).*/
      if \primes.j then iterate             /*¬ prime?  It was already struck*/
 
             do m = j + j to highest by j  /*start with next multiple of J. */
             primes.m = 0                     /*mark multiples of J not prime. */
             end   m
      end          j
timing = time('r')
primeCount = 0                                    /*prime index, the # of the prime*/
         do n = 2 to highest             /*list all the primes found.     */
         if \primes.n then iterate          /*Not prime?  Then keep looking. */
         primeCount = primeCount + 1                         /*bump the prime count ('til now)*/
         say '           prime number'   right(primeCount, w)   " --> "   right(n, w)
         end   n
say 'Timing:' timing

