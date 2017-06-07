/* REXX *************************************************************** 
* Compare the performance of equal vs. strictly equal                   
* 05.07.2012 Walter Pachl                                               
**********************************************************************/ 
Parse Version v                                                        
Say 'eqtest on Rexx Version' v                                         
Say ' Hits Misses test =      Test ==      == improvement'             
Call random 1,10,12345              /* set seed                      */
Do i=1 To 100000                                                       
  x.i=random()                                                         
  End                                                                  
Do rep=1 To 5                                                          
  cnt.=0                                                               
  Call time 'R'                                                        
  Do i=1 To 100000                                                     
    If x.i=999 Then cnt.1=cnt.1+1                                      
                Else cnt.0=cnt.0+1                                     
    End                                                                
  cnt.=0                                                               
  te=time('R')                                                         
  Do i=1 To 100000                                                     
    If x.i==999 Then cnt.1=cnt.1+1                                     
                Else cnt.0=cnt.0+1                                     
    End                                                                
  tse=time('E')                                                        
  Say right(cnt.0,5) right(cnt.1,5),                                   
      format(te,2,8) format(tse,2,8) format((100*(te-tse)/te),3,8)'%'  
  End

