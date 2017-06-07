#!/usr/env python

from collections import defaultdict

def modes(values):
  count = defaultdict(int)
  for v in values:
    count[v] += 1
  best = max(count.values())
  return [k for k,v in count.items() if v == best]

def main():
  print modes([1, 3, 6, 6, 6, 6, 7, 7, 12, 12, 17])              # [6]
  print modes((1, 1, 2, 4, 4))                                   # [1, 4]
  print modes([10, 9, 8, 7, 6, 5, 4, 3, 2, 1])                   # [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  print modes((10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, .11))  # [0]
  print modes([30, 10, 20, 30, 40, 50, -100, 4.7, -11e2])        # [30]
  print modes((30, 10, 20, 30, 40, 50, -100, 4.7, -11e2, -11e2)) # [-1100.0, 30]
  return

if __name__ == "__main__":
  main()

