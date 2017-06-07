/* Rexx */

parse arg ord filler
call drawSierpinskiTriangle ord, filler
return
exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
drawSierpinskiTriangle:
procedure
  trace ?r;nop
  parse arg ordr ., filler .
  if ordr   = '' | ordr   = '.' then ordr   = 4
  if filler = '' | filler = '.' then filler = 'A'
  n = 1 * (2 ** ordr)
  line = ' '~copies(2 * n)
  line = line~overlay(filler, n + 1) -- set the top point of the triangle
  loop i = 0 while i < n
    say line~strip('t')
    u = filler
    loop j = n - i while j < n + i + 1
      j1 = j + 1
      cl = line~substr(j1 - 1, 1)
      cr = line~substr(j1 + 1, 1)
      if cl == cr then t = ' '
      else             t = filler
      line = line~overlay(u, j1 - 1)
      u = t
      end j
      j2 = n + i
      j3 = n + i + 1
      line = line~overlay(t, j2 + 1)
      line = line~overlay(filler, j3 + 1)
    end i
  return

