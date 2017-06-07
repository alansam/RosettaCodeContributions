#!/usr/env python

from collections import Counter

def modes(values):
  count = Counter(values)
  best = max(count.values())
  return [k for k,v in count.items() if v == best]

def main():
  print modes([1, 3, 6, 6, 6, 6, 7, 7, 12, 12, 17]) # [6]
  print modes((1, 1, 2, 4, 4)) # [1, 4]
  return

if __name__ == "__main__":
  main()

