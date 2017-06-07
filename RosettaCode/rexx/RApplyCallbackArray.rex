/*REXX program to apply a callback to an array.  */
        a.='';   b.=''
 a.0= 0
 a.1= 1
 a.2= 2
 a.3= 3
 a.4= 4
 a.5= 5
 a.6= 6
 a.7= 7
 a.8= 8
 a.9= 9
a.10=10
 
call listab 'before'
call bangit 'a','b'      /*factorialize the A array, store results in B */
call listab ' after'
exit
/*─────────────────────────────────────BANGIT subroutine────────────────*/
bangit:   do j=0
          _=value(arg(1)'.'j); if _=='' then return
          call value arg(2)'.'j,fact(_)
          end
/*─────────────────────────────────────FACT subroutine──────────────────*/
fact: procedure; !=1; do j=2 to arg(1); !=!*j; end; return !
 
/*─────────────────────────────────────LISTAB subroutine────────────────*/
listab: do j=0 while a.j\==''
        say arg(1) 'a.'j"="a.j
        end
say
        do j=0 while b.j\==''
        say arg(1) 'b.'j"="b.j
        end
return

/*
output

before a.0=0
before a.1=1
before a.2=2
before a.3=3
before a.4=4
before a.5=5
before a.6=6
before a.7=7
before a.8=8
before a.9=9
before a.10=10

 after a.0=0
 after a.1=1
 after a.2=2
 after a.3=3
 after a.4=4
 after a.5=5
 after a.6=6
 after a.7=7
 after a.8=8
 after a.9=9
 after a.10=10

 after b.0=1
 after b.1=1
 after b.2=2
 after b.3=6
 after b.4=24
 after b.5=120
 after b.6=720
 after b.7=5040
 after b.8=40320
 after b.9=362880
 after b.10=3628800
[edit]RLaB
*/
