/* Generated from 'PalindromeDetection.nrx' 3 Nov 2012 09:15:28 [v3.01] *//* Options: Compact Crossref Decimal Java Logo Symbols Trace2 UTF8 Verbose3 */
public class PalindromeDetection{private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("string = ");private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);private static final java.lang.String $0="PalindromeDetection.nrx";public static void main(java.lang.String $0s[]){netrexx.lang.Rexx y;netrexx.lang.Rexx pal;y=netrexx.lang.Rexx.toRexx("In girum imus nocte et consumimur igni");



netrexx.lang.RexxIO.Say("");
netrexx.lang.RexxIO.Say($01.OpCc(null,y));
netrexx.lang.RexxIO.Say("");

pal=isPal(y);

if (pal.OpEqS(null,$02)) netrexx.lang.RexxIO.Say("The string isn\'t palindromic.");
else netrexx.lang.RexxIO.Say("The string is palindromic.");return;}

public static netrexx.lang.Rexx isPal(netrexx.lang.Rexx x){
x=x.upper().space(new netrexx.lang.Rexx((byte)0));
return new netrexx.lang.Rexx(x.OpEqS(null,x.reverse()));}private PalindromeDetection(){return;}}