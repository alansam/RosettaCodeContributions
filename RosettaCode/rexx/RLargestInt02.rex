/*REXX pgm constructs largest integer  from a list  using concatenation.*/
a_.  = ''                               /*used to signify  end-of-lists. */
a_.1 = '1 34 3 98 9 76 45 4'
a_.2 = '54 546 548 60'
                                       /* [↓] process all the lists.    */
do j = 1 while a_.j \== ''
  s_ = ''      /*keep truckin' until exausted.  */
  z = space(a_.j)

  do while z \== ''                /*examine each number in the list*/
    big = word(z, 1)
    index = 1          /*assume first number is biggest.*/

    do k = 2 to words(z)
      x = word(z, k)     /*get an integer.*/
      L = max(length(big), length(x))                 /*get max length.*/
      if left(x, L, left(x, 1)) <<= left(big, L, left(big, 1)) then iterate
      big = x
      index = k           /*we found a new biggie (& index)*/
      end k

    z = strip(delword(z, index, 1))    /*remove the  "maximum" from list*/
    s_ = s_ || big                       /*append the  "maximum"  number. */
  end      /*while*/

  say right(s_, 30)   ' max for: '   a_.j /*show the "max" integer and list*/
  end j
                                     /*stick a fork in it, we're done.*/

