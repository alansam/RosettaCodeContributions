/* Rexx */

parse arg arglist
call runSample arglist
return
exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
factor:
procedure
  parse arg val .
  rv = 1
  if val > 1 then do
    rv = ''
    do n_ = val until n_ = 1
      parse value checkFactor(2, n_, rv) with n_ rv
      if n_ = 1 then leave n_
      parse value checkFactor(3, n_, rv) with n_ rv
      if n_ = 1 then leave n_
      do m_ = 5 to n_ by 2
        if m_ // 3 = 0 then iterate m_
        parse value checkFactor(m_, n_, rv) with n_ rv
        if n_ = 1 then leave m_
        end m_
      end n_
    end

  return rv

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
checkFactor:
procedure
  msym = 'x'
  parse arg mult, n_, fac
  do while n_ // mult = 0
    fac = fac msym mult
    n_ = n_ % mult
    end
  fac = space(strip(space(fac), 'l', msym))
  return n_ fac

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
runSample:
procedure
  parse arg samplesList
  -- input a list of pairs of numbers - no checking is done
  if samplesList = '' then samplesList = '1 11    71 101    999 1020    9970 10010'
  do while samplesList \= ''
    parse var samplesList lv rv samplesList
    say
    say copies('-', 60)
    say right(lv, 8) 'to' rv
    say copies('-', 60)
    do fv = lv to rv
      fac = factor(fv)
      pv = ''
      if words(fac) = 1 then pv = '<prime>'
      say right(fv, 8) '=' fac pv
      end fv
    end
  
  return

