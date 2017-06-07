/*REXX program tests for primality using (kinda smartish) trial division*/
 
parse arg n .                          /*let user choose how many, maybe*/
if n=='' then n=10000                  /*if not, then assume the default*/
p=0                                    /*a count of primes  (so far).   */
                                       /*I like Heinz's 57 varieties... */
  do j=-57 to n                        /*start in the cellar and work up*/
  if \isprime(j) then iterate          /*if not prime, keep looking.    */
  p=p+1                                /*bump the jelly bean counter.   */
  if length(j)>2 then iterate          /*only show two-digit primes.    */
  say right(j,20) 'is prime.'          /*Just blab about the wee primes.*/
  end
 
say
say "there're" p "primes up to" n '(inclusive).'
exit
 
 
/*─────────────────────────────────────ISPRIME subroutine───────────────*/
isprime: procedure; arg x                   /*get the number in question*/
if wordpos(x,'2 3 5 7')\==0 then return 1   /*is it a teacher's pet?    */
if x<2 | x//2==0 | x//3==0  then return 0   /*weed out the riff-raff.   */
                                            /*Note:   //  is modulus.   */
   do j=5 by 6 until j*j>x                  /*skips multiples of three. */
   if x//j==0 | x//(j+2)==0 then return 0   /*do a pair of divides (mod)*/
   end
 
return 1                                    /*I'm exhausted, it's prime!*/

