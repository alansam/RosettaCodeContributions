/* Rexx */

parse arg start finish .               /*get the start and finish years.*/
if  start == '' then  start = 2008     /*None specified?  Assume default*/
if finish == '' then finish = 2121     /*None specified?  Assume default*/

do year = start to finish
  if date('B', year'1225', 'S') // 7 = 6 then do
    say 'December 25th,' year "falls on a Sunday."
    end
  end year

