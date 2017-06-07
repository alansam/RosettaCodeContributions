/* Rexx */

-- "a" (!=) "" (==) "b" (=) "" (!=) "c"
teststring = 'a!===b=!=c'

Parse Var teststring p1 '!=' p2 '==' p3 '=' p4 '!=' p5

Say '<p>'p1'</p> <p>'p2'</p> <p>'p3'</p> <p>'p4'</p> <p>'p5'</p>'

