/*REXX program finds words with the largest set of anagrams (same size).*/
parse arg iFID .
if iFID = '' then
  iFID = 'unixdict.txt'                    /*input file identifier, YH words.*/
YA  = ''
YB. = ''
YH. = 0
w   = 0
aWords = 0
most = 0 /*initialize some REXX variables.*/
                                       /* [\/]  read entire file by line.*/
do j = 1 while lines(iFID) \== 0    /*Got data?   Then read a record.*/
 x = space(linein(iFID), 0)           /*pick off a word from the input.*/
 L = length(x)
 if L < 3 then iterate /*onesies and twosies can't win. */
 if \datatype(x, 'M') then iterate /*filter out nonanagramable words*/
 aWords = aWords + 1                     /*count of (useable) words.      */
 parse upper var x u YU.            /*get uppercase X & nullify "YU." */
                                       /*[\/] put letters alphabetically.*/
 do k = 1 for L
   y = substr(u, k, 1)
   xx = '?'y
   YU.xx = YU.xx || y
   end k
                                       /*reassemble word, sorted letters*/
 z = '',
   || YU.?a || YU.?b || YU.?c || YU.?d,
   || YU.?e || YU.?f || YU.?g || YU.?h,
   || YU.?i || YU.?j || YU.?k || YU.?l,
   || YU.?m || YU.?n || YU.?o || YU.?p,
   || YU.?q || YU.?r || YU.?s || YU.?t,
   || YU.?u || YU.?v || YU.?w || YU.?x,
   || YU.?y || YU.?z
 YB.z = YB.z x
 YH.z = YH.z + 1       /*append it to YB.z, bump the ctr.*/
 if YH.z > most then do
   YA = z
   most = YH.z
   w = max(w, L)
   iterate
   end /*new*/
 if YH.z == most then YA = YA z       /*append sorted word->max anagram*/
 end j
say '------------------------------'  j - 1  'words in the dictionary file: '  iFID
say
do m = 1 for words(YA)
  z = subword(YA, m, 1)  /*high count anagrams*/
 say '     '  left(subword(YB.z, 1, 1), w)   '   [anagrams: '   subword(YB.z, 2)"]"
 end m                       /* W  is the maximum width word. */
say
say '----- Found'   words(YA)   "words  (each of which have"   YH.z - 1   'anagrams).'
                                       /*stick a fork in it, we're done.*/

