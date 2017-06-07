/*REXX program finds the   mode  (most occurring element)  of a vector. */

vectors.  = ''
vectors.0 = 0
/*              --------vector----------- */
call add_vector '10 9 8 7 6 5 4 3 2 1'             -- 1 2 3 4 5 6 7 8 9 10
call add_vector '10 9 8 7 6 5 4 3 2 1 0 0 0 0 .11' -- 0
call add_vector '30 10 20 30 40 50 -100 4.7 -11e2' -- 30
call add_vector '1 8 6 0 1 9 4 6 1 9 9 9'          -- 9
call add_vector '1 2 3 4 5 6 7 8 9 10 11'          -- 1 2 3 4 5 6 7 8 9 10 11
call add_vector '8 8 8 2 2 2'                      -- 8 2
call add_vector 'cat kat Cat emu emu Kat'          -- emu
call add_vector '0 1 2 3 3 3 4 4 4 4 1 0'          -- 4
call add_vector '2 7 1 8 2'                        -- 2
call add_vector '2 7 1 8 2 8'                      -- 8 2
call add_vector 'E n z y k l o p ä d i e'          -- E n z y k l o p ä d i e
call add_vector 'E n z y k l o p ä d i e ä'        -- ä
call add_vector '3 1 4 1 5 9 7 6'                  -- 1
call add_vector '3 1 4 1 5 9 7 6 3'                -- 3, 1
call add_vector '1 3 6 6 6 6 7 7 12 12 17'         -- 6
call add_vector '1 1 2 4 4'                        -- 4 1

do v_ = 1 to vectors.0
  vec = vectors.v_
  
  say 'vector=' vec;      /* show vector */
  say 'mode=' mode(vec);  /* show result */
  say
  end v_

exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------MODE subroutine---------------------*/
mode:
  procedure expose A_.
  parse arg vec /*finds the  MODE  of a vector.  */
  call makeArray vec                   /*make an array out of the vector*/
  call esort A_.0                      /*sort the array elements.       */
  Q_ = A_.1                            /*assume 1st element is the mode.*/
  freq = 1                             /*the frequency of the occurance.*/
  do j_ = 1 for A_.0
    x_ = j_ - freq
    if A_.j_ == A_.x_ then do
      freq = freq + 1                  /*bump the frequency count.      */
      Q_ = A_.j_                       /*this is the one.               */
      end
    end j_
  return Q_

/*----------------------------------MAKEARRAY subroutine----------------*/
makeArray:
  procedure expose A_.
  parse arg vec
  A_.0 = words(vec) /*make array*/
  do k_ = 1 for A_.0
    A_.k_ = word(vec, k_)
    end k_
return

/*----------------------------------ADD_VECTOR subroutine----------------*/
add_vector:
  procedure expose vectors.
  parse arg vector
  v_ = vectors.0 + 1; vectors.0 = v_; vectors.v_ = vector
  return

/*----------------------------------ESORT subroutine--------------------*/
esort:
  procedure expose A_.
  h_ = A_.0                    /*exchange sort.*/
  do while h_ > 1
    h_ = h_ % 2
    do i_ = 1 for A_.0 - h_
      j_ = i_
      k_ = h_ + i_
      do while A_.k_ < A_.j_
        swap  = A_.j_
        A_.j_ = A_.k_
        A_.k_ = swap
        if h_ >= j_ then leave
        j_ = j_ - h_
        k_ = k_ - h_
        end
      end i_
    end /*while h_ > 1*/
  return

