/* Rexx */

n = 0
n += 1; w.0 = n; w.n = "kitten sitting"
n += 1; w.0 = n; w.n = "rosettacode raisethysword"
n += 1; w.0 = n; w.n = "doctorwho torchwood"
loop n = 0 to w.0
  say w.n~word(1) "->" w.n~word(2)":" levenshteinDistance(w.n~word(1), w.n~word(2))
  end n

::routine levenshteinDistance
  use arg s, t
  s = s~lower
  t = t~lower

  m = s~length
  n = t~length

  -- for all i and j, d[i,j] will hold the Levenshtein distance between
  -- the first i characters of s and the first j characters of t;
  -- note that d has (m+1)x(n+1) values
  d = .array~new(m + 1, m + 1)

  -- clear all elements in d
  loop i = 1 to d~dimension(1)
    loop j = 1 to d~dimension(2)
      d[i, j] = 0
    end j
  end i

  -- source prefixes can be transformed into empty string by
  -- dropping all characters (Note, ooRexx arrays are 1-based)
  loop i = 2 to m + 1
    d[i, 1] = 1
  end i

  -- target prefixes can be reached from empty source prefix
  -- by inserting every characters
  loop j = 2 to n + 1
    d[1, j] = 1
  end j

  loop j = 2 to n + 1
    loop i = 2 to m + 1
      if s~subchar(i - 1) == t~subchar(j - 1) then
        d[i, j] = d[i - 1, j - 1]   -- no operation required
      else d[i, j] = min(d[i - 1, j] + 1,    - -- a deletion
                         d[i, j-1] + 1,      - -- an insertion
                         d[i - 1, j - 1] + 1)  -- a substitution
    end i
  end j

  return d[m + 1, n + 1 ]

