/* Rexx */

/**
 * Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer.
 * You don't need to validate the form of the Roman numeral.
 * <p>
 * Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately,
 * starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC)
 * and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in
 * descending order.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Roman_numerals/Decode">rosettacode.org/wiki/Roman_numerals/Decode</a>
 */
Do
        /* 1449    1944    1954   1990  2008   1066  1666    1966    1999    2011*/
  years = 'MCDXLIX MCMXLIV MCMLIV MCMXC MMVIII MLXVI MDCLXVI MCMLXVI MCMXCIX MMXI'

  Do y_ = 1 to words(years)
    Say right(word(years, y_), 10) || ':' decode(word(years, y_))
    End y_

  Return
End
Exit

decode:
  Procedure
Do
  Parse upper arg roman .
  
  If verify(roman, 'MDCLXVI') = 0 then Do

    /* always insert the value of the least significant numeral */
    decnum = rchar(substr(roman, length(roman), 1))
    Do d_ = 1 to length(roman) - 1
      If rchar(substr(roman, d_, 1)) < rchar(substr(roman, d_ + 1, 1)) then Do
        /* Handle cases where numerals are not in descending order */
        /*   subtract the value of the numeral */
        decnum = decnum - rchar(substr(roman, d_, 1))
        End
      else Do
        /* Normal case */
        /*   add the value of the numeral */
        decnum = decnum + rchar(substr(roman, d_, 1))
        End
      End d_
    End
  else Do
    decnum = roman 'contains invalid roman numerals'
    End

  Return decnum
End
Exit

rchar:
  Procedure
Do
  Parse upper arg ch +1 .

  select 
    when ch = 'M' then digit = 1000
    when ch = 'D' then digit =  500
    when ch = 'C' then digit =  100
    when ch = 'L' then digit =   50
    when ch = 'X' then digit =   10
    when ch = 'V' then digit =    5
    when ch = 'I' then digit =    1
    otherwise          digit =    0
    end

  Return digit
End
Exit

