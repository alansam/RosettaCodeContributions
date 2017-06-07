#!/usr/bin/env rexx
/* Rexx */
-- =============================================================================

Do
  --Trace ?R;Nop

  Loop j = 0 to 4
    Say
    Loop k = 0 to 10
      Say 'ackermann('j','k') =' ackermann(j, k)~right(5)
      End k
    End j
  Return
End
Exit

-- -----------------------------------------------------------------------------
ackermann: Procedure
  Arg m, n
  If m = 0 then Return n + 1
  If n = 0 then Return ackermann(m - 1, 1)
  Return ackermann(m - 1, ackermann(m, n - 1))

-- =============================================================================

