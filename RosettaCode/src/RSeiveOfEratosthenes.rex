/*REXX program, generate primes via sieve of Eratosthenes algorithm*/
 
highItem=200                           /*define ten score of #'s.  */
widthH=length(highItem)                /*width of biggest element#.*/
a.=1                                   /*assume all numbers prime. */
a.1=0                                  /*special case for unity, by*/
                                       /*definition, 1 isn't prime.*/
 
  do j=2 to highItem                   /*starting @ 2, strike mult.*/
  if j*j>highItem then leave           /*process up to û(highItem).*/
  if \a.j then iterate                 /*this number isn't prime,  */
                                       /*it was marked as not prime*/
 
    do k=j+j to highItem by j          /*start with next multiple. */
    a.k=0                              /*mark J multiple not prime.*/
    end   /*k*/
 
  end     /*j*/
 
np=0                                   /*number of primes so far.  */
 
  do q=1 for highItem                  /*list all the primes found.*/
  if a.q then do
              np=np+1                  /*bump the prime count.     */
              if np>1000 then iterate  /*only list up to 1k primes.*/
              say 'prime number' right(np,widthH) "is" right(q,widthH)
              if np==1000 then say 'Prime number listing truncated.'
              end
  end   /*q*/
 
say np 'prime numbers found up to' highItem

