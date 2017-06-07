/*REXX program finds words with the largest set of anagrams (same size).*/
/*input file identifier, # words.*/
parse arg ifid .
if ifid = '' then ifid = 'unixdict.txt';
words = 0
  
wL. = 0                                  /*number of words of length  L.  */
      
do j = 1 while lines(ifid) \== 0    /*read each word in file (word=X)*/
  x = space(linein(ifid), 0)          /*pick off a word from the input.*/
  L=length(x);
  if L < 3 then iterate /*onesies and twosies can't win. */
  words = words + 1                    /*count of (useable) words.      */
  AY.words = x                        /*save the word in an array.     */
  wL.L = wL.L + 1;
  _ = wL.L       /*counter of words of length  L. */
  AYAY.L._ = x                         /*array   of words of length  L. */
  AYAYs.L._ = csort(x)                 /*also, store a sorted version.  */
  AYs.words = AYAYs.L._                 /*and also, sorted length L vers.*/
  end j
a. = ''                                /*all the anagrams for word  X.  */
say copies('─',30) words 'words in the dictionary file: ' ifid
n. = 0                                   /*number of anagrams for word X. */
do j = 1 for words               /*process the usable words found.*/
    /*get some vital statistics for X*/
  x = AY.j;
  Lx = length(x);
  xs = AYs.j
  do k = 1 for wL.Lx             /*process all the words of len L.*/
    if xs \== AYAYs.Lx.k then iterate /*is this a true anagram of  X ? */
    if x == AYAY.Lx.k    then iterate /*skip doing anagram on itself.  */
    n.j = n.j + 1;
    a.j = a.j  AYAY.Lx.k  /*bump counter, add ──► anagrams.*/
    end k
  end j
m = n.1                                  /*assume first (len=1) is largest*/
do j = 2 to words;
  m = max(m, n.j);
  end  j /*find the maximum anagram count.*/
do k = 1 for words;
  if n.k == m then if word(a.k, 1) > AY.k then say AY.k a.k;
  end k
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────CSORT───────────────────────────────*/
csort:
  parse arg y,z ;
  do ja = 1 for L ;
    !.ja = substr(y, ja, 1) ;
    end ja
  !.0 = L;
  call esort    ;
  do jb = 1 for L ;
    z = z || !.jb         ;
    end jb
return z
/*──────────────────────────────────ESORT───────────────────────────────*/
esort:
procedure expose !.;
  h = !.0;
  do while h > 1;
    h = h % 2;
    do i = 1 for !.0 - h;
      j = i;
      k = h + i
      do while !.k < !.j;
        t = !.j;
        !.j = !.k;
        !.k = t;
        if h >= j then leave;
        j = j - h;
        k = k - h;
        end;
      end;
    end;
    return

