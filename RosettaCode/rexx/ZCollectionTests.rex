/* Rexx */

ary = .array~of('text', 2, 5, -9, 1024, 'tribble')
lst = .list~of('text', 2, 5, -9, 1024, 'tribble')
ac1 = ary~allItems()
lc1 = lst~allItems()

loop cc over .list~of(ary, lst, ac1, lc1)
  call show cc
  end cc

::routine show
  use arg coll

  collL = coll~items()
  say coll~string() 'of' collL 'items'
  kl = 0
  loop val over coll
    kl += 1
    say kl~right(3)':' val
    end val
  say

  shows = ''
  if \coll~isInstanceOf(.list) then do
    ia = 1
    iz = collL
    end
  else do
    ia = 0
    iz = collL - 1
    end

  loop ix = ia to iz
    shows ||= coll[ix]~string()~changestr(' ', '_')' '
    end ix
  shows = shows~strip('T')~changestr(' ', ',')~changestr('_', ' ')
  say '['shows']'

  return

