/* Rexx */

stimes = '23:00:17 23:40:20 00:12:45 00:17:19'
--stimes = '00:00:17 00:00:20 00:00:45 00:00:19'

tv. = 0
t_ = 0
loop i_ = 1 to stimes~words()
  say stimes~word(i_)
  parse value stimes~word(i_) with hh ':' mm ':' ss .
  t_ = t_ + 1; tv.0 = t_
  tv.t_ = (hh * 60 * 60) + (mm * 60) + ss
  end i_

sum = 0
loop i_ = 1 to tv.0
  say tv.i_
  sum += tv.i_
  end i_

--trace ?r; nop

avg = (sum / tv.0)~format(, 0)
say avg
hh = avg % (60 * 60)
avg //= 60 * 60
mm = avg % 60
avg //= 60
ss = avg
say hh~right(2, 0)":"mm~right(2, 0)":"ss~right(2, 0)

return

