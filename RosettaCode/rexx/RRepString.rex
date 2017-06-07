/* REXX ***************************************************************
* 11.05.2013 Walter Pachl
**********************************************************************/
--Call repstring '1001110011'
--Call repstring '1110111011'
--Call repstring '0010010010'
--Call repstring '1010101010'
--Call repstring '1111111111'
--Call repstring '0100101101'
--Call repstring '0100100'
--Call repstring '101'
--Call repstring '1'
parse arg samples
if samples = '' then,
  samples = ,
    '1001110011' ,
    '1110111011' ,
    '0010010010' ,
    '1010101010' ,
    '1111111111' ,
    '0100101101' ,
    '0100100' ,
    '101' ,
    '1'

do w_ = 1 to words(samples)
  Call repstring word(samples, w_)
  end
return
Exit
 
repstring:
Parse Arg s
maxlen = max(length(''''s''''), 20)
sq=right(''''s'''', maxlen)
n=length(s)
Do l=length(s)%2 to 1 By -1
  If substr(s,l+1,l)=left(s,l) Then Leave
  End
If l>0 Then Do
  rep_str=left(s,l)
  Do i=1 By 1
    If substr(s,i*l+1,l)<>rep_str Then
      Leave
    End
  If left(copies(rep_str,n),length(s))=s Then
    Say sq 'has a repetition length of' length(rep_str),
                                                 'i.e.' ''''rep_str''''
  Else
    Say sq 'is not a repeated string'
  End
Else
  Say sq 'is not a repeated string'
Return

