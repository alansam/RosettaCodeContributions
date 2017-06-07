*     write (89,100) "Goodbye, world"
*     This will write to unit 89.
*     On UNIX systems by fdefault this writes to a file: "fort.89"
      write (6, 100) "Goodbye, world" 
      stop
100   format(5X, A, '!')
      end

