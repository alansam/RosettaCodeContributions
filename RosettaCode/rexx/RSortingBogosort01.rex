/* Rexx */

call main
return

::routine isSorted
  use arg list

  if list~isEmpty() then
    return isTrue()

  loop i_ = 1 to list~items() - 1
    if list[i_] > list[i_ + 1] then
      return isFalse()
    end i_

  return isTrue()

::routine bogoSort
  use arg list
  /*
   * Pseudocode:
   * <pre>
   * while not InOrder(list) do
   *   Shuffle(list)
   * done
   * </pre>
   */

  loop label s_ while \isSorted(list)
    list = shuffleFischerYates(list)
    --say 'shuffled:' show(list)
    end s_

  return list

::routine main
  --unsorted: [31 41 59 26 53 58 97 93 23 84]
  --sorted:   [23 26 31 41 53 58 59 84 93 97]
  samples = .list~of(31, 41, 59, 26, 53, 58, 97, 93, 23, 84)
  alst = samples~allItems()

  say 'unsorted:' show(alst)
  alst = bogoSort(alst)
  say 'sorted:  ' show(alst)

  return

::routine show
  use arg list

  shown = '['
  loop a_ = 1 to list~items()
    shown = shown || list[a_] || ', '
    end a_

  shown = shown~strip('T', ' ')
  shown = shown~strip('T', ',')
  shown = shown || ']'
  return shown

::routine isTrue
  return 1 == 1

::routine isFalse
  return \isTrue()

::routine shuffleFischerYates
  /* Fischer-Yates Shuffle */
  use arg arry
  alen = arry~items()
  loop i_ = alen to 1 by -1
    j_ = RANDOM(1, i_)
    if i_ == j_ then
      iterate i_
    tmp = arry[i_]
    arry~put(arry[j_], i_) 
    arry~put(tmp, j_)
    end i_
  return arry

/* ----------- */

::routine shuffleNaive
/* Naive Shuffle */
  use arg arry
  loop alen
    p1 = RANDOM(1, alen)
    p2 = RANDOM(1, alen)
    loop while p2 == p1
      p2 = RANDOM(1, alen)
      end
    tmp = arry[p1]
    arry~put(arry[p2], p1)
    arry~put(tmp, p2)
    end
  return arry
