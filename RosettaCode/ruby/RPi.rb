
def pi
  places  = 1000
  digitCt = 0
  q_, r_, t_, k_, n_, l_ = 1, 0, 1, 1, 3, 3
  dot = nil
  loop do
    if 4 * q_ + r_ - t_ < n_ * t_ then
      digitCt += 1
      if places > 0 && digitCt - 1 > places then
        break
      end
      yield n_
      if dot.nil? then
        yield '.'
        dot = '.'
      end
      nr  = 10 * (r_ - n_ * t_)
      n_  = ((10 * (3 * q_ + r_)) / t_) - 10 * n_
      q_ *= 10
      r_  = nr
    else
      nr  = (2 * q_ + r_) * l_
      nn  = (q_ * (7 * k_ + 2) + r_ * l_) / (t_ * l_)
      q_ *= k_
      t_ *= l_
      l_ += 2
      k_ += 1
      n_  = nn
      r_  = nr
    end
  end
end

pi {|digit| print digit; $stdout.flush}
puts

