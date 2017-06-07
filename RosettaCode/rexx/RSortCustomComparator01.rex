/* REXX ***************************************************************
* Using the powerful methods of ooRexx
* Sample data taken from REXX
* 28.07.2013 Walter Pachl
**********************************************************************/
myArray = .array~of('---The seven deadly sins---',,
                    '===========================',,
  'pride','avarice','wrath','envy','gluttony','sloth','lust');
Call show 'before sort'
myArray~sort
Call show 'after sort'
myArray~sortWith(.mycmp~new)
Call show 'after custom sort'
Exit
 
show:
Parse Arg txt
Say txt
do name over myArray
  say name
  end
Return
 
::CLASS mycmp MIXINCLASS Comparator
::METHOD compare
/**********************************************************************
* shorter string considered higher
* when lengths are equal: caseless 'Z' considered higher than 'X' etc.
* Result:  1  B consider higher than A
*         -1  A consider higher than B
*          0  A==B (caseless)
**********************************************************************/
  Parse Upper Arg A,B
  A=strip(A)
  B=strip(B)
  I = length(A)
  J = length(B)
  Select
    When I << J THEN res=1
    When I >> J THEN res=-1
    When A >> B THEN res=1
    When A << B THEN res=-1
    Otherwise        res=0
    End
  RETURN res
