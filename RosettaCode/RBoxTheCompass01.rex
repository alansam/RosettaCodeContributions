/* Rexx */

Do
  Call show_some_unicode_characters

  globs = '!DEG !MIN !SEC !FULL'
  Drop !DEG !MIN !SEC !FULL
  sign. = ''
  sign.!DEG = 'c2b0'x     -- degree sign
  sign.!MIN = 'e280b2'x   -- prime
  sign.!SEC = 'e280b3'x   -- double prime
  points. = ''

  Say '|....+....1....+....2....+....3|'
  Say '|' || format_decimal_angle(5, 37, 30) || '|'
  Say '|' || format_degrees_minutes_seconds(360 / 32 / 2) || '|'

  Call display_compass_points

  Call flush_queue
  Queue 0.0
  Queue 360 + 0.0
  Queue 360 + 11.25
  Queue 360 + 22.5
  Queue 360.0
  Queue 16.87
  Queue 16.88

  Call display_sample
  Say

  headings. = ''
  headings.0 = 0
  Call make_headings

  Call flush_queue
  Do h_ = 1 to headings.0
    Queue headings.h_
    End h_

  Call display_sample
  Say

  Return
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
flush_queue:
Procedure
Do
  Do q_ = 1 to queued()
    Parse pull .
    End q_
  Return
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
display_sample:
Procedure Expose points. sign. (globs)
Do

  Do q_ = 1 to queued()
    Parse pull heading
    index = get_index(heading)
    Parse Value get_point(index) with p_abbrev p_full
    Say index~right(3),
        p_abbrev~left(4) p_full~left(20),
        heading~format(5, 3) || sign.!DEG '('format_degrees_minutes_seconds(heading)')',
        ''
    End q_

  Return
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
display_compass_points:
Procedure Expose points. sign. (globs)
Do

  points = 32
  one_pt = 360 / points

  Do h_ = 0 to points - 1
    heading = h_ * 360 / points
    hmin = heading - one_pt / 2
    hmax = heading + one_pt / 2

    If hmin < 0 then Do
      hmin = hmin + 360
      End
    If hmax >= 360 then Do
      hmax = hmax - 360
      End

    index = (h_ // points) + 1
    Parse Value get_point(index) with p_abbrev p_full

    Say index~right(3),
        p_abbrev~left(4) p_full~left(20),
        hmin~format(5, 3)    || sign.!DEG '('format_degrees_minutes_seconds(hmin)')',
        heading~format(5, 3) || sign.!DEG '('format_degrees_minutes_seconds(heading)')',
        hmax~format(5, 3)    || sign.!DEG '('format_degrees_minutes_seconds(hmax)')',
        ''
    End h_
  Say

  Return
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
make_headings:
Procedure Expose headings.
Do
  points = 32
  Do i_ = 0 to points
    heading = i_ * 360 / 32

    it = i_ // 3
    Select
      When it = 1 then Do
        heading_h = heading + 5.62
        End

      When it = 2 then Do
        heading_h = heading - 5.62
        End

      Otherwise Do
        heading_h = heading
        End
      End

    index = (i_ // points) + 1
    ix = headings.0 + 1; headings.0 = ix; headings.ix = heading_h
    End i_

  Return
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
get_index:
Procedure
Do
  Parse Arg heading .

  one_pt = 360 / 32
  hn = heading // 360
  hi = hn % one_pt

  If hn > hi * one_pt + one_pt / 2 then Do
    hi = hi + 1 -- greater than max range for this point; bump to next point
    End

  idx = hi // 32 + 1 -- add one to get index into points. stem

  Return idx
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
get_point:
Procedure Expose points. sign. (globs)
Do
  Parse arg index .

  Call get_points

  Return points.index points.index.!FULL
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
get_points:
Procedure Expose points. sign. (globs)
Do

  Drop !FULL

  points. = ''
  p_ = 0
  p_ = p_ + 1; points.0 = p_; points.p_ = 'N';    points.p_.!FULL = 'North'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NbE';  points.p_.!FULL = 'North by East'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NNE';  points.p_.!FULL = 'North-Northeast'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NEbn'; points.p_.!FULL = 'Northeast by North'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NE';   points.p_.!FULL = 'Northeast'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NEbE'; points.p_.!FULL = 'Northeast by East'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'ENE';  points.p_.!FULL = 'East-Northeast'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'EbN';  points.p_.!FULL = 'East by North'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'E';    points.p_.!FULL = 'East'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'EbS';  points.p_.!FULL = 'East by South'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'ESE';  points.p_.!FULL = 'East-Southeast'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SEbE'; points.p_.!FULL = 'Southeast by East'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SE';   points.p_.!FULL = 'Southeast'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SEbS'; points.p_.!FULL = 'Southeast by South'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SSE';  points.p_.!FULL = 'South-Southeast'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SbE';  points.p_.!FULL = 'South by East'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'S';    points.p_.!FULL = 'South'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SbW';  points.p_.!FULL = 'South by West'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SSW';  points.p_.!FULL = 'South-Southwest'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SWbS'; points.p_.!FULL = 'Southwest by South'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SW';   points.p_.!FULL = 'Southwest'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'SWbW'; points.p_.!FULL = 'Southwest by West'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'WSW';  points.p_.!FULL = 'Southwest'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'WbS';  points.p_.!FULL = 'West by South'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'W';    points.p_.!FULL = 'West'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'WbN';  points.p_.!FULL = 'West by North'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'WNW';  points.p_.!FULL = 'West-Northwest'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NWbW'; points.p_.!FULL = 'Northwest by West'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NW';   points.p_.!FULL = 'Northwest'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NWbN'; points.p_.!FULL = 'Northwest by North'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NNW';  points.p_.!FULL = 'North-Northwest'
  p_ = p_ + 1; points.0 = p_; points.p_ = 'NbW';  points.p_.!FULL = 'North by West'

  Return
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
-- Decimal degrees = whole number of degrees, plus minutes divided by 60, plus seconds divided by 3600
get_decimal_angle:
Procedure Expose sign. (globs)
Do
  Parse Arg degrees ., minutes ., seconds .

  degrees = degrees * 10 % 10
  minutes = minutes * 10 % 10

  angle = degrees + minutes / 60 + seconds / 60 / 60

  Return angle
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
format_decimal_angle:
Procedure Expose sign. (globs)
Do
  Parse Arg degrees ., minutes ., seconds .

  Return get_decimal_angle(degrees, minutes, seconds)~format(5, 3) || sign.!DEG
End
Exit
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
/* http://en.wikipedia.org/wiki/Minute_of_arc                                 */
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
get_degrees_minutes_seconds:
Procedure Expose sign. (globs)
Do
  Parse arg angle .

  degrees = angle * 100 % 100
  minutes = ((angle - degrees) * 60) * 100 % 100
  seconds = ((((angle - degrees) * 60) - minutes) * 60) * 100 % 100

  Return degrees minutes seconds
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
format_degrees_minutes_seconds:
Procedure Expose  sign. (globs)
Do
  Parse arg angle .

  Parse Value get_degrees_minutes_seconds(angle) with degrees minutes seconds .

  formatted = degrees~right(3) || sign.!DEG || minutes~right(2, 0) || sign.!MIN || seconds~right(2, 0) || sign.!SEC

  Return formatted
End
Exit

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
show_some_unicode_characters:
Procedure
Do
  -- http://www.fileformat.info/info/unicode/
  -- http://en.wikipedia.org/wiki/List_of_Unicode_characters
  chrs. = ''
  c_ = 0
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = '21'x       -- exclamation          : utf-8 : '12'x   : utf-16 : U+0021
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'c2a1'x     -- inverted exclamation : utf-8 : '00a1'x : utf-16 : U+00A1
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = '3f'x       -- question             : utf-8 : '3f'x   : utf-16 : U+003F
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'c2bf'x     -- inverted question    : utf-8 : '00bf'x : utf-16 : U+00BF
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = '24'x       -- dollar               : utf-8 : '24'x   : utf-16 : U+0024
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'c2a3'x     -- pound                : utf-8 : '00a3'x : utf-16 : U+00A3
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'e282ac'x   -- euro                 : utf-8 : '20ac'x : utf-16 : U+20AC
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'e1ba9e'x   -- caps sharp s         : utf-8 : '1e9e'x : utf-16 : U+1E9E
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'c39f'x     -- small sharp s        : utf-8 : '00df'x : utf-16 : U+00DF
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'c2ac'x     -- not sign             : utf-8 : '00ac'x : utf-16 : U+00AC
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'c2b0'x     -- degree sign          : utf-8 : '00b0'x : utf-16 : U+00B0
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'e280b2'x   -- prime                : utf-8 : '2032'x : utf-16 : U+2032
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'e280b3'x   -- double prime         : utf-8 : '2033'x : utf-16 : U+2033
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'e280b4'x   -- triple prime         : utf-8 : '2034'x : utf-16 : U+2034
  c_ = c_ + 1; chrs.0 = c_; chrs.c_ = 'e280b4'x   -- triple prime         : utf-8 : '2034'x : utf-16 : U+2034

  -- U+00A0 - U+00FF : UTF-8 C2A0 - C3BF
  
  Drop c_
  Do c_ = 1 to chrs.0
    Say c_~right(3)':' chrs.c_
    End c_

  Return
End
Exit

