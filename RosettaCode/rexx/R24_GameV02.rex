/*REXX program to play the game of  24.                             */
/*------------------------------------------------------------------+
| Argument is either of three forms:   (blank)                     |
|                                      ssss                        |
|                                      ssss-ffff                   |
|                                                                  |
| where one or both strings must be exactly four numerals (digits) |
| comprised soley of the numerals (digits)  1 --> 9   (no zeroes). |
|                                                                  |
|                                      SSSS  is the start,         |
|                                      FFFF  is the start.         |
|                                                                  |
| If no argument is specified, this program finds a four digit     |
| number (no zeroes) which has at least one solution, and shows    |
| the number to the user, requesting that they enter a solution    |
| in the form of:    a  operator  b  operator  c  operator  d      |
| where  a  b  c  and  d  are single digit numbers  (no zeroes),   |
| and    operator  can be any one of:     +    -    *    or    /   |
| Parentheses ()  may be used in the normal manner for grouping,   |
| as well as brackets []  or braces  {}.                           |
+------------------------------------------------------------------*/
  Parse Arg orig                    /* get the  guess  from the argume*/
  orig=space(orig,0)                /* remove extraneous blanks from  */
  Parse Var orig start '-' finish   /* get the start & finish (maybe).*/
  finish=word(finish start,1)       /* if no  FINISH  specified, use  */
  opers='+-*/'                      /* define the legal arithmetic ope*/
  ops=length(opers)                 /* ... and the count of them (leng*/
  groupsymbols='()[]{}'             /* legal grouping symbols.        */
  indent=left('',30)                /* used to indent display of solut*/
  lpar='('                          /* a string to make REXX code pret*/
  rpar=')'                          /* ditto.                         */
  show=1                            /* flag used show solutions  (0 = */
  digs=123456789                    /* numerals (digits) that can be u*/
 
  Do j=1 For ops                    /* define a version for fast execu*/
    o.j=substr(opers,j,1)
    End                             /* j                              */
 
  If orig>'' Then Do
    sols=solve(start,finish)
    If sols<0 Then
      Exit 13
    If sols==0 Then
      sols='No'                     /* un-geek SOLS.                  */
    Say
    Say sols 'unique solution's(finds) "found for" orig /*pluralize.*/
    Exit
    End
  show=0                            /* stop SOLVE from blabbing soluti*/
  Do Forever
    rrrr=random(1111,9999)
    If pos(0,rrrr)>0 Then
      Iterate
    If solve(rrrr)<>0 Then
      Leave
    End
  show=1                            /* enable SOLVE to show solutions.*/
  rrrr=sort(rrrr)                   /* sort four elements.            */
  rd.=0
  Do j=1 For 9                      /* digit count # for each digit in*/
    us=substr(rrrr,j,1)
    rd.us=countdigs(rrrr,us)
    End                             /* j                              */
 
  Do guesses=1
    Say
    Say 'Using the digits' rrrr,
  ", enter an expression that equals 24 (or QUIT):"
    Pull y
    y=space(y,0)
    If y=='QUIT' Then
      Exit
    usv=verify(y,digs||opers||groupsymbols)
    If usv>0 Then Do
      Call ger 'invalid character:' substr(usv,1)
      Iterate
      End
    yl=length(y)
    If y='' Then Do
      Call validate y
      Iterate
      End
 
    Do j=1 To yl-1
      ch=substr(y,j,1)
      If datatype(ch,'W')=0 Then
        Iterate
      ch=substr(y,j+1,1)
      If datatype(ch,'W') Then Do
        Call ger 'invalid use of digit abuttal'
        Iterate guesses
        End
      End                           /* j                              */
 
    yd=countdigs(y,digs)            /* count of digits 123456789.     */
    If yd<4 Then Do
      Call ger 'not enough digits entered.'
      Iterate guesses
      End
    If yd>4 Then Do
      Call ger 'too many digits entered.'
      Iterate guesses
      End
 
    Do j=1 For 9
      If rd.j==0 Then
        Iterate
      usd=countdigs(y,j)
      If usd==rd.j Then
        Iterate
      If usd<rd.j Then
        Call ger 'not enough' j "digits, must be" rd.j
      Else
        Call ger 'too many' j "digits, must be" rd.j
      Iterate guesses
      End                           /* j                              */
 
    y=translate(y,'()()',"[]{}")
    Signal On Syntax
    Interpret 'ans='y
    ans=ans/1
    If ans==24 Then
      Leave guesses
    Say 'incorrect,' y'='ans
    End                             /* guesses                        */
 
  Say
  Say center('+---------------------+',79)
  Say center('|                     |',79)
  Say center('|  congratulations !  |',79)
  Say center('|                     |',79)
  Say center('+---------------------+',79)
  Exit
 
syntax:
  Call ger 'illegal syntax in' y
  Exit
/*---------------------------SOLVE subroutine-----------------------*/
solve:
  Parse Arg ssss,ffff               /* parse the argument passed to  S*/
  If ffff=='' Then
    ffff=ssss                       /* create a   FFFF   if necessary.*/
  If validate(ssss)=0 Then
    Return-1
  If validate(ffff)=0 Then
    Return-1
  finds=0                           /* number of found solutions (so f*/
  x.=0                              /* a method to hold unique express*/
/*alternative:  indent=copies(' ',30)  */
 
  Do g=ssss To ffff                 /* process a (possible) range of v*/
    If pos(0,g)>0 Then
      Iterate                       /* ignore values with zero in them*/
 
    Do j=1 For 4                    /* define a version for fast execu*/
      g.j=substr(g,j,1)
      End                           /* j                              */
 
    Do i=1 For ops                  /* insert an operator after 1st nu*/
      Do j=1 For ops                /* insert an operator after 2nd nu*/
        Do k=1 For ops              /* insert an operator after 2nd nu*/
          Do m=0 To 4-1
            l.=''                   /* assume no left parenthesis so f*/
            Do n=m+1 To 4           /* match left paren with a right p*/
              l.m=lpar              /* define a left paren, m=0 means */
              r.=''                 /* un-define all right parenthesis*/
              If m==1&n==2 Then
                l.=''               /* special case:  (n)+ ...        */
              Else
                If m>0 Then
                  r.n=rpar          /* no (, no )                     */
                e=l.1 g.1 o.i l.2 g.2 o.j l.3 g.3 r.3 o.k g.4 r.4
              e=space(e,0)          /* remove all blanks from the expr*/
 
/*(below) change expression:           */
/* /(yyy)   ===>   /div(yyy) */
/*Enables to check for division by zero*/
              orige=e               /* keep old version for the displa*/
              If pos('/(',e)>0 Then
                e=changestr('/(',e,"/div(")
/*The above could be replaced by:      */
/* e=changestr('/(',e,"/div(") */
 
/*INTERPRET stresses REXX's groin, */
/*so try to avoid repeated lifting.*/
              If x.e Then
                Iterate             /* was the expression already used*/
              x.e=1                 /* mark this expression as unique.*/
/*have REXX do the heavy lifting.  */
              Interpret 'x='e
              x=x/1                 /* remove trailing decimal points.*/
              If x<>24 Then
                Iterate             /* Not correct?  Try again.       */
              finds=finds+1         /* bump number of found solutions.*/
              us=translate(orige,'][',")(") /*show  [],  not  ().*/
              If show Then
                Say indent 'a solution:' us /*show solution*/
              End                   /* n                              */
            End                     /* m                              */
          End                       /* k                              */
        End                         /* j                              */
      End                           /* i                              */
    End                             /* g                              */
 
  Return finds
/*---------------------------DIV subroutine-------------------------*/
div: Procedure
  Parse Arg q                       /* tests if dividing by  0  (zero)*/
  If q=0 Then
    q=1e9                           /* if dividing by zero, change div*/
  Return q                          /* changing Q invalidates the expr*/
/*---------------------------COUNTDIGS subroutine-------------------*/
countdigs:
  Arg field,numerals                /* count of digits NUMERALS.      */
  Return length(field)-length(space(translate(field,,numerals),0))
/*---------------------------GER subroutine-------------------------*/
ger:
  Say
  Say '*** error! *** for argument:' y
  Say arg(1)
  Say
  errcode=1
  Return 0
/*---------------------------SORT subroutine------------------------*/
sort: Procedure
  Arg nnnn
  l=length(nnnn)
 
  Do j=1 For l                      /* build an array of digits from  */
    a.j=substr(nnnn,j,1)            /* this enables SORT to sort an ar*/
    End
 
  Do j=1 For l
    us=a.j
    Do k=j+1 To l
      If a.k<us Then Do
        a.j=a.k
        a.k=us
        us=a.k
        End
      End                           /* k                              */
    End                             /* j                              */
  Return a.1||a.2||a.3||a.4
/*---------------------------validate subroutine--------------------*/
validate:
  Parse Arg y
  errcode=0
  usv=verify(y,digs)
  Select
    When y=='' Then
      Call ger 'no digits entered.'
    When length(y)<4 Then
      Call ger 'not enough digits entered, must be 4'
    When length(y)>4 Then
      Call ger 'too many digits entered, must be 4'
    When pos(0,y)>0 Then
      Call ger "can't use the digit  0 (zero)"
    When usv>0 Then
      Call ger 'illegal character:' substr(y,usv,1)
    Otherwise
      Nop
    End                             /* select                         */
  Return (errcode=0)
/*---------------------------S subroutine---------------------------*/
s:
  If arg(1)=1 Then
    Return ''
  Return 's'                        /* simple pluralizer.             */
 
