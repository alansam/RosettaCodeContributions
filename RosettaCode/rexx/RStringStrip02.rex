/* REXX ***************************************************************
* If source and stripchars don't contain a hex 00 character, this works
* 06.07.2012 Walter Pachl
**********************************************************************/
Say 'Sh ws  soul strppr. Sh took my hrt! -- expected'
Say stripchars("She was a soul stripper. She took my heart!","aei")
Exit
stripchars: Parse Arg string,stripchars
sc=findSubstitiutionCharacter(string)
result=translate(string,sc,' ')         /* turn blanks into '00'x   */
result=translate(result,' ',stripchars) /* turn stripchars into ' ' */
result=space(result,0)                  /* remove all blanks        */
Return translate(result,' ',sc)         /* '00'x back to blanks     */
findSubstitiutionCharacter: Procedure
Parse Arg string
xr=xrange('00'x, 'ff'x)
ss=''
Do x=1 to length(xr)
  ss=substr(xr,x,1)
  If pos(ss,string) = 0 Then Leave x
  ss=''
  End x
If ss=='' Then Signal SubstitiutionCharacterNotfoundException
Return ss
SubstitiutionCharacterNotfoundException:
Say "Can't do it!"
Exit
