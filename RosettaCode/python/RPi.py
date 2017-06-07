#!/usr/bin/env python

def calcPi():
  q_, r_, t_, k_, n_, l_ = 1, 0, 1, 1, 3, 3
  while True:
    if 4 * q_ + r_ - t_ < n_ * t_:
      yield n_
      nr  = 10 * (r_ - n_ * t_)
      n_  = ((10 * (3 * q_ + r_)) // t_) - 10 * n_
      q_ *= 10
      r_  = nr
    else:
      nr  = (2 * q_ + r_) * l_
      nn  = (q_ * (7 * k_) + 2 + (r_ * l_)) // (t_ * l_)
      q_ *= k_
      t_ *= l_
      l_ += 2
      k_ += 1
      n_  = nn
      r_  = nr

import sys
pi_digits = calcPi()
i = 0
for d in pi_digits:
  sys.stdout.write(str(d))
  i += 1
  if i == 40:
    print("")
    i = 0

