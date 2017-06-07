/*REXX program performs a   radix sort   on a  stemmed  integer array.  */
/*
aList = '0 2 3 4 5 5 7 6 6 7 11 7 13 9 8 8 17 8 19 9 10 13 23 9 10 15 9 11',
        '29 10 31 10 14 19 12 10 37 21 16 11 41 12 43 15 11 25 47 11 14 12',
        '20 17 53 11 16 13 22 31 59 12 61 33 13 12 18 16 67 21 26 14 71 12',
        '73 39 13 23 18 18 79 13 12 43 83 14 22 45 32 17 89 13 20 27 34 49',
        '24 13 97 16 17 14 101 22 103 19 15 55 107 13 109 18 40 15 113 -42'
*/
/*
aList = '-10 -9 -8 -7 -6 -5 -4 -3 -2 -1 -0 0 1 2 3 4 5 6 7 8 9 10'
*/
aList = '10 9 8 7 6 5 4 3 2 1 0 -0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10'
/*excluding -42, the abbreviated list is called the integer log function*/

mina = word(aList, 1)
maxa = mina

do n_ = 1 for words(aList)
  x = word(aList, n_)
  Alist.n_ = x   /*list --> array.*/
  mina = min(x, mina)
  maxa = max(x, maxa)
  width = max(length(abs(mina)), length(maxa))
  end

nItems = words(aList)
wCount = length(nItems)
call radSort nItems

do j_ = 1 for nItems
  say 'item' right(j_, wCount) "after the radix sort:" right(Alist.j_, width + 1)
  end j_
exit                                   /*stick a fork in it, we're done.*/
/*-----------------------------------RADSORT subroutine-----------------*/
radSort:
procedure expose Alist. width
  parse arg size
  mote = c2d(' ')
  Hkey = 1
  !bucket.Hkey._b = 1
  !bucket.Hkey._i = 1
  !bucket.Hkey._n = size

  do i_ = 1 for size
    y = Alist.i_
    Alist.i_ = right(abs(y), width, 0)
    if y < 0 then Alist.i_ = '-'Alist.i_
    end i_

/*======================================where the rubber meets the road.*/
  do while Hkey \== 0
    ctr. = 0
    Lo = 'ffff'x
    low = !bucket.Hkey._b
    n = !bucket.Hkey._n
    radix = !bucket.Hkey._i
    Hi = ''
    Hkey = Hkey - 1
    do j_ = low for n
      parse var Alist.j_ =(radix) u_ +1
      ctr.u_ = ctr.u_ + 1
      if ctr.u_ == 1 then if u_ \== '' then do
        if u_ << Lo then Lo = u_
        if u_ >> Hi then Hi = u_
        end
      end j_

  if Lo >> Hi then iterate
  u_ = ''
  if Lo == Hi then if ctr.u_ == 0 then do
    Hkey = Hkey + 1
    !bucket.Hkey._b = low
    !bucket.Hkey._n = n
    !bucket.Hkey._i = radix + 1
    iterate
    end

  Lo = c2d(Lo)
  Hi = c2d(Hi)
  ? = ctr.u_ + low
  top.u_ = ?
  ts = mote
  vmax = Lo

  do k = Lo to Hi
    u_ = d2c(k, 1)
    cen = ctr.u_
    if cen > ts then parse value cen k with ts vmax
    ? = ? + cen
    top.u_ = ?
    end k
  pivot = low

  do while pivot < low + n
    it = Alist.pivot
    do forever
      parse var it =(radix) u_ +1
      cen = top.u_ - 1
      if pivot >= cen then leave
        top.u_ = cen
        ? = Alist.cen
        Alist.cen = it
        it = ?
      end    /*forever*/
    top.u_ = pivot
    Alist.pivot = it
    pivot = pivot + ctr.u_
    end         /*while pivot<low+n*/

  i = vmax

  do until i == vmax
    u_ = d2c(i, 1)
    i = i + 1
    if i > Hi then i = Lo
    d = ctr.u_
    if d <= mote then do
      if d > 1 then call .radSortP top.u_, d
      iterate
      end
      Hkey = Hkey + 1
      !bucket.Hkey._b = top.u_
      !bucket.Hkey._n = d
      !bucket.Hkey._i = radix + 1
      end   /*until i==vmax*/
  end       /*while Hkey\==0 */
/*=====================================we're done with the heavy lifting*/

  do i_ = 1 for size
    Alist.i_ = Alist.i_ + 0
    end i_
  return
/*-----------------------------------.radSortP subroutine---------------*/
.radSortP:
  parse arg bbb, nnn
  do k_ = bbb + 1 for nnn - 1
    q = Alist.k_
    do j_ = k_ - 1 by -1 to bbb while q << Alist.j_
      jp = j_ + 1
      Alist.jp = Alist.j_
      end
    jp = j_ + 1
    Alist.jp = q
    end k_
return

