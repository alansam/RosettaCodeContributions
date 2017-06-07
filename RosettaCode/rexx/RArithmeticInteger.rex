/*REXX*/
say "enter 2 integer values separated by blanks"
parse pull a b
say a "+" b "=" a+b
say a "-" b "=" a-b
say a "*" b "=" a*b
say a "/" b "=" a%b "remaining" a//b "(sign from first operand)"
say a "^" b "=" a**b

/*
output

enter 2 integer values separated by blanks
17 -4
17 + -4 = 13
17 - -4 = 21
17 * -4 = -68
17 / -4 = -4 remaining 1 (sign from first operand)
17 ^ -4 = 0.0000119730367
*/
