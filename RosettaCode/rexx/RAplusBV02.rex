/* Rexx */
/*
version 2, normalizied
If the user entered 4.00000 and wanted to add 5 to that, and expects 9, 
then the output needs to be normalized before displaying the result. 
Normally, REXX will keep the greatest precision in the results; 
adding 4.00000 and 5 will yield 9.00000
*/

parse pull a b
say (a+b)/1              /*dividing by 1 normalizes the REXX number.*/

