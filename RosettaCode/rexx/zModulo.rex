/* Rexx */
--trace ?r;nop
do
	vals = '3 2, 7 5, 123 4, 10 5, 11 5, 12 5, 13 5, 14 5'

	loop while vals~length() > 0
	  parse var vals N D . ',' rest -- Numerator & denominator (AKA dividend & divisor)
	  vals = rest~strip()
		call test N, D
		call test -N, D
		call test N, -D
		call test -N, -D
		say
		end
end
exit

test:
  procedure
do
	parse arg N ., D .
  tt = 'Remainder vs. modulo:' (N'//'D)~left(8) '&' ('modulo('N',' D')')~left(16) '=='
	Q = N % D        -- Integer quotient
	R = N // D       -- Remainder
	M = modulo(N, D) -- Modulus
  say tt Q~right(4) R~right(4) M~right(4)
	return
end
exit

modulo:
  procedure
do
	parse arg N ., D .
  M = (D + (N // D)) // D
	return M
end
exit

