# Calculate Pi using the Arithmetic Geometric Mean of 1 and 1/sqrt(2)
#
#
#  Nigel_Galloway
#  March 8th., 2012.
#
require 'flt'
Flt::BinNum.Context.precision = 8192
a_ = n_ = 1
g_ = 1 / Flt::BinNum(2).sqrt
z_ = 0.25
(0..17).each{
  x_ = [(a_ + g_) * 0.5, (a_ * g_).sqrt]
  var = x_[0] - a_
  z_ -= var * var * n_
  n_ += n_
  a_  = x_[0]
  g_  = x_[1]
}
puts a_ * a_ / z_

