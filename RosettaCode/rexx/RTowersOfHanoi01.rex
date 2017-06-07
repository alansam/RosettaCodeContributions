/*REXX program to show the moves to solve the Tower of Hanoi (3 disks). */

arg z .
if z=='' then z=3
move=0
moves=2**z-1
call mov 1,3,z
say
say 'The minimum number of moves to solve a' z "ring Tower of Hanoi is" moves'.'
exit

/*─────────────────────────────MOV subroutine───────────────────────────*/
mov: if arg(3)==1 then call dsk arg(1),arg(2)
                  else do
                       call mov arg(1),6-arg(1)-arg(2),arg(3)-1
                       call mov arg(1),arg(2),1
                       call mov 6-arg(1)-arg(2),arg(2),arg(3)-1
                       end
return

/*─────────────────────────────DSK subroutine───────────────────────────*/
dsk: move=move+1
say 'step' right(move,length(moves))":  move disk " arg(1) '-->' arg(2)
return

