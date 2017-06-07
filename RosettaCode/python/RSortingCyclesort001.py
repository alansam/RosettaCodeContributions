#!/usr/bin/env python

# Sort an array in place and return the number of writes.
def cycleSort(array):
  writes = 0

  # Loop through the array to find cycles to rotate.
  for cycleStart in range(0, len(array) - 1):
    item = array[cycleStart]

    # Find where to put the item.
    pos = cycleStart
    for i in range(cycleStart + 1, len(array)):
      if array[i] < item:
        pos += 1

    # If the item is already there, this is not a cycle.
    if pos == cycleStart:
      continue

    # Otherwise, put the item there or right after any duplicates.
    while item == array[pos]:
      pos += 1
    array[pos], item = item, array[pos]
    writes += 1

    # Rotate the rest of the cycle.
    while pos != cycleStart:

      # Find where to put the item.
      pos = cycleStart
      for i in range(cycleStart + 1, len(array)):
        if array[i] < item:
          pos += 1

      # Put the item there or right after any duplicates.
      while item == array[pos]:
        pos += 1
      array[pos], item = item, array[pos]
      writes += 1

  return writes

if __name__ == '__main__':
  x = [0, 1, 2, 2, 2, 2, 1, 9, 3.5, 5, 8, 4, 7, 0, 6]
  xcopy = x[::]
  writes = cycleSort(xcopy)
  if xcopy != sorted(x):
    print('Wrong order!')
  else:
    print('%r\nIs correctly sorted using cycleSort to\n%r\nUsing %i writes.' % (x, xcopy, writes))

