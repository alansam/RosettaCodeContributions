/*REXX program sorts/shows an array using the  pancake  sort  algorithm.*/
call gen_A                              /*generate elements in the array.*/
call show_A  'before sort'              /*show the BEFORE array elements.*/
call pancakeSort    H_items             /*invoke the pancake sort. Yummy.*/
call show_A  ' after sort'              /*show the  AFTER array elements.*/
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────PANCAKESORT subroutine──────────────*/
pancakeSort:
  procedure expose _A.
  parse arg nItems
 
  do nItems - 1                        /*perform this loop  N-1  times.*/
    !x = _A.1
    ?x = 1
    do j_ = 2 to nItems
      if _A.j_ <= !x then iterate j_
      !x = _A.j_
      ?x = j_
      end j_
    call flip ?x
    call flip nItems
    nItems = nItems - 1
    end /*nItems-1*/
  return

/*──────────────────────────────────FLIP subroutine─────────────────────*/
flip:
  procedure expose _A.
  parse arg w
  do i_ = 1 for (w + 1) % 2        /*In REXX,  %  is integer divide.*/
    kmip1 = w - i_ + 1
    _tmp = _A.i_
    _A.i_ = _A.kmip1
    _A.kmip1 = _tmp
    end i_
  return

/*──────────────────────────────────GEN_A subroutine─────────────────────*/
gen_A:
  _A. = ''                            /*assign a   default  value.     */
                   /*Generate some  bread primes which are primes of the*/
                   /*form:   (p-3)÷2  and  2∙p+3   where  p  is a prime.*/
                   /*Bread primes are related to sandwich & meat primes.*/
  samples = '  2  17   5  29   7  37  13  61  43  181  47  197   67 277   97 397',
            '113 461 137 557 167 677 173 701 797 1117 307 1273 1597 463 1861 467',
            '-55 -21  -1  -8  -8 -21 -55   0   0'
  /*The non-positive numbers above are some negative Fibonacci numbers, some */
  /*of which where specified twice just 'cause I felt like it.    Also, added */
  /*two zeroes, just 'cause.*/
  _A.0 = words(samples)
  do wn = 1 to _A.0
    _A.wn = word(samples, wn)
    end wn
  H_items = _A.0
  return

/*──────────────────────────────────SHOW_A subroutine────────────────────*/
show_A:
  widthH = length(H_items)           /*the maximum width of any line. */
  do k = 1 for H_items
    say 'element' right(k,widthH) arg(1)':' _A.k
    end k
  say copies('─', 79)                     /*show an eyeball separator line.*/
  return

