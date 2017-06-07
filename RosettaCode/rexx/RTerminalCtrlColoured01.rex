/*REXX*/parse arg !;if !all(arg()) then exit
 
if \!dos & \!os2 then exit             /*if this isn't DOS,  then exit. */
if \!pcrexx then exit                  /*if this isn't PC/REXX,   exit. */
 
                /* The "real" programs issue all errors through another */
                /* program which has more verbage and explanation, and  */
                /* issues the error text in red  (if color is avaiable).*/
 
color.0  = 'black'
color.1  = 'dark blue'
color.2  = 'dark green'
color.3  = 'dark cyan/turquois'
color.4  = 'dark red'
color.5  = 'dark pink/magenta'
color.6  = 'dark yellow (orange)'
color.7  = 'dark white'
color.8  = 'brite black (grey/gray)'
color.9  = 'bright blue'
color.10 = 'bright green'
color.11 = 'bright cyan/turquois'
color.12 = 'bright red'
color.13 = 'bright pink/magenta'
color.14 = 'bright yellow'
color.15 = 'bright white'
 
         do j=0 to 15                  /*show all sixteen color codes.  */
         call scrwrite ,,'color code=['right(j,2)"]" color.j,,,j;   say
         end                           /*the  "SAY"  forces a  NEWLINE. */
exit                                   /*stick a fork in it, we're done.*/
 
/*═════════════════════════════general 1-line subs══════════════════════*/
!all:!!=!;!=space(!);upper !;call !fid;!nt=right(!var('OS'),2)=='NT';!cls=word('CLS VMFCLEAR CLRSCREEN',1+!cms+!tso*2);if arg(1)\==1 then return 0;if wordpos(!,'? ?SAMPLES ?AUTHOR ?FLOW')==0 then return 0;!call=']$H';call '$H' !fn !;!call=;return 1
!cal:if symbol('!CALL')\=="VAR" then !call=;return !call
!env:!env='ENVIRONMENT';if !sys=='MSDOS'|!brexx|!r4|!roo then !env='SYSTEM';if !os2 then !env='OS2'!env;!ebcdic=1=='f0'x;return
!fid:parse upper source !sys !fun !fid . 1 . . !fn !ft !fm .;call !sys;if !dos then do;_=lastpos('\',!fn);!fm=left(!fn,_);!fn=substr(!fn,_+1);parse var !fn !fn '.' !ft;end;return word(0 !fn !ft !fm,1+('0'arg(1)))
!rex:parse upper version !ver !vernum !verdate .;!brexx='BY'==!vernum;!kexx='KEXX'==!ver;!pcrexx='REXX/PERSONAL'==!ver|'REXX/PC'==!ver;!r4='REXX-R4'==!ver;!regina='REXX-REGINA'==left(!ver,11);!roo='REXX-ROO'==!ver;call !env;return
!sys:!cms=!sys=='CMS';!os2=!sys=='OS2';!tso=!sys=='TSO'|!sys=='MVS';!vse=!sys=='VSE';!dos=pos('DOS',!sys)\==0|pos('WIN',!sys)\==0|!sys=='CMD';call !rex;return
!var:call !fid;if !kexx then return space(dosenv(arg(1)));return space(value(arg(1),,!env))

