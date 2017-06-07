/* Rexx */
Do
  Queue 5
  Queue 50
  Queue 9000

  Do label n_ while queued() > 0
    Parse pull v_ .
    Say strip(x2b(d2x(v_)), 'L', '0')
    End n_

  Return
End
Exit

