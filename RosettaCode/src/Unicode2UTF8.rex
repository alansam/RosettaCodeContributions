/* Rexx */

/*
See: http://stackoverflow.com/questions/6240055/manually-converting-unicode-codepoints-into-utf-8-and-utf-16
     http://www.fileformat.info/info/unicode/
     http://en.wikipedia.org/wiki/List_of_Unicode_characters
     http://www.alanwood.net/unicode/currency_symbols.html


Encoding
UTF-8:
   The following byte sequences are used to represent a
   character.  The sequence to be used depends on the UCS code
   number of the character:

   0x00000000 - 0x0000007F:
       0xxxxxxx

   0x00000080 - 0x000007FF:
       110xxxxx 10xxxxxx

   0x00000800 - 0x0000FFFF:
       1110xxxx 10xxxxxx 10xxxxxx

   0x00010000 - 0x001FFFFF:
       11110xxx 10xxxxxx 10xxxxxx 10xxxxxx

   0x00200000 - 0x03FFFFFF:
       111110xx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx

   0x04000000 - 0x7FFFFFFF:
       1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx

   The xxx bit positions are filled with the bits of the
   character code number in binary representation.  Only the
   shortest possible multibyte sequence which can represent the
   code number of the character can be used.

   The UCS code values 0xd800–0xdfff (UTF-16 surrogates) as well
   as 0xfffe and 0xffff (UCS noncharacters) should not appear in
   conforming UTF-8 streams.

UTF-16:
   UTF-16 uses 2 or 4 bytes to represent Unicode codepoints.
   Algorithm:
   U+0000 to U+D7FF uses 2-byte 0000[hex] to D7FF[hex]
   U+D800 to U+DFFF are invalid codepoints reserved for 4-byte UTF-16
   U+E000 to U+FFFF uses 2-byte E000[hex] to FFFF[hex]

   U+10000 to U+10FFFF uses 4-byte UTF-16 encoded as follows:

   1. Subtract 10000[hex] from the codepoint.
   2. Express result as 20-bit binary.
   3. Use the pattern 110110xxxxxxxxxx 110111xxxxxxxxxx[hex]
      to encode the upper- and lower- 10 bits into two 16-bit words.
 */
Do
  Numeric Digits 20
  ranges. = 0
  x_ = ranges.0 + 1; ranges.0 = x_; ranges.x_ = 2 ** (7 + 0 * 6)
  x_ = ranges.0 + 1; ranges.0 = x_; ranges.x_ = 2 ** (5 + 1 * 6)
  x_ = ranges.0 + 1; ranges.0 = x_; ranges.x_ = 2 ** (4 + 2 * 6)
  x_ = ranges.0 + 1; ranges.0 = x_; ranges.x_ = 2 ** (3 + 3 * 6)
  x_ = ranges.0 + 1; ranges.0 = x_; ranges.x_ = 2 ** (2 + 4 * 6)
  x_ = ranges.0 + 1; ranges.0 = x_; ranges.x_ = 2 ** (1 + 5 * 6)

  Do x_ = 1 to ranges.0
    u_ = ranges.x_
    Say x_':' u_~right(16) u_~d2x()~right(8, 0) u_~d2x()~x2b()~right(32, 0)
    End x_

  Say

  -- 'Latin-1 Supplemental'
  Loop c_ = '0080'x~c2d to '00ff'x~c2d
    Queue 'U+'c_~d2x~right(4, 0)
    End c_

  -- 'Currency symbols'
  Do c_ = '20a0'x~c2d to '20c0'x~c2d
    Queue 'U+'c_~d2x
    End c_

  -- 'Other currency symbols'
  Queue 'U+0024' -- $ Dollar sign
  Queue 'U+00a2' -- ¢ Cent sign
  Queue 'U+00a3' -- £ Pound sign
  Queue 'U+00a4' -- ¤ Currency sign
  Queue 'U+00a5' -- ¥ Yen sign
  Queue 'U+0192' -- ƒ Florin/Guilder sign
  Queue 'U+09f2' -- ৲ Bangali Rupee mark
  Queue 'U+09f3' -- ৳ Bengali Rupee sign
  Queue 'U+0af1' -- ૱ Gujarati Rupee sign
  Queue 'U+0bf9' -- ௹ Tamil Rupee sign
  Queue 'U+0e3f' -- ฿ Thai Bhat
  Queue 'U+17db' -- ៛ Khmer Riel
  Queue 'U+3350' -- ㍐ Square Yuan
  Queue 'U+5143' -- 元 Yuan
  Queue 'U+5186' -- 円 Yen
  Queue 'U+5706' -- 圆 Yen/Yuan variant
  Queue 'U+570e' -- 圎 Yen/Yuan variant
  Queue 'U+5713' -- 圓 Yuan (Hong Kong or Taiwan)
  Queue 'U+571c' -- 圜 Yen/Yuan variant
  Queue 'U+a838' -- ꠸ North Indic Rupee mark
  Queue 'U+fdfc' -- ﷼ Rial sign
  Queue 'U+ff04' -- ＄ Full width dollar sign
  Queue 'U+ffe0' -- ￠ Full width cent sign
  Queue 'U+ffe1' -- ￡ Full width pound sign
  Queue 'U+ffe5' -- ￥ Full width yen sign
  Queue 'U+ffe6' -- ￦ Full width Won sign
  Queue 'U+1f4b2' -- 💲  Heavy dollar sign

  -- 'Sample symbols'
  Queue 'U+0040'
  Queue 'U+0041'
  Queue 'U+005a'
  Queue 'U+0061'
  Queue 'U+007a'
  Queue 'U+00c0'
  Queue 'U+00a3'
  Queue 'U+00ff'
  Queue 'U+041f'
  Queue 'U+0985'
  Queue 'U+2020'

  Queue 'U+2f9f4' -- CJK COMPATIBILITY IDEOGRAPH-2F9F4

  -- 'UTF-8 Ranges'
  Queue 'U+0000'
  Queue 'U+007f'
  Queue 'U+0080'
  Queue 'U+07ff'
  Queue 'U+0800'
  Queue 'U+ffff'
  Queue 'U+10000'
  Queue 'U+1ffff'
  Queue 'U+20000'
  Queue 'U+2ffff'
  Queue 'U+30000'
  Queue 'U+dffff'
  Queue 'U+e0000'
  Queue 'U+effff'
  Queue 'U+f0000'
  Queue 'U+10ffff'
  Queue 'U+1fffff'
  Queue 'U+200000'
  Queue 'U+03ffffff'
  Queue 'U+04000000'
  Queue 'U+7fffffff'
  Queue 'U+80000000'

  Do q_ = 1 to queued()
    Parse pull 'U+' val .

    --Call Unicode2UTF8_Crude val
    Call Unicode2UTF8_Bittie val
    Call Unicode2UTF16_Bittie val

    End q_

  Return
End
Exit

Unicode2UTF8_Bittie:
Procedure Expose ranges.
Do
  Parse Arg val

  dv = x2d(val)

  Select
    When dv < ranges.1 then Do
      dc = val~x2c
      Say '1:' dc~c2x~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 0xxxxxxx'
      dc = (dc~c2d)~d2c
      utf8 = dc~bitand('0111 1111'b)
      Say 'UTF-8:' utf8~c2x~right(2, 0) utf8
      End
    When dv < ranges.2 then Do
      val = val~right(4, 0)
      dc = val~x2c
      Say '2:' dc~c2x~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 110xxxxx 10xxxxxx'
      m1 = '0000 0111 1100 0000'b
      m2 = '0000 0000 0011 1111'b
      b1 = (dc~bitand(m1)~c2d / (2 ** 6))~d2c -- shift right 6
      b2 = (dc~bitand(m2)~c2d)~d2c
      b1 = b1~bitand( '0001 1111'b )
      b1 = b1~bitor(  '1100 0000'b )
      b2 = b2~bitand( '0011 1111'b )
      b2 = b2~bitor(  '1000 0000'b )
      utf8 = b1 || b2
      Say 'UTF-8:' utf8~c2x utf8
      End
    When dv < ranges.3 then Do
      val = val~right(6, 0)
      dc = val~x2c
      Say '3:' val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 1110xxxx 10xxxxxx 10xxxxxx'
      m1 = '0000 0000  1111 0000  0000 0000'b
      m2 = '0000 0000  0000 1111  1100 0000'b
      m3 = '0000 0000  0000 0000  0011 1111'b
      b1 = (dc~bitand(m1)~c2d / (2 ** 12))~d2c -- shift right 12
      b2 = (dc~bitand(m2)~c2d / (2 **  6))~d2c -- shift right  6
      b3 = (dc~bitand(m3)~c2d)~d2c
      b1 = b1~bitand( '0000 1111'b )
      b1 = b1~bitor(  '1110 0000'b )
      b2 = b2~bitand( '0011 1111'b )
      b2 = b2~bitor(  '1000 0000'b )
      b3 = b3~bitand( '0011 1111'b )
      b3 = b3~bitor(  '1000 0000'b )
      utf8 = b1 || b2 || b3
      Say 'UTF-8:' utf8~c2x utf8
      End
    When dv < ranges.4 then Do
      val = val~right(8, 0)
      dc = val~x2c
      Say '4:' val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx'
      m1 = '0000 0000  0001 1100  0000 0000  0000 0000'b
      m2 = '0000 0000  0000 0011  1111 0000  0000 0000'b
      m3 = '0000 0000  0000 0000  0000 1111  1100 0000'b
      m4 = '0000 0000  0000 0000  0000 0000  0011 1111'b
      b1 = (dc~bitand(m1)~c2d / (2 ** 18))~d2c -- shift right 18
      b2 = (dc~bitand(m2)~c2d / (2 ** 12))~d2c -- shift right 12
      b3 = (dc~bitand(m3)~c2d / (2 **  6))~d2c -- shift right  6
      b4 = (dc~bitand(m4)~c2d)~d2c
      b1 = b1~bitand( '0000 0111'b )
      b1 = b1~bitor(  '1111 0000'b )
      b2 = b2~bitand( '0011 1111'b )
      b2 = b2~bitor(  '1000 0000'b )
      b3 = b3~bitand( '0011 1111'b )
      b3 = b3~bitor(  '1000 0000'b )
      b4 = b4~bitand( '0011 1111'b )
      b4 = b4~bitor(  '1000 0000'b )
      utf8 = b1 || b2 || b3 || b4
      Say 'UTF-8:' utf8~c2x utf8
      End
    When dv < ranges.5 then Do
      val = val~right(10, 0)
      dc = val~x2c
      Say '5:' val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 111110xx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx'
      m1 = '0000 0000  0000 0011  0000 0000  0000 0000  0000 0000'b
      m2 = '0000 0000  0000 0000  1111 1100  0000 0000  0000 0000'b
      m3 = '0000 0000  0000 0000  0000 0011  1111 0000  0000 0000'b
      m4 = '0000 0000  0000 0000  0000 0000  0000 1111  1100 0000'b
      m5 = '0000 0000  0000 0000  0000 0000  0000 0000  0011 1111'b
      b1 = (dc~bitand(m1)~c2d / (2 ** 24))~d2c -- shift right 24
      b2 = (dc~bitand(m2)~c2d / (2 ** 18))~d2c -- shift right 18
      b3 = (dc~bitand(m3)~c2d / (2 ** 12))~d2c -- shift right 12
      b4 = (dc~bitand(m4)~c2d / (2 **  6))~d2c -- shift right  6
      b5 = (dc~bitand(m5)~c2d)~d2c
      b1 = b1~bitand( '0000 0011'b )
      b1 = b1~bitor(  '1111 1000'b )
      b2 = b2~bitand( '0011 1111'b )
      b2 = b2~bitor(  '1000 0000'b )
      b3 = b3~bitand( '0011 1111'b )
      b3 = b3~bitor(  '1000 0000'b )
      b4 = b4~bitand( '0011 1111'b )
      b4 = b4~bitor(  '1000 0000'b )
      b5 = b5~bitand( '0011 1111'b )
      b5 = b5~bitor(  '1000 0000'b )
      utf8 = b1 || b2 || b3 || b4 || b5
      Say 'UTF-8:' utf8~c2x utf8
      End
    When dv < ranges.6 then Do
      val = val~right(12, 0)
      dc = val~x2c
      Say '6:' val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx'
      m1 = '0000 0000  0000 0000  0100 0000  0000 0000  0000 0000  0000 0000'b
      m2 = '0000 0000  0000 0000  0011 1111  0000 0000  0000 0000  0000 0000'b
      m3 = '0000 0000  0000 0000  0000 0000  1111 1100  0000 0000  0000 0000'b
      m4 = '0000 0000  0000 0000  0000 0000  0000 0011  1111 0000  0000 0000'b
      m5 = '0000 0000  0000 0000  0000 0000  0000 0000  0000 1111  1100 0000'b
      m6 = '0000 0000  0000 0000  0000 0000  0000 0000  0000 0000  0011 1111'b
      b1 = (dc~bitand(m1)~c2d / (2 ** 30))~d2c -- shift right 30
      b2 = (dc~bitand(m2)~c2d / (2 ** 24))~d2c -- shift right 24
      b3 = (dc~bitand(m3)~c2d / (2 ** 18))~d2c -- shift right 18
      b4 = (dc~bitand(m4)~c2d / (2 ** 12))~d2c -- shift right 12
      b5 = (dc~bitand(m5)~c2d / (2 **  6))~d2c -- shift right  6
      b6 = (dc~bitand(m6)~c2d)~d2c
      b1 = b1~bitand( '0000 0001'b )
      b1 = b1~bitor(  '1111 1100'b )
      b2 = b2~bitand( '0011 1111'b )
      b2 = b2~bitor(  '1000 0000'b )
      b3 = b3~bitand( '0011 1111'b )
      b3 = b3~bitor(  '1000 0000'b )
      b4 = b4~bitand( '0011 1111'b )
      b4 = b4~bitor(  '1000 0000'b )
      b5 = b5~bitand( '0011 1111'b )
      b5 = b5~bitor(  '1000 0000'b )
      utf8 = b1 || b2 || b3 || b4 || b5 || b6
      Say 'UTF-8:' utf8~c2x utf8
      End
    Otherwise Do
      Say '7:' val~right(8) dv~right(12) dv~d2x()~right(8) 'unsupported'
      End
    End

  Return
End
Exit

Unicode2UTF16_Bittie:
Procedure Expose ranges.
Do
  Parse arg val
  dv = val~x2d

  Select
    When dv <= 'D7FF'~x2d then Do
      utf16 = dv~d2x~right(4, 0)
      End
    When dv <= 'DFFF'~x2d then Do
      Say val~right(8) dv~right(12) dv~d2x~right(8) 'is an invalid codepoint reserved for 4-byte UTF-16'
      utf16 = dv~d2x~right(4, 0)
      End
    When dv <= 'FFFF'~x2d then Do
      utf16 = dv~d2x~right(4, 0)
      End
    When dv <= '10FFFF'~x2d then Do
      m1 = '1101100000000000'b
      m2 = '1101110000000000'b
      m3 = '11111111110000000000'b
      m4 = '00000000001111111111'b
      xf = '010000'x~c2d
      dx = (dv - xf)~d2c~right(m3~length, '00'x)
      d1 = (dx~bitand(m3)~c2d / (2 ** 10))~d2c~right(m1~length, '00'x) -- shift right 10
      d2 = (dx~bitand(m4))~right(m2~length, '00'x)
      u1 = d1~bitor(m1)
      u2 = d2~bitor(m2)
      utf16 = u1~c2x || u2~c2x
      End
    Otherwise Do
      Say val~right(8) dv~right(12) dv~d2x~right(8) 'unsupported codepoint'
      utf16 = ''
      End
    End
  Say 'UTF-16:' utf16

  Return
End
Exit

Unicode2UTF8_Crude:
Procedure Expose ranges.
Do
  Parse Arg val

  dv = x2d(val)

  Select
    When dv < ranges.1 then Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 0xxxxxxx'
      Parse Value dv~d2x()~x2b()~right(8, 0) with . +1 bits
      char = bits~right(8, 0)
      char = char~b2x()
      Say 'UTF-8:' char~right(2, 0)
      End
    When dv < ranges.2 then Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 110xxxxx 10xxxxxx'
      Parse Value dv~d2x()~x2b()~right(16, 0) with . +5 bits1 +5 bits2
      char1 = '110' || bits1~right(5, 0)
      char2 = '10'  || bits2~right(6, 0)
      char1 = char1~b2x()
      char2 = char2~b2x()
      Say 'UTF-8:' char1~right(2, 0) char2~right(2, 0)
      End
    When dv < ranges.3 then Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 1110xxxx 10xxxxxx 10xxxxxx'
      Parse Value dv~d2x()~x2b()~right(16, 0) with bits1 +4 bits2 +6 bits3
      char1 = '1110' || bits1~right(4, 0)
      char2 = '10'   || bits2~right(6, 0)
      char3 = '10'   || bits3~right(6, 0)
      char1 = char1~b2x()
      char2 = char2~b2x()
      char3 = char3~b2x()
      Say 'UTF-8:' char1~right(2, 0) char2~right(2, 0) char3~right(2, 0)
      End
    When dv < ranges.4 then Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx'
      Parse Value dv~d2x()~x2b()~right(24, 0) with . +3 bits1 +3 bits2 +6 bits3 +6 bits4
      char1 = '11110' || bits1~right(3, 0)
      char2 = '10'    || bits2~right(6, 0)
      char3 = '10'    || bits3~right(6, 0)
      char4 = '10'    || bits4~right(6, 0)
      char1 = char1~b2x()
      char2 = char2~b2x()
      char3 = char3~b2x()
      char4 = char4~b2x()
      Say 'UTF-8:' char1~right(2, 0) char2~right(2, 0) char3~right(2, 0) char4~right(2, 0)
      End
    When dv < ranges.5 then Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 111110xx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx'
      Parse Value dv~d2x()~x2b()~right(28, 0) with . +2 bits1 +2 bits2 +6 bits3 +6 bits4 +6 bits5
      char1 = '111110' || bits1~right(2, 0)
      char2 = '10'     || bits2~right(6, 0)
      char3 = '10'     || bits3~right(6, 0)
      char4 = '10'     || bits4~right(6, 0)
      char5 = '10'     || bits5~right(6, 0)
      char1 = char1~b2x()
      char2 = char2~b2x()
      char3 = char3~b2x()
      char4 = char4~b2x()
      char5 = char5~b2x()
      Say 'UTF-8:' char1~right(2, 0) char2~right(2, 0) char3~right(2, 0) char4~right(2, 0) char5~right(2, 0)
      End
    When dv < ranges.6 then Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'Pattern 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx'
      Parse Value dv~d2x()~x2b()~right(32, 0) with +1 bits1 +1 bits2 +6 bits3 +6 bits4 +6 bits5 +6 bits6
      char1 = '1111110' || bits1~right(1, 0)
      char2 = '10'      || bits2~right(6, 0)
      char3 = '10'      || bits3~right(6, 0)
      char4 = '10'      || bits4~right(6, 0)
      char5 = '10'      || bits5~right(6, 0)
      char6 = '10'      || bits6~right(6, 0)
      char1 = char1~b2x()
      char2 = char2~b2x()
      char3 = char3~b2x()
      char4 = char4~b2x()
      char5 = char5~b2x()
      char6 = char6~b2x()
      Say 'UTF-8:' char1~right(2, 0) char2~right(2, 0) char3~right(2, 0) char4~right(2, 0) char5~right(2, 0) char6~right(2, 0)
      End
    Otherwise Do
      Say val~right(8) dv~right(12) dv~d2x()~right(8) 'unsupported'
      End
    End

  Return
End
Exit

