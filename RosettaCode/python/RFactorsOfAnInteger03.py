#!/usr/bin/env python

from math import sqrt

def factor(n):
  factors = set()
  for x in range(1, int(sqrt(n)) + 1):
    if n % x == 0:
      factors.add(x)
      factors.add(n // x)
  return sorted(factors)

if __name__ == '__main__':
  for n_ in [64, 3135, 45, 60, 81, 29] + range(1, 11):
    print '%8d, factors: %s' % (n_, str(factor(n_)))

