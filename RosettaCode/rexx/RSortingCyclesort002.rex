/*REXX program demonstrates a  cycle sort  on a  list of items.         */
parse arg z                            /* [↓] not specified?  Use π digs*/
if z = '' then z = -3.14 3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6 2 6 4 3 3 8 3 2 7 9 5 0 2 8 8 4
say 'unsorted list: '  z               /*show the original unsorted #s. */
w = sortCycle(z)                         /*W: the # of writes done in sort*/
say 'and took'  w  'writes.'           /*show # of writes done in sort. */
exit                                   /*stick a fork in it, we're done.*/

/*──────────────────────────────────SORTCYCLE subroutine────────────────*/
sortCycle:
  procedure expose A_.;
  parse arg y;
  H_ = words(y);
  writes = 0
  do i = 1 for H_;
    A_.i = word(y, i);
    end  /*i*/     /*put items ───► A_.*/
                                       /* [↓]  find cycles to rotate.   */
  do c = 1 for H_;
    x = A_.c;
    p = c /*X  is the  item  being sorted. */
      do j = c + 1 to H_;
        if A_.j < x then p = p + 1;
          end      /*where to put X.*/
  if p == c then  iterate                /*Is it there? This ain't a cycle*/
    do while x == A_.p;
      p = p + 1;
      end /*put X right after any duplicate*/
  parse value A_.p x with x A_.p         /*swap the two values: A_.p and X.*/
  writes = writes + 1                      /*bump counter for  #  of writes.*/
    do while p \== c;
      p = c          /*rotate the rest of the cycle.  */
      do k = c + 1 to H_;
        if A_.k < x then p = p + 1;
          end  /*k*/
      do while x == A_.p;
        p = p + 1;
        end  /*put X here or right after dups.*/
    parse value A_.p x with x A_.p     /*swap the two values: A_.p and X.*/
    writes = writes + 1                  /*bump counter for  #  of writes.*/
    end   /*while p\==c*/
  end       /*c*/
                                       /* [↓]  display the sorted list. */
U_ = A_.1;
do j = 2 to H_;
  U_ = U_ A_.j;
  end;
  say '  sorted list: '  U_
return writes

