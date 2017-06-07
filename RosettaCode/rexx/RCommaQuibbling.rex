/* Rexx */

i_ = 0
i_ = i_ + 1; lists.0 = i_; lists.i_ = '[]'
i_ = i_ + 1; lists.0 = i_; lists.i_ = '["ABC"]'
i_ = i_ + 1; lists.0 = i_; lists.i_ = '["ABC", ''DEF'']'
i_ = i_ + 1; lists.0 = i_; lists.i_ = '[ABC, DEF, G, H]'

say
do i_ = 1 to lists.0
  list = lists.i_
  say right(list, 30) ':' quibbling01(list)
  end i_
say
do i_ = 1 to lists.0
  list = lists.i_
  say right(list, 30) ':' quibbling02(list)
  end i_
say
do i_ = 1 to lists.0
  list = lists.i_
  say right(list, 30) ':' quibbling03(list)
  end i_
exit

quibbling01:
procedure
  parse arg '[' list ']'
  list = space(translate(list, '', '"'''), 1)
  list = changestr(',', list, '')
  Select
    When list = '' Then result = ''
    When words(list) = 1 then result=word(list, 1)
    Otherwise
      result=translate(strip(subword(list, 1, words(list) - 1)), ',', ' '),
      'and' word(list, words(list))
    End
  Return '{'result'}'

quibbling02:
procedure
  parse arg '[' list ']'
  list = space(translate(list, '', '"'','), 1)
  If list = '' Then result = ''
  Else Do
    Do wi = 1 By 1 while list <> ''
      Parse Var list word.wi ' ' list
      End
    wn = wi - 1
    result = word.1
    Do wi = 2 To wn - 1
      result = result', 'word.wi
      End
    If wn > 1 Then
      result = result 'and' word.wn
    End
    result = space(result, 1)
  Return '{'result'}'

quibbling03:
procedure
  parse arg '[' lst ']'
  lst = changestr('"', changestr("'", lst, ''), '') -- remove double & single quotes
  lc = lastpos(',', lst)
  if lc > 0 then
    lst = overlay(' ', insert('and', lst, lc), lc)
  lst = space(lst, 1) -- remove extra spaces
  return '{'lst'}'

