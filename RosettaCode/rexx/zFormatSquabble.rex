/* Rexx */

parse source ss
parse version vv
say ss
say vv
drop !I !F
something.!I = 3
something.!F = 3.0

say format(something.!I,,,, 0)
say format(something.!F,,,, 0)

if pos("ooRexx", vv) > 0 then do
  interpret "say" something.!I"~format(,,, 0)"
  interpret "say" something.!F"~format(,,, 0)"
  end

