/* Rexx */

/**
 * <h3>Strip a set of characters from a string</h3>
 *
 * <p>
 * The task is to create a function that strips a set of characters from a string.
 * The function should take two arguments: the first argument being a string to stripped and the second,
 * a string containing the set of characters to be stripped. The returned string should contain the first string,
 * stripped of any characters in the second argument:
 * </p>
 * <pre>
 * print stripchars("She was a soul stripper. She took my heart!","aei")
 * Sh ws  soul strppr. Sh took my hrt!
 * </pre>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Strip_a_set_of_characters_from_a_string">rosettacode.org/wiki/Strip_a_set_of_characters_from_a_string</a>
 */

say stripchars("She was a soul stripper. She took my heart!", "aei")

return

stripchars:
Procedure
Do
  Parse arg haystack, chs

  Do c_ = 1 to length(chs)
    needle = substr(chs, c_, 1)
    haystack = changestr(needle, haystack, '')
    End c_

  Return haystack
End
Exit

