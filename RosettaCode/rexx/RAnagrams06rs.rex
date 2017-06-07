/*REXX program finds words with the largest set of anagrams (same size).*/
iFID='unixdict.txt'                    /*input file identifier, # words.*/
@=; !.=;  #.=0;  w=0;  words=0; most=0 /*initialize some REXX variables.*/
                                       /* [↓]  read entire file by line.*/
     do j=1  while  lines(iFID)\==0    /*Got data?   Then read a record.*/
     x=space(linein(iFID),0)           /*pick off a word from the input.*/
     L=length(x); if L<3  then iterate /*onesies and twosies can't win. */
     if \datatype(x,'M')  then iterate /*filter out nonanagramable words*/
     words=words+1                     /*count of (useable) words.      */
     parse upper var x u _.            /*get uppercase X & nullify "_." */
                                       /*[↓] put letters alphabetically.*/
       do k=1 for L;  y=substr(u,k,1);  xx='?'y;  _.xx=_.xx||y;  end /*k*/
                                       /*reassemble word, sorted letters*/
     z=_.?a||_.?b||_.?c||_.?d||_.?e||_.?f||_.?g||_.?h||_.?i||_.?j||_.?k||_.?l||_.?m||,
       _.?n||_.?o||_.?p||_.?q||_.?r||_.?s||_.?t||_.?u||_.?v||_.?w||_.?x||_.?y||_.?z
     !.z=!.z x;        #.z=#.z+1       /*append it to !.z, bump the ctr.*/
     if #.z>most  then do; @=z; most=#.z; w=max(w,L); iterate; end /*new*/
     if #.z==most then     @=@ z       /*append sorted word─►max anagram*/
     end   /*j*/
say '──────────────────────────────'  j-1  'words in the dictionary file: '  iFID
say
     do m=1  for words(@);       z=subword(@,m,1)  /*high count anagrams*/
     say '     '  left(subword(!.z,1,1),w)   '   [anagrams: '   subword(!.z,2)"]"
     end   /*m*/                       /* W  is the maximum width word. */
say
say '───── Found'   words(@)   "words  (each of which have"   #.z-1   'anagrams).'
                                       /*stick a fork in it, we're done.*/

