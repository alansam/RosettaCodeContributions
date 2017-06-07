/* Rexx */

/**
 * <h3>Hash from two arrays</h3>
 * <p>
 * Using two Arrays of equal length, create a Hash object where the elements from one array (the keys) are linked to the elements of the other (the values)
 * </p>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hash_from_two_arrays">rosettacode.org/wiki/Hash_from_two_arrays</a>
 */

Do
  keys = 'one two three'
  vals = '1 2 3'

  keysArray. = ''
  keysArray.0 = keys~words()
  Do k_ = 1 to keysArray.0
    keysArray.k_ = keys~word(k_)
    End k_

  valsArray. = ''
  valsArray.0 = vals~words()
  Do v_ = 1 to valsArray.0
    valsArray.v_ = vals~word(v_)
    End v_

  hash. = ''
  Do x_ = 1 to keysArray.0
    key = keysArray.x_
    val = valsArray.x_
    hash.key = val
    end x_

  Call display

  Return
End
Exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
display:
Procedure Expose hash.
Do
  Do x_ over hash.
    say ('hash.'x_)~left(20)":" hash.x_
    End x_

  Return
End
Exit

