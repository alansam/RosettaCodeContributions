#!/usr/bin/env python

def factors(n):
  return [i for i in range(1, n // 2 + 1) if not n % i] + [n]

if __name__ == '__main__':
  for n_ in [64, 3135, 45, 60, 81, 29] + range(1, 11):
    print '%8d: %s' % (n_, str(factors(n_)))

