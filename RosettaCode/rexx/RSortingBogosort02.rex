/*REXX program to perform a type of bogo sort on an array. */
 a.1=          0            /*this is really the 0th Berstel number... */
 a.2=          0
 a.3=          1
 a.4=          2
 a.5=          0
 a.6=         -4
 a.7=          0
 a.8=         16
 a.9=         16
a.10=        -32
a.11=        -64
a.12=         64
a.13=        256
a.14=          0
a.15=       -768
a.16=       -512
a.17=       2048
a.18=       3072
a.19=      -4096
a.20=     -12288
a.21=       4096
a.22=      40960
a.23=      16384
a.24=    -114688
a.25=    -131072
a.26=     262144
a.27=     589824
a.28=    -393216
a.29=   -2097152
a.30=    -262144
a.31=    6291456
a.32=    5242880
a.33=  -15728640
a.34=  -27262976
a.35=   29360128
a.36=  104857600
a.37=  -16777216
a.38= -335544320
a.39= -184549376
a.40=  905969664
 
size=40                   /*we have a list of two score Berstel numbers.*/
call tell 'un-bogoed'
 
  do bogo=1
 
    do j=1 for size
    _=a.j
 
      do k=j+1 to size
      if a.k>=_ then iterate
      n=random(j,k)               /*we have an num out of order.get rand*/
        do forever; m=random(j,k) /*get another random number.*/
        if m\==n then leave       /*ensure we're not swapping the same #*/
        end
      parse value a.n a.m with a.m a.n  /*swap 2 random nums*/
      iterate bogo
      end   /*k*/
 
    end     /*j*/
 
  leave
  end     /*bogo*/
 
say 'number of bogo sorts performed =' bogo-1
call tell '   bogoed'
exit
 
tell: say 
say center(arg(1),40,'-')
  do j=1 to size
  say arg(1) 'element'right(j,length(size))'='right(a.j,20)
  end
say
return

/*
output

---------------un-bogoed----------------
un-bogoed element 1=                   0
un-bogoed element 2=                   0
un-bogoed element 3=                   1
un-bogoed element 4=                   2
un-bogoed element 5=                   0
un-bogoed element 6=                  -4
un-bogoed element 7=                   0
un-bogoed element 8=                  16
un-bogoed element 9=                  16
un-bogoed element10=                 -32
un-bogoed element11=                 -64
un-bogoed element12=                  64
un-bogoed element13=                 256
un-bogoed element14=                   0
un-bogoed element15=                -768
un-bogoed element16=                -512
un-bogoed element17=                2048
un-bogoed element18=                3072
un-bogoed element19=               -4096
un-bogoed element20=              -12288
un-bogoed element21=                4096
un-bogoed element22=               40960
un-bogoed element23=               16384
un-bogoed element24=             -114688
un-bogoed element25=             -131072
un-bogoed element26=              262144
un-bogoed element27=              589824
un-bogoed element28=             -393216
un-bogoed element29=            -2097152
un-bogoed element30=             -262144
un-bogoed element31=             6291456
un-bogoed element32=             5242880
un-bogoed element33=           -15728640
un-bogoed element34=           -27262976
un-bogoed element35=            29360128
un-bogoed element36=           104857600
un-bogoed element37=           -16777216
un-bogoed element38=          -335544320
un-bogoed element39=          -184549376
un-bogoed element40=           905969664

number of bogo sorts performed = 3652

----------------  bogoed----------------
  bogoed element 1=          -335544320
  bogoed element 2=          -184549376
  bogoed element 3=           -27262976
  bogoed element 4=           -16777216
  bogoed element 5=           -15728640
  bogoed element 6=            -2097152
  bogoed element 7=             -393216
  bogoed element 8=             -262144
  bogoed element 9=             -131072
  bogoed element10=             -114688
  bogoed element11=              -12288
  bogoed element12=               -4096
  bogoed element13=                -768
  bogoed element14=                -512
  bogoed element15=                 -64
  bogoed element16=                 -32
  bogoed element17=                  -4
  bogoed element18=                   0
  bogoed element19=                   0
  bogoed element20=                   0
  bogoed element21=                   0
  bogoed element22=                   0
  bogoed element23=                   1
  bogoed element24=                   2
  bogoed element25=                  16
  bogoed element26=                  16
  bogoed element27=                  64
  bogoed element28=                 256
  bogoed element29=                2048
  bogoed element30=                3072
  bogoed element31=                4096
  bogoed element32=               16384
  bogoed element33=               40960
  bogoed element34=              262144
  bogoed element35=              589824
  bogoed element36=             5242880
  bogoed element37=             6291456
  bogoed element38=            29360128
  bogoed element39=           104857600
  bogoed element40=           905969664
number of bogo sorts performed = 3652

----------------  bogoed----------------
  bogoed element 1=          -335544320
  bogoed element 2=          -184549376
  bogoed element 3=           -27262976
  bogoed element 4=           -16777216
  bogoed element 5=           -15728640
  bogoed element 6=            -2097152
  bogoed element 7=             -393216
  bogoed element 8=             -262144
  bogoed element 9=             -131072
  bogoed element10=             -114688
  bogoed element11=              -12288
  bogoed element12=               -4096
  bogoed element13=                -768
  bogoed element14=                -512
  bogoed element15=                 -64
  bogoed element16=                 -32
  bogoed element17=                  -4
  bogoed element18=                   0
  bogoed element19=                   0
  bogoed element20=                   0
  bogoed element21=                   0
  bogoed element22=                   0
  bogoed element23=                   1
  bogoed element24=                   2
  bogoed element25=                  16
  bogoed element26=                  16
  bogoed element27=                  64
  bogoed element28=                 256
  bogoed element29=                2048
  bogoed element30=                3072
  bogoed element31=                4096
  bogoed element32=               16384
  bogoed element33=               40960
  bogoed element34=              262144
  bogoed element35=              589824
  bogoed element36=             5242880
  bogoed element37=             6291456
  bogoed element38=            29360128
  bogoed element39=           104857600
  bogoed element40=           905969664

More tests showed that: 

number of bogo sorts performed = 2583
number of bogo sorts performed = 2376
number of bogo sorts performed = 1791
number of bogo sorts performed = 2537
number of bogo sorts performed = 1856
number of bogo sorts performed = 2339
number of bogo sorts performed = 2511
number of bogo sorts performed = 2652
number of bogo sorts performed = 1697
number of bogo sorts performed = 1782
number of bogo sorts performed = 2074
number of bogo sorts performed = 4017
number of bogo sorts performed = 2469
number of bogo sorts performed = 3707
number of bogo sorts performed = 1729
number of bogo sorts performed = 1705
number of bogo sorts performed = 4071
*/
