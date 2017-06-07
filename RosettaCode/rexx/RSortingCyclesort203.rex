/*REXX program demonstrates a  cycle sort  on a  list of items.         */
parse arg z                            /* [↓] not specified?  Use π digs*/
if z='' then z=-3.14 3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6 2 6 4 3 3 8 3 2 7 9 5 0 2 8 8 4
say 'unsorted list: '  z               /*show the original unsorted #s. */
w=sortCycle(z)                         /*W: the # of writes done in sort*/
say 'and took'  w  'writes.'           /*show # of writes done in sort. */
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────SORTCYCLE subroutine────────────────*/
sortCycle: procedure expose @.;  parse arg y;     #=words(y);   writes=0
        do i=1  for #; @.i=word(y,i); end  /*i*/     /*put items ───► @.*/
                                       /* [↓]  find cycles to rotate.   */
    do c=1  for #;     x=@.c;      p=c /*X  is the  item  being sorted. */
          do j=c+1  to #; if @.j<x  then p=p+1; end    /*where to put X.*/
    if p==c then  iterate              /*Is it there? This ain't a cycle*/
          do p=p  while x==@.p;  end   /*put X right after any duplicate*/
  parse  value  @.p x  with  x @.p     /*swap the two values: @.p and X.*/
  writes=writes+1                      /*bump counter for  #  of writes. */
      do while p\==c;     p=c          /*rotate the rest of the cycle.  */
        do k=c+1  to #;   if @.k<x  then p=p+1;  end  /*k*/
        do p=p  while x==@.p;  end     /*put X here or right after dups.*/
      parse  value  @.p x  with  x @.p /*swap the two values: @.p and X.*/
      writes=writes+1                  /*bump counter for  #  of writes.*/
      end   /*while p\==c*/
  end       /*c*/
                                       /* [↓]  display the sorted list. */
_=@.1;  do j=2  to #; _=_ @.j; end;           say '  sorted list: '  _
return writes
