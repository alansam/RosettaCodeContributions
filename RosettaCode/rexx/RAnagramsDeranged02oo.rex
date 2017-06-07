/*REXX program finds the  largest  deranged word  (within a dictionary).*/
parse arg ifid .
if ifid = '' then
  ifid = 'unixdict.txt'
aWords = 0        /*input file identifier, # words.*/
wL. = 0                                  /*number of words of length  L.  */
do j = 1 while lines(ifid) \== 0    /*read each word in file (word=X)*/
  x = space(linein(ifid), 0)          /*pick off a word from the input.*/
  L = length(x)
  if L < 3 then iterate /*onesies and twosies can't win. */
  aWords = aWords + 1                    /*count of (useable) words.      */
  YH.aWords = L                        /*the length of the word found.  */
  YA.aWords = x                        /*save the word in an array.     */
  wL.L = wL.L + 1
  YU = wL.L       /*counter of words of length  L. */
  YAYA.L.YU = x                         /*array   of words of length  L. */
     /*sort the letters*/
     do ja = 1 for L
       YB.ja = substr(x, ja, 1)
       end
  YB.0 = L
  call esort
  z = ''
  do jb = 1 for L
    z = z || YB.jb
    end
  YAYAs.L.YU = z                        /*store the sorted word (letters)*/
  YAs.aWords = YAYAs.L.YU                 /*and also, sorted length L vers.*/
  end j
a. = ''                                   /*all the anagrams for word  X.  */
say copies('-', 30) aWords 'words in the dictionary file: ' ifid
m = 0
n. = 0                              /*YH anagrams for word X; m=max L.*/
do j=1 for aWords               /*process the usable words found.*/
  x = YA.j
  Lx = YH.j
  xs = YAs.j    /*get some vital statistics for X*/
  if m \== 0 & Lx < m then iterate    /*bypass comparisons if too short*/
  do k=1 for wL.Lx             /*process all the words of len L.*/
    if xs \== YAYAs.Lx.k then iterate /*is this a true anagram of  X ? */
    if x == YAYA.Lx.k then iterate /*skip doing anagram on itself.  */
    do c = 1 for Lx              /*ensure no character pos shared.*/
      if substr(YA.j, c, 1) == substr(YAYA.Lx.k, c, 1) then iterate k
      end c
    n.j = n.j + 1
    a.j = a.j  YAYA.Lx.k  /*bump counter, add --> anagrams.*/
    m = max(m, Lx)                   /*M is the maximum length of word*/
    end k
  end j

  do k = 1 for aWords                    /*now, search all words for max. */
    /*
    if YH.k == m then do
      if n.k \== 0 then do
        if word(a.k, 1) > YA.k then do
          say YA.k a.k
          end
        end
      end
    */
    if YH.k == m, n.k \== 0, word(a.k, 1) > YA.k then do
      say YA.k a.k
      end
    end k                          /*above:REXX has no shortcircuits*/
exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------ESORT-------------------------------*/
esort:
procedure expose YB.
h = YB.0
do while h > 1
  h = h % 2
  do i = 1 for YB.0 - h
    j = i
    k = h + i
  do while YB.k < YB.j
    t = YB.j
    YB.j = YB.k
    YB.k = t
    if h >= j then leave
      j = j - h
      k = k - h
      end
    end
  end
return

