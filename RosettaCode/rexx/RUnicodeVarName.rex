/* Rexx */

-- MathLoadFuncs & MathDropFuncs are no longer needed and are effectively NOPs
-- but MathLoadFuncs does return it's copyright statement when given a string argument
RxMathCopyright = MathLoadFuncs('')
say RxMathCopyright

upperΔ = 1
Δupper = upperΔ
lowerδ = 2
δlower = lowerδ

say upperΔ '+' Δupper '= \-'
upperΔ = upperΔ + Δupper
say upperΔ

say lowerδ '+' δlower '= \-'
lowerδ = lowerδ + δlower
say lowerδ
say

-- UTF-8 works with the ooRexx built-in functions
Υππερ = 'ce91'x~sequence('cea1'x) /*U+0391-U+03A1*/ || 'cea3'x~sequence('cea9'x) /*U+03A3-U+03A9*/ -- ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ
Λοωερ = 'ceb1'x~sequence('cec1'x) /*U+03B1-U+03C1*/ || 'cec3'x~sequence('cec9'x) /*U+03C3-U+03C9*/ -- αβγδεζηθικλμνξοπρστυφχψω
say Υππερ'~Lower =' Υππερ~lower()
say Λοωερ'~Upper =' Λοωερ~upper()
say

-- Note: Even with unicode characters ooRexx variables are case-insensitive
numeric digits 12
digs = digits()
δ = 20.0
π = RxCalcPi(digs)
θ = Π * Δ
σ = Θ ** 2 / (Π * 4) -- == Π * (Δ / 2) ** 2
say 'Π =' π', diameter =' δ', circumference =' Θ', area =' Σ

return
exit

::requires 'RxMath' library

