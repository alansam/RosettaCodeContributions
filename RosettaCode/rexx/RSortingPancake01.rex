/*REXX program sorts an array using the  pancake-sort  algorithm.       */
call gen@                              /*generate elements in the array.*/
call show@ 'before sort'               /*show the BEFORE array elements.*/
call pancakeSort highItem              /*invoke the   pancake   sort.   */
call show@ ' after sort'               /*show the  AFTER array elements.*/
exit
/*──────────────────────────────────PANCAKESORT subroutine──────────────*/
pancakeSort: procedure expose @.; parse arg n
 
          do n-1
          !=@.1;   ?=1
                                        do j=2 to n
                                        if @.j<=! then iterate
                                        !=@.j;    ?=j
                                        end   /*j*/
          call flip ?;   call flip n
          n=n-1
          end   /*n-1*/
return
/*──────────────────────────────────FLIP subroutine─────────────────────*/
flip: procedure expose @.; parse arg w
 
            do j=1 for (w+1)%2
            kmip1=w-j+1;   _=@.j;   @.j=@.kmip1;   @.kmip1=_
            end
return
/*──────────────────────────────────GEN@ subroutine─────────────────────*/
gen@: @.=''                            /*assign a   default  value.     */
                   /*Generate some  bread primes which are primes of the*/
                   /*form:   (p-3)÷2  and  2*p+3   where  p  is a prime.*/
                   /*Bread primes are related to sandwich & meat primes.*/
 
 @.1=    2   ;              @.17=  113
 @.2=   17   ;              @.18=  461
 @.3=    5   ;              @.19=  137
 @.4=   29   ;              @.20=  557
 @.5=    7   ;              @.21=  167
 @.6=   37   ;              @.22=  677
 @.7=   13   ;              @.23=  173
 @.8=   61   ;              @.24=  701
 @.9=   43   ;              @.25=  797
@.10=  181   ;              @.26= 1117
@.11=   47   ;              @.27=  307
@.12=  197   ;              @.28= 1237
@.13=   67   ;              @.29= 1597
@.14=  277   ;              @.30=  463
@.15=   97   ;              @.31= 1861
@.16=  397   ;              @.32=  467
 
  do highItem=1 while @.highItem\==''  /*find how many entries in array.*/
  end
 
highItem=highItem-1                    /*adjust the  highItem  slightly.*/
return
/*──────────────────────────────────SHOW@ subroutine────────────────────*/
show@: widthH=length(highItem)         /*the maximum width of any line. */
 
          do k=1 for highItem
          say 'element' right(k,widthH) arg(1)':' @.k
          end    /*k*/
 
say copies('-',80)                     /*show an eyeball separator line.*/
return

