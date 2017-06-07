/* Rexx */

/* precision must be set manually */

/**
 * Using the in-built capabilities of your language, calculate the integer value of:
 * <br />
 * &nbsp;&nbsp;5<sup>4<sup>3<sup>2</sup></sup></sup>
 * <ul>
 * <li>Confirm that the first and last twenty digits of the answer are: <code>62060698786608744707...92256259918212890625</code></li>
 * <li>Find and show the number of decimal digits in the answer.</li>
 * </ul>
 * <p>
 * C.F. <a href="http://rosettacode.org/wiki/Long_multiplication">Long multiplication</a>
 * <h5>Note:</h5>
 * <ul>
 * <li>
 * Do not submit an implementation of <a href="http://en.wikipedia.org/wiki/arbitrary_precision_arithmetic">arbitrary precision arithmetic</a>.
 * The intention is to show the capabilities of the language as supplied. If a language has a
 * <a href="http://rosettacode.org/wiki/Talk:Arbitrary-precision_integers_(included)#Use_of_external_libraries"single, overwhelming, library</a>
 * of varied modules that is endorsed by its home site Ð such as
 * <a href="http://rosettacode.org/mw/index.php?title=CPAN&action=edit&redlink=1">CPAN</a>
 * for Perl or <a href="http://rosettacode.org/wiki/Boost">Boost</a> for C++ Ð then that may be used instead.
 * </li>
 * <li>
 * Strictly speaking, this should not be solved by fixed-precision numeric libraries where the precision has
 * to be manually set to a large value; although if this is the <strong>only</strong> recourse then it may be
 * used with a note explaining that the precision must be set manually to a large enough value.
 * </li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Arbitrary-precision_integers_(included)">rosettacode.org/wiki/Arbitrary-precision_integers_(included)</a>
 */

Numeric Digits 200000

t1 = time('r')
n = 5 ** (4 ** (3 ** 2))
t2 = time('e')
Say "Calculation run time in seconds:" t2

t1 = time('r')
check = "62060698786608744707...92256259918212890625"
extract = left(n, 20)"..."right(n, 20)

Say "Expected result:"
Say check
Say "Actual result:"
Say extract
Say "digits:" length(n)
Say

If check = extract,
then,
  Say "Result confirmed"
else,
  Say "Result does not satisfy test"
t3 = time('e')
Say "Display run time in seconds:" t3
Say "Total run time in seconds:" t2 + t3

/*

Result:

digits: 183231
62060698786608744707...92256259918212890625

Expected result:
62060698786608744707...92256259918212890625

 */

