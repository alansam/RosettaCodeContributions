/* NetRexx */

call runSample arg
return

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
isEqual:
procedure
  use arg list
  say list~allItems
  state = (1 == 1) -- default to true
  loop ix = 1 while ix < list~items
    state = list[ix - 1] == list[ix]
    if \state then leave ix
    end ix
  return state

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
isAscending:
procedure
  use arg list
  state = (1 == 1) -- default to true
  loop ix = 1 while ix < list~items
    state = list[ix - 1] << list[ix]
    if \state then leave ix
    end ix
  return state

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
runSample:
procedure
  parse arg rg

  samples = .list~of( -
      .list~of('AA', 'BB', 'CC') -
    , .list~of('AA', 'AA', 'AA') -
    , .list~of('AA', 'CC', 'BB') -
    , .list~of('single_element') -
    )

  loop ix = 0 while ix < samples~items
    sample = samples[ix]
    say sample

    if isEqual(sample)     then eq  = 'elements are identical'
                           else eq  = 'elements are not identical'
    if isAscending(sample) then asc = 'elements are in ascending order'
                           else asc = 'elements are not in ascending order'

    say 'List:' toString(sample)
    say '  'eq
    say '  'asc
    end ix
  return

-- ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
toString:
procedure
  use arg list
  res = '['
  loop ix = 0 while ix < list~items
    res = res || list[ix] || ','
    end ix
  res = res~strip('t', ',') || ']'
  return res

