/* Rexx */


/**
 * The task is to demonstrate how to strip leading and trailing whitespace from a string.
 * The solution should demonstrate how to achieve the following three results:
 * <ul>
 * <li>String with leading whitespace removed</li>
 * <li>String with trailing whitespace removed</li>
 * <li>String with both leading and trailing whitespace removed</li>
 * </ul>
 * <p>
 * For the purposes of this task whitespace includes non printable characters such as the space character,
 * the tab character, and other such characters that have no corresponding graphical representation.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Strip_whitespace_from_a_string/Top_and_tail">rosettacode.org/wiki/Strip_whitespace_from_a_string/Top_and_tail</a> 
 */

HT = '09'x
CR = '0d'x
LF = '0a'x
FF = '0c'x

testData = "   "LF" "CR" "HT" "LF" There are non-print characters in this data "HT" "HT" "CR" "FF"   "

Say "original:        <p><code>"testData"</code></p>"
Say "strip leading:   <p><code>"strip(testData, 'l')"</code></p>"
Say "strip trailing:  <p><code>"strip(testData, 't')"</code></p>"
Say "strip both:      <p><code>"strip(testData, 'b')"</code></p>"
Say

