/* Rexx */

N = 5
D = 26
Z.0 = 8
Z.1 = N // D
Z.2 = -N // D
Z.3 = rem(N, D)
Z.4 = rem(-N, D)
Z.5 = (D + (N // D)) // D -- rem(D + rem(N, D), D)
Z.6 = (D + (-N // D)) // D -- rem(D + rem(N, D), D)
Z.7 = mod(N, D)
Z.8 = mod(-N, D)

Do z_ = 1 to Z.0
  Say z_":" Z.z_
  End z_

Exit

rem:
  Procedure

Parse Arg N, D

Return N - D * (N % D)

mod:
  Procedure

Parse Arg N, D

Return rem(D + rem(N, D), D)

