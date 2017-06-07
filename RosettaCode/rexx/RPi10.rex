/* Rexx */
numeric digits 5000
do
  parse arg places .
  if places = '' then places = -1

  parse value '1 0 1 1 3 3' with q_ r_ t_ k_ n_ l_ -- init work vars

  first = isTrue()
  digitCt = 0
  do forever
    if 4 * q_ + r_ - t_ < n_ * t_ then do
      digitCt = digitCt + 1
      if places > 0 & digitCt - 1 > places then leave
      call charout , n_
      if first then do
        call charout , '.'
        first = isFalse()
        end
      nr = 10 * (r_ - n_ * t_)
      n_ = ((10 * (3 * q_ + r_)) % t_) - 10 * n_
      q_ = q_ * 10
      r_ = nr
      end
    else do
      nr = (2 * q_ + r_) * l_
      nn = (q_ * (7 * k_ + 2) + r_ * l_) % (t_ * l_)
      q_ = q_ * k_
      t_ = t_ * l_
      l_ = l_ + 2
      k_ = k_ + 1
      n_ = nn
      r_ = nr
      end
    end
  say

  return
end
exit

isTrue: procedure
  return (1 == 1)

isFalse: procedure
  return \isTrue()

