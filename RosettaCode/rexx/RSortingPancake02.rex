/*REXX program sorts an array using the  pancake-sort  algorithm.       */
call genA_                              /*generate elements in the array.*/
call showA_ 'before sort'               /*show the BEFORE array elements.*/
call pancakeSort highItem              /*invoke the   pancake   sort.   */
call showA_ ' after sort'               /*show the  AFTER array elements.*/
exit
/*──────────────────────────────────PANCAKESORT subroutine──────────────*/
pancakeSort:
procedure expose A_.;
  parse arg n

  do n - 1
    ! = A_.1;
    ? = 1
    do j = 2 to n
      if A_.j <= ! then iterate
      ! = A_.j;
      ? = j
      end j
    call flip ?;
    call flip n
    n = n - 1
    end   /*n-1*/
  return

/*──────────────────────────────────FLIP subroutine─────────────────────*/
flip:
procedure expose A_.;
  parse arg w

  do j = 1 for (w + 1) % 2
    kmip1 = w - j + 1;
    _ = A_.j;
    A_.j = A_.kmip1;
    A_.kmip1 = _
    end j
  return

/*──────────────────────────────────GENA_ subroutine─────────────────────*/
genA_: A_.=''                            /*assign a   default  value.     */
                   /*Generate some  bread primes which are primes of the*/
                   /*form:   (p-3)÷2  and  2*p+3   where  p  is a prime.*/
                   /*Bread primes are related to sandwich & meat primes.*/

 A_.1=    2   ;              A_.17=  113
 A_.2=   17   ;              A_.18=  461
 A_.3=    5   ;              A_.19=  137
 A_.4=   29   ;              A_.20=  557
 A_.5=    7   ;              A_.21=  167
 A_.6=   37   ;              A_.22=  677
 A_.7=   13   ;              A_.23=  173
 A_.8=   61   ;              A_.24=  701
 A_.9=   43   ;              A_.25=  797
A_.10=  181   ;              A_.26= 1117
A_.11=   47   ;              A_.27=  307
A_.12=  197   ;              A_.28= 1237
A_.13=   67   ;              A_.29= 1597
A_.14=  277   ;              A_.30=  463
A_.15=   97   ;              A_.31= 1861
A_.16=  397   ;              A_.32=  467

  do highItem = 1 while A_.highItem \== ''  /*find how many entries in array.*/
    end

highItem = highItem - 1                    /*adjust the  highItem  slightly.*/
return

/*──────────────────────────────────SHOWA_ subroutine────────────────────*/
showA_:
  widthH = length(highItem)         /*the maximum width of any line. */

  do k = 1 for highItem
    say 'element' right(k, widthH) arg(1)':' A_.k
    end k

  say copies('-', 80)                     /*show an eyeball separator line.*/
  return

