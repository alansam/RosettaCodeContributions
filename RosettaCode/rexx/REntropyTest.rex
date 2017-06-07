/* REXX ***************************************************************
* Test program to compare Versions 1 and 2
* (the latter tweaked to be acceptable by my (oo)Rexx
* and to give the same output.)
* version 1 was extended to accept the strings of the incorrect flag
* 22.05.2013 Walter Pachl (I won't analyze the minor differences)
**********************************************************************/
Call both '1223334444'    
Call both '1223334444555555555'
Call both '122333'
Call both '1227774444'
Call both 'aaBBcccDDDD'
Call both '1234567890abcdefghijklmnopqrstuvwxyz'
Call both 'Rosetta Code'
Exit
both:
  Parse Arg s
  Call REntropy  s
  Call REntropy01 s
  Say ' '
  Return
  
