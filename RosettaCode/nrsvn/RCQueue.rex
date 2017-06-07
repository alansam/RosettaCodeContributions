#!/usr/bin/env rexx
/* Rexx */

Do
  Call viewQueue

  a = "Fred"
  Push      /* Puts a null line onto the queue */
  Push a 2  /* Puts "Fred 2" onto the queue */
  Call viewQueue

  a = "Toft"
  Queue a 2 /* Enqueues "Toft 2" */
  Queue     /* Enqueues a null line behind the last */
  Call viewQueue

  Do q_ = 1 while queued() > 0
    Parse pull line
    Say right(q_, 3)':' line
    End q_
  Call viewQueue

  Return
End
Exit

viewQueue:
Procedure
Do
  If queued() = 0 then Do
    Say 'Queue is empty'
    End
  else Do
    Say 'There are' queued() 'elements in the queue'
    End

  Return
End
Exit
