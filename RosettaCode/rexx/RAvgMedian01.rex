/*REXX program to find the medium of a vector (& displays vector,medium)*/

/*────────vector──────────────────── ───show vector─── ───────show result─────────*/
v='1 9 2 4'                         ;  say 'vector=' v;  say 'medium=' medium(v);  say
v='3 1 4 1 5 9 7 6'                 ;  say 'vector= 'v;  say 'medium=' medium(v);  say
v='3 4 1 -8.4 7.2 4 1 1.2'          ;  say 'vector= 'v;  say 'medium=' medium(v);  say
v='-1.2345678e99 2.3e+700'          ;  say 'vector= 'v;  say 'medium=' medium(v);  say
v='10 9 8 7 6 5 4 3 2 1'            ;  say 'vector= 'v;  say 'medium=' medium(v);  say
v='10 9 8 7 6 5 4 3 2 1 0 0 0 0 .11';  say 'vector= 'v;  say 'medium=' medium(v);  say
v='10 20 30 40 50 -100 4.7 -11e2'   ;  say 'vector= 'v;  say 'medium=' medium(v);  say

exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────MEDIUM subroutine───────────────────*/
medium: procedure;   parse arg x
call makeArray x                       /*make into scaler array (faster)*/
call Esort                             /*(ESORT is an overkill for this)*/
m=@.0%2                                /*      %   is integer division. */
n=m+1
if @.0//2==1 then return @.n           /*(odd?)        //   is  modulus.*/
                  return (@.m+@.n)/2   /*process an even-element vector.*/
/*──────────────────────────────────MAKEARRAY subroutine────────────────*/
makeArray: procedure expose @.;  parse arg v;  @.0=words(v) /*make array*/
              do j=1 for @.0;   @.j=word(v,j);   end
           return
/*──────────────────────────────────ESORT subroutine────────────────────*/
Esort: procedure expose @.;     h=@.0                /*@.0 =  # entries.*/
        do while h>1;           h=h%2                /*cut entries by ½.*/
           do i=1 for @.0-h;    j=i;      k=h+i
              do while @.k<@.j
              parse value  @.j @.k  with  @.k @.j    /*swap two values. */
              if h>=j then leave
              j=j-h;   k=k-h
              end   /*while @.k<@.j*/
           end      /*i*/
        end         /*while h>l*/
return                                      /*exchange sort is finished.*/

