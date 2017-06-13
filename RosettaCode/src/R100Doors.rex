/* Rexx */

Do
  dlm = '-'~left(80, '-')
  Say dlm
  Call Sample1
  Say

  Say dlm
  Call Sample2
  Say

  Return
End
Exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Sample1:
Procedure
Do
  door. = 0
  Do inc = 1 to 100
    Do d_ = inc to 100 by inc
      door.d_ = \door.d_
      End d_
    End inc
  Say "The open doors after 100 passes:"

  Do i_ = 1 to 100
    If door.i_ = 1 then Do
      Say i_~right(5)
      End
    End i_

  Return
End
Exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Sample2:
Procedure
Do
  /*REXX program to solve the 100 door puzzle, the hard-way version.  */
 
  Parse arg doors .               /*get the first argument (# of doors.) */
  If doors == '' then,
    doors = 100                   /*not specified?  Then assume 100 doors*/

                                    /*   0 = closed.  */
                                    /*   1 = open.    */
  door. = 0                       /*assume all that all doors are closed.*/
 
  Do j_ = 1 for doors             /*process a pass-through for all doors.*/
    Do k_ = j_ by j_ to doors     /* ... every Jth door from this point. */
      door.k_ = \door.k_          /*toggle the  "openness"  of the door. */
      End k_
    End j_
 
  Say
  Say 'After' doors "passes, the following doors are open:"
  Say
 
  Do n_ = 1 for doors
    If door.n_ then Do
      Say right(n_, 20)
      End
    End n_
  Say

  Return
End
Exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

