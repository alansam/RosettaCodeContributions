/*REXX program performs a   radix sort   on a  stemmed  integer array.  */
aList='0 2 3 4 5 5 7 6 6 7 11 7 13 9 8 8 17 8 19 9 10 13 23 9 10 15 9 11',
      '29 10 31 10 14 19 12 10 37 21 16 11 41 12 43 15 11 25 47 11 14 12',
      '20 17 53 11 16 13 22 31 59 12 61 33 13 12 18 16 67 21 26 14 71 12',
      '73 39 13 23 18 18 79 13 12 43 83 14 22 45 32 17 89 13 20 27 34 49',
      '24 13 97 16 17 14 101 22 103 19 15 55 107 13 109 18 40 15 113 -42'
/*excluding -42, the abbreviated list is called the integer log function*/
aList='10 9 8 7 6 5 4 3 2 1 0 -0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10'

mina = word(aList, 1)
maxa = mina
do n_ = 1 for words(aList)
  idx = word(aList, n_)
  Ax.n_ = idx  /*list --> array.*/
  mina  = min(idx, mina)
  maxa  = max(idx, maxa)
  width = max(length(abs(mina)), length(maxa))
  end n_
nwords = words(aList)
wlen = length(nwords)
call radSort nwords
do j_ = 1 for nwords
 say 'item' right(j_, wlen) "after the radix sort:"  right(Ax.j_, width + 1)
 end j_
exit                                   /*stick a fork in it, we're done.*/
/*-----------------------------------RADSORT subroutine-----------------*/
radSort:
  procedure expose Ax. width
  parse arg size
  mote = c2d(' ')
  Hx = 1
  !x.Hx._b = 1
  !x.Hx._i = 1
  !x.Hx._n = size
  do i_ = 1 for size
    y_ = Ax.i_
    Ax.i_ = right(abs(y_), width, 0)
    if y_ < 0 then Ax.i_ = '-'Ax.i_
    end i_
  /*======================================where the rubber meets the road.*/
  do while Hx \== 0
    ctr. = 0
    L! = 'ffff'x
    low = !x.Hx._b
    Nx = !x.Hx._n
    radi = !x.Hx._i
    H! = ''
    Hx = Hx - 1
    do j_ = low for Nx
      parse var Ax.j_ =(radi) Ux +1
      ctr.Ux = ctr.Ux + 1
      if ctr.Ux == 1 then if Ux \== '' then do
        if Ux << L! then L! = Ux
        if Ux >> H! then H! = Ux
        end
      end j_
    if L! >> H! then iterate
    Ux = ''
    if L! == H! then if ctr.Ux == 0 then do
      Hx = Hx + 1
      !x.Hx._b = low
      !x.Hx._n = Nx 
      !x.Hx._i = radi + 1
      iterate
      end
    L! = c2d(L!)
    H! = c2d(H!)
    Qx = ctr.Ux + low
    top.Ux = Qx
    ts = mote
    Mmax = L!
    do k_ = L! to H!
      Ux = d2c(k_, 1)
      cen = ctr.Ux
      if cen > ts then parse value cen k_ with ts Mmax
      Qx = Qx + cen
      top.Ux = Qx
      end k_
    pivot = low
    do while pivot < low + Nx
      it = Ax.pivot
      do forever
        parse var it =(radi) Ux +1
        cen = top.Ux - 1
        if pivot >= cen then leave
          top.Ux = cen
          Qx = Ax.cen
          Ax.cen = it
          it = Qx
          end    /*forever*/
      top.Ux = pivot
      Ax.pivot = it
      pivot = pivot + ctr.Ux
      end         /*while pivot<low+Nx*/
    i_ = Mmax
    do until i_ == Mmax
      Ux = d2c(i_, 1)
      i_ = i_ + 1
      if i_ > H! then i_ = L!
      d = ctr.Ux
      if d <= mote then do
        if d > 1 then call .radSortP top.Ux, d
        iterate
        end
      Hx = Hx + 1
      !x.Hx._b = top.Ux
      !x.Hx._n = d
      !x.Hx._i = radi + 1
      end   /*until i_==Mmax*/
    end       /*while Hx\==0 */
  /*=====================================we're done with the heavy lifting*/
  Hx=0
  do i_ = size by -1 to 1
    if Ax.i_ >= 0 then iterate
    Hx = Hx + 1
    AtAt.Hx = Ax.i_
    end
  do j_ = 1 for size
    if Ax.j_ < 0 then iterate
    Hx = Hx + 1
    AtAt.Hx = Ax.j_
    end
  do k_ = 1 for size
    Ax.k_ = AtAt.k_ + 0
    end  /*combine neg&pos radix lists*/
  return

/*-----------------------------------.radSortP subroutine---------------*/
.radSortP:
  parse arg bbb, nnn
  do k_ = bbb + 1 for nnn - 1
    q = Ax.k_
    do j_ = k_ - 1 by -1 to bbb while q << Ax.j_
      jp = j_ + 1
      Ax.jp = Ax.j_
      end
    jp = j_ + 1
    Ax.jp = q
    end k_
return

