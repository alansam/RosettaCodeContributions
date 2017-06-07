/*REXX program sorts/shows an array using the  pancake  sort  algorithm.*/
call gen_A                              /*generate elements in the array.*/
call show_A  'before sort'              /*show the BEFORE array elements.*/
call pancakeSort    H_items             /*invoke the pancake sort. Yummy.*/
call show_A  ' after sort'              /*show the  AFTER array elements.*/
exit                                   /*stick a fork in it, we're done.*/
/*──────────────────────────────────PANCAKESORT subroutine──────────────*/
pancakeSort: procedure expose _A.;   parse arg n
 
          do n-1                        /*perform this loop  N-1  times.*/
          !=_A.1;   ?=1
                                        do j=2  to n
                                        if _A.j<=!  then iterate
                                        !=_A.j;     ?=j
                                        end   /*j*/
          call flip ?;   call flip n
          n=n-1
          end   /*n-1*/
return
/*──────────────────────────────────FLIP subroutine─────────────────────*/
flip: procedure expose _A.;  parse arg w
            do i=1  for (w+1)%2        /*In REXX,  %  is integer divide.*/
            kmip1=w-i+1;   _=_A.i;   _A.i=_A.kmip1;   _A.kmip1=_
            end   /*i*/
return
/*──────────────────────────────────GEN_A subroutine─────────────────────*/
gen_A: _A.=''                            /*assign a   default  value.     */
                   /*Generate some  bread primes which are primes of the*/
                   /*form:   (p-3)÷2  and  2∙p+3   where  p  is a prime.*/
                   /*Bread primes are related to sandwich & meat primes.*/
 
 _A.1=    2   ;              _A.17=  113  ;            _A.33= -55
 _A.2=   17   ;              _A.18=  461  ;            _A.34= -21
 _A.3=    5   ;              _A.19=  137  ;            _A.35=  -1
 _A.4=   29   ;              _A.20=  557  ;            _A.36=  -8
 _A.5=    7   ;              _A.21=  167  ;            _A.37=  -8
 _A.6=   37   ;              _A.22=  677  ;            _A.38= -21
 _A.7=   13   ;              _A.23=  173  ;            _A.39= -55
 _A.8=   61   ;              _A.24=  701  ;            _A.40=   0
 _A.9=   43   ;              _A.25=  797  ;            _A.41=   0
_A.10=  181   ;              _A.26= 1117
_A.11=   47   ;              _A.27=  307        /*The non-positive numbers*/
_A.12=  197   ;              _A.28= 1237        /*above are some negative */
_A.13=   67   ;              _A.29= 1597        /*Fibonacci numbers, some */
_A.14=  277   ;              _A.30=  463        /*of which where specified*/
_A.15=   97   ;              _A.31= 1861        /*twice just 'cause I felt*/
_A.16=  397   ;              _A.32=  467        /*like it.    Also, added */
                                              /*two zeroes, just 'cause.*/
  do H_items=1 while _A.H_items\==''; end /*find how many entries in array.*/
 
H_items=H_items-1                        /*adjust the  H_items  slightly.  */
return
/*──────────────────────────────────SHOW_A subroutine────────────────────*/
show_A: widthH=length(H_items)           /*the maximum width of any line. */
                             do k=1  for H_items
                             say 'element'  right(k,widthH) arg(1)':'  _A.k
                             end  /*k*/
say copies('─',79)                     /*show an eyeball separator line.*/
return

