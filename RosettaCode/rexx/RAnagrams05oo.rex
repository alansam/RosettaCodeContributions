/* Rexx */

parse arg ifid .
if ifid = '' then ifid='unixdict.txt' /*input file identifier. */

anagrams. = 0
maxWords = 0
do lc = 1 while lines(ifid)
  aWord = linein(ifid)
  key = sortAlpha(aWord)
  kv = anagrams.key
  parse var kv count aWords
  aWords = space(aWords aWord)
  maxWords = max(maxWords, words(aWords))
  anagrams.key = words(aWords) aWords
  end lc
  do key over anagrams.
    kv = anagrams.key
    parse var kv count aWords
    if count >= maxWords then
      say key':' aWords
    else
      drop anagrams.key
    end key
return
exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
sortAlpha:
procedure
  parse arg key .
  kp. = ''
  do while key \= ''
    parse var key l_ +1 key
    u_ = upper(l_)
    kp.u_ = kp.u_ || l_
    end
  drop a b c d e f g h i j k l m n o p q r s t u v w x y z
  key = '',
    || kp.0 || kp.1 || kp.2 || kp.3 || kp.4,
    || kp.5 || kp.6 || kp.7 || kp.8 || kp.9,
    || kp.a || kp.b || kp.c || kp.d,
    || kp.e || kp.f || kp.g || kp.h,
    || kp.i || kp.j || kp.k || kp.l,
    || kp.m || kp.n || kp.o || kp.p,
    || kp.q || kp.r || kp.s || kp.t,
    || kp.u || kp.v || kp.w || kp.x,
    || kp.y || kp.z
  return key
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
sortChars:
procedure
  parse arg key .
  ax. = ''
  ax.0 = length(key)
  do c_ = 1 to ax.0
    cc = substr(key, c_, 1)
    ax.c_ = cc
    end c_
  call SysStemSort 'ax.', 'a', 'i'
  key = ''
  do c_ = 1 to ax.0
    key = key || ax.c_
    end c_
  return key
exit
