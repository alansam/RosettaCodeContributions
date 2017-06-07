#!/usr/bin/env python

def factor(n):
  a, r = 1, [1]
  while a * a < n:
    a += 1
    if n % a: continue
    b, f = 1, []
    while n % a == 0:
      n //= a
      b *= a
      f += [i * b for i in r]
    r += f
  if n > 1: r += [i * n for i in r]
  return r

if __name__ == '__main__':
  for n_ in [64, 3135, 45, 60, 81, 29] + range(1, 11):
    print '%8d, factors: %s' % (n_, str(factor(n_)))

