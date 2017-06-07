/*REXX pgm shows a method to track history of assignments to a REXX var.*/
varset!.=0                             /*initialize the whole shebang.  */
 
call varset 'fluid',min(0,-5/2,-1)     ; say 'fluid=' fluid
call varset 'fluid',3.14159            ; say 'fluid=' fluid
call varset 'fluid',' Santa  Claus'    ; say 'fluid=' fluid
  
call varset 'fluid',,999
say 'There were' result "assignments (sets) for the FLUID variable."
exit
/*─────────────────────────────────────VARSET subroutine────────────────*/
varset: arg ?x; parse arg ?z,?v,?L     /*varName, value, optional-List. */
 
if ?L=='' then do                      /*not list, so set the X variable*/
               ?_=varset!.0.?x+1       /*bump the history count (SETs). */
               varset!.0.?x=?_         /* ... and store it in "database"*/
               varset!.?_.?x=?v        /* ... and store the  SET  value.*/
               call value(?x),?v       /*now, set the real  X  variable.*/
               return ?v               /*also, return the value for FUNC*/
               end
say                                    /*show blank line for readability*/

  do ?j=1 to ?L while ?j<=varset!.0.?x      /*list history of the sets. */
  say 'history entry' ?j "for var" ?z":" varset!.?J.?x
  end

return ?j-1                            /*return the num of assignments. */

/*
output:

fluid= -2.5
fluid= 3.14159
fluid=  Santa  Claus

history entry 1 for var fluid: -2.5
history entry 2 for var fluid: 3.14159
history entry 3 for var fluid:  Santa  Claus
There were 3 assignments (sets) for the FLUID variable.
*/

