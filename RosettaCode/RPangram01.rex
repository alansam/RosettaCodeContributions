/*REXX program to check if a string (sentence) is a pangram.        */
 
  abc = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
 
  Do forever                 /*keep promting until a null or blank. */
    Say
    Say '----- Please enter a pangramic sentence:'
    Say
    pull y
    If y = '' then Leave
    ? = verify(abc, y)            /*see if all letters are present.      */
 
    If ? == 0 then Say 'Sentence is a pangram.'
              else Say "Sentence isn't a pangram, missing:" substr(abc, ?, 1)
    Say
    End
 
  Say '----- PANGRAM program ended. -----'

