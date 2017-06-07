/* Rexx */
/*
version 4
This REXX program version adds all the numbers entered (not just two).
*/

numeric digits 1000             /*just in cast the user gets ka-razy. */
say 'enter some numbers to be summed:'
parse pull xxx
sum=0
w=words(xxx)
                do j=1 for w  
                sum=sum+word(xxx,j)
                end
say 'sum of' w "numbers = " sum/1

