/*REXX program snipetts to show a variety (types) of "array" indexing.  */
 
/*REXX arrays aren't true arrays, but can be used (and thought) as such.*/
/*REXX never needs to allocate an array  (indeed, there is no mechanism */
/*                                        in the language to do so.)    */
 
  do j=0 to 100                        /*this "array" starts at zero.   */
  quad.j=j**2                          /*assign J's square-->QUAD array.*/
  end
 
say 'middle number=' quad.50           /*display a use an array element.*/
 
  do k=-99 to +99                      /*this "array" starts at minus 99*/
  box.k=k**3                           /*assign K's  cube --> BOX array.*/
  end
 
                                       /*an example of a sparse array:  */
  do m=0 to 10000 by 10                /*"array" only has odd elements. */
  wierd.m=m**3 - m**2                  /*assign something--> WIERD array*/
  end
 
 
 
/*How to assign a value (such as 0)  to all indexes of an array.        */
g.=1-1                                 /*trying to be fancy, but failing*/
 
    do n=-1e6 to 1e6 by 100
    g.n=sign(n)                        /*assigns -1 to negative elements*/
    end                                /*         1 to positive elements*/
                                       /*         0 to the 0th  element.*/
 
googol=10**100
say g.googol                           /*will show a value of 0 (zero). */
 
 
/*Indexes (or keys) need not be numeric (as in all the examples above). */
 
quad.kk = 'Diplomacy is the art of saying "nice doggy" until you can',
          'find a rock.'               /*a character 2-liner assignment.*/
qwot=quad.kk;  say  qwot        /*show a quote, make user scratch head. */
 
                                /*since   kk   hasn't been defined yet, */
                                /*then the index is  KK  (uppercase, but*/
                                /*it doesn't matter if  KK, kk,  kK,  Kk*/
                                /*is used in the program to refer to it)*/
 
 
veryStrange='box cañon or [canyon]¿'          /*note special characters.*/
                                /*illustrates a very quarky index (key).*/
                                /*this type of index must be the same   */
                                /*case as the "original"  (lowercase).  */
quad.veryStrange=box.10         /*quad's "strange" index <--one-thousand*/
 
 
 
/*For all intents and purposes, stemmed arrays look like arrays in other*/
/*   languages, except that a dot/period (.) is used.                   */
/*   I.E.:     x.2    instead of  (say, the usual):    x(2)             */
/*Although, if you wanted to use that format, you could.  To illustrate:*/
 
x.1=1;   x.2='two';   x.3="3.0 ± 1";      do i=1 to 3;  say x.i;  end
 
  /*another way of using arrays.*/     say x(2)
                                       exit
 
                                       /*further on down in the program.*/
                                            .
                                            .
                                            .
                                       x: procedure expose x.; parse arg i
                                          return x.i
 
/*Note that REXX knows that  x(2) is a function, and  x.2  is a variable*/
 
/*Since all arrays are sparse (or can be),  there doesn't need to be a  */
/*declaritive on the indexes limits (bounds).  Also, there is no limit  */
/*on the number of dimensions of an array.    I.E.:                     */
 
ht=14411;   z='feet';     mt.rainier.12.9.4.6.44.z.12.7.1.0.6.2.2.2.1 = ht

