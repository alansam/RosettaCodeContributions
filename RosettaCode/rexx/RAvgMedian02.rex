/*REXX program to find the medium of a vector (& displays vector,medium)*/

vectors.  = ''
vectors.0 = 0
/*------------- ----------vector----------------------*/
call add_vector '1 9 2 4'
call add_vector '3 1 4 1 5 9 7 6'
call add_vector '3 4 1 -8.4 7.2 4 1 1.2'
call add_vector '-1.2345678e99 2.3e+700'
call add_vector '10 9 8 7 6 5 4 3 2 1'
call add_vector '10 9 8 7 6 5 4 3 2 1 0 0 0 0 .11'
call add_vector '10 20 30 40 50 -100 4.7 -11e2'

do v_ = 1 to vectors.0
  vec = vectors.v_
  say 'vector=' vec          /* show vector */
  say 'median=' median(vec)  /* show result */
  say
  end v_

exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------MEDIUM subroutine-------------------*/
median:
  procedure;
  parse arg x_
  A_. = 0
  call makeArray x_                                 /*make into scaler array (faster)*/
  call Esort                                        /*(ESORT is an overkill for this)*/
  m_ = A_.0 % 2                                     /*      %   is integer division. */
  n_ = m_ + 1
  if A_.0 // 2 == 1 then med = A_.n_                /*(odd?)        //   is  modulus.*/
                    else med = (A_.m_ + A_.n_) / 2  /*process an even-element vector.*/
  return med

/*----------------------------------ADD_VECTOR subroutine----------------*/
add_vector:
  procedure expose vectors.
  parse arg vector
  v_ = vectors.0 + 1; vectors.0 = v_; vectors.v_ = vector
  return

/*----------------------------------MAKEARRAY subroutine----------------*/
makeArray:
  procedure expose A_.
  parse arg v
  A_.0 = words(v) /*make array*/
  do j_ = 1 for A_.0
    A_.j_ = word(v, j_)
    end j_
  return

/*----------------------------------ESORT subroutine--------------------*/
-- Exchange Sort
Esort:
  procedure expose A_.
  h_ = A_.0                /* A_.0 =  # entries. */
  do while h_ > 1
    h_ = h_ % 2                /* cut entries by half */
    do i_ = 1 for A_.0 - h_
      j_ = i_
      k_ = h_ + i_
      do while A_.k_ < A_.j_
        parse value  A_.j_ A_.k_  with  A_.k_ A_.j_    /*swap two values. */
        if h_ >= j_ then leave
        j_ = j_ - h_
        k_ = k_ - h_
        end /*while A_.k_ < A_.j_*/
      end i_
    end /*while h > l*/
  return                                      /*exchange sort is finished.*/

