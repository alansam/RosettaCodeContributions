/* Rexx */
trace ?r;nop
parse arg p
if p = '' then p = 9
eps = 0.5 * 10 ** p
numeric digits p + 1
n = 1
d = 1
do j = 1
	n = j * n + 1
	d = j * d
	if d >= eps then return n / d
	end

