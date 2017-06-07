/*REXX program to spit out pi digits (few at a time) until  Ctrl-Break. */

arg digs .
if digs == '' then digs = 1e6          /*allow the specification of digs*/
fn = 'pi_digits.out'                   /*file that can be written to.   */
numeric digits digs                    /*big digs, the slower the spits.*/
pi     = 0
s_     = 16
r_     = 4
v_     = 5
vs     = v_ * v_
g_     = 239
gs     = g_ * g_
old    = ''
spewed = 0
j_     = 1

call time 'E'

/*-------------------------------------John Machin's formula for  pi.   */
do n_ = 1 by 2
  pi = pi + s_ / (n_ * v_) - r_ / (n_ * g_)
  if pi == old then leave              /*no further with current DIGITS.*/
  s_ = -s_
  r_ = -r_
  v_ = v_ * vs
  g_ = g_ * gs
  if n_ \== 1  then
    do j_ = spewed + 1 to compare(pi, old)
      spit = substr(pi, j_, 1)
      call charout, spit          /*spit out 1 digit of pi.*/
      /*call charout fn,spit*/          /* ...and also to a file.*/
      end j_
  spewed = j_ - 1
  old = pi
  end n_

say
say  n_ % 2 + 1 'iterations took' format(time("E"),, 2) 'seconds.'

