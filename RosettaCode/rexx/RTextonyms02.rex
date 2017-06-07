/*REXX program counts the number of textonyms are in a file (dictionary)*/
parse arg iFID .                       /*get optional fileID of the file*/
if iFID == '' then iFID = 'unixdict.txt'  /*filename of the word dictionary*/
digitCombinationPlaceholder. = 0                                   /*digit combinations placeholder.*/
textonyms. = ''
twords. = ''                              /*sparse array of textonyms;words*/
alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'  /*supported alphabet to be used. */
digitKey =  22233344455566677778889999   /*translated alphabet to dig key.*/
digKey = 0
wordCount = 0         /*# digit combinations; wordCount*/
illegals = 0
duplicates = 0
longest = 0
mostus = 0 /*illegals; duplicate words; lit.*/
first = 0
last = 0
long = 0
most = 0   /*for: first, last, longest, ··· */
call linein  iFID, 1, 0                /*point to the first char in dict*/
textonymTotal = 0                                    /*number of textonyms in the file*/
                                       /* [^]   ───in case file is open.*/
do j_ = 1 while lines(iFID) \== 0        /*keep reading until exhausted.  */
  xWord = linein(iFID)
  yWord = xWord
  xWord = upper(xWord)    /*get a word  and  uppercase it. */

  if \datatype(xWord, 'U') then do
    illegals = illegals + 1
    iterate j_
    end   /*illegal?  */

    if twords.xWord \== '' then do
    duplicates = duplicates + 1
    iterate j_
    end   /*duplicate?*/
  else twords.xWord = .      /*indicate it's a righteous word.*/

  wordCount = wordCount + 1                /*bump the word count (for file).*/
  keyDigits = translate(xWord, digitKey, alphabet)   /*build translated digit key word*/
  digitCombinationPlaceholder.keyDigits = digitCombinationPlaceholder.keyDigits + 1 /*flag the digit key word exists.*/
  textonyms.keyDigits = textonyms.keyDigits yWord
  wordKey = words(textonyms.keyDigits)         /*build a list of same digit key.*/

  if wordKey > most then do
    mostus = keyDigits
    most = wordKey
    end  /*remember mostus digKeys.*/

    if digitCombinationPlaceholder.keyDigits == 2 then do
    textonymTotal = textonymTotal + 1           /*bump the count of the textonyms*/
    if first == 0 then first = keyDigits  /*the first textonym found*/
    last = keyDigits                      /* "   last     "      "  */
    wordKey = length(textonyms.keyDigits)               /*length of the digit key.*/
    if wordKey > longest then long = keyDigits   /*is this the longest ?   */
    longest = max(wordKey, longest)     /*now, shoot for this len.*/
    end                         /* [^] discretionary stuff*/

  if digitCombinationPlaceholder.keyDigits \== 1 then iterate j_            /*Does it already exist?  Skip it*/
  digKey = digKey + 1                      /*bump count of digit key words. */
  end j_

say wordCount 'is the number of words in file  "'iFID'" which can be represented by the digit key mapping.'
if illegals \== 0 then say illegals 'word's(illegals) "contained illegal characters."
if duplicates \== 0 then say duplicates "duplicate word"s(duplicates) 'detected.'
say 'They require' digKey "combination"s(digKey) 'to represent them.'
say textonymTotal 'digit combination's(textonymTotal) "represent Textonyms."
say

if first \== 0 then say '    first digit key['first']:' space(textonyms.first)
if  last \== 0 then say '     last digit key['last']:' space(textonyms.last)
if  long \== 0 then say '  longest digit key['long']:' space(textonyms.long)
if  most \== 0 then say ' numerous digit key['mostus']:' space(textonyms.mostus) '('most "words)"

exit                                   /*stick a fork in it, we're done.*/

/*──────────────────────────────────S subroutine────────────────────────*/
s:
procedure
  if arg(1) == 1 then return ''
  return 's'   /*a simple pluralizer.*/
