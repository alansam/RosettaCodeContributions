/*REXX program finds words with the largest set of anagrams (same size).*/
parse arg iFID .
if iFID = '' then
iFID='unixdict.txt';    words=0        /*input file identifier, # words.*/
!.=-1;    m=0;    wL.=0                /*anagrams, max anagrams, word L.*/
 
      do j=1  while lines(iFID)\==0    /*read each word in file (word=X)*/
      x=space(linein(iFID),0)          /*pick off a word from the input.*/
      L=length(x); if L<3 then iterate /*onesies and twosies can't win. */
      if \datatype(x,'M') then iterate /*filter out nonanagramable words*/
      words=words+1                    /*count of (useable) words.      */
      upper x;  @.words=x;  @L.words=L /*uppercase it, save it & length.*/
      wL.L=wL.L+1;          _=wL.L     /*count of words of length  L.   */
      @@.L._=x                         /*array of words of length  L.   */
      z=sortA(x,L);         !.z=!.z+1  /*sort letters in word, bump ctr.*/
      if !.z>m  then m=!.z             /*max ctr; slower: !.z=max(!.z,m)*/
      @@s.L._=z                        /*store sorted letters, length L.*/
      @s.words=z                       /*store sorted letters in a list.*/
      end   /*j*/
a.='      '                            /*all of the anagrams for word X.*/
say  copies('─',30)  j-1  'words in the dictionary file: '  iFID
n.=0                                   /*number of  anagrams for word X.*/
       do j=1  for words;    v=@s.j    /*process the usable words found.*/
       if !.v\==m  then iterate        /*this word has the max anagrams?*/
       x=@.j;                Lx=@L.j   /*get some vital statistics for X*/
         do k=1  for wL.Lx             /*process all words of length Lx.*/
         if v\==@@s.Lx.k  then iterate /*is this a true anagram of  X ? */
         n.j=n.j+1;  a.j=a.j  @@.Lx.k  /*bump counter, add ──► anagrams.*/
         end   /*k*/
       end     /*j*/
say  'searching took'  format(time('E'),,2)  "seconds."
mp=m+1
              do k=1  for words;    if n.k\==mp          then iterate
                                    if word(a.k,2)<=@.k  then iterate
              say '    '  word(a.k,1)   '   '   subword(a.k,2);  n.0=n.0+1
              end   /*k*/
say;   say 'Found'   n.0   "words  (each of which have"   m   'anagrams).'
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────SORTA───────────────────────────────*/
sortA: procedure;  parse arg xx,LL;    _.=      /*fast sort for letters.*/
          do jj=1  for LL;  _=substr(xx,jj,1);   _._=_._||_;   end  /*jj*/
return  _.a||_.b||_.c||_.d||_.e||_.f||_.g||_.h||_.i||_.j||_.k||_.l||_.m||,
        _.n||_.o||_.p||_.q||_.r||_.s||_.t||_.u||_.v||_.w||_.x||_.y||_.z
