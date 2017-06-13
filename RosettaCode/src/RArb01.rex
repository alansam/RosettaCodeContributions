/* Rexx */

/* precision must be set manually */

numeric digits 200000

check = '62060698786608744707...92256259918212890625'

rt = time('r')
n = 5 ** (4 ** (3 ** 2))
rt = time('e')

Say 'Calculation time:' rt's'
Say

sampl = left(n, 20)"..."right(n, 20)

Say ' Check:' check
Say 'Sample:' sampl
Say 'Digits:' length(n)
Say
If check = sampl,
then,
  Say 'Passed!'
else,
  Say 'Failed!'
Say

