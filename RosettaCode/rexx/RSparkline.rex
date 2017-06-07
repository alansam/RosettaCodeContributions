/* Rexx */

do xx = x2d('E29680') to x2d('E2969F')
  say right(d2x(xx - x2d('E29680')), 2, 0) d2c(xx) d2x(xx)
  end xx
parse arg aaa
call runSample aaa
return

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
sparkline:
  procedure
  parse arg spark
  spark = changestr(',', spark, ' ')
  --bars = '▁ ▂ ▃ ▄ ▅ ▆ ▇ █'
  bars = x2c('E29681') x2c('E29682') x2c('E29683') x2c('E29684') x2c('E29685') x2c('E29686') x2c('E29687') x2c('E29688')
  barK = words(bars)
  nmin = word(spark, 1)
  nmax = nmin
  -- get min & max values
  do iw = 1 to words(spark)
    nval = word(spark, iw)
    nmin = min(nval, nmin)
    nmax = max(nval, nmax)
    end iw
  range = nmax - nmin + 1
  slope = ''
  do iw = 1 to words(spark)
    point = ceiling((word(spark, iw) - nmin + 1) / range * barK)
    slope = slope || word(bars, point)
    end iw
  return slope nmin nmax range

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ceiling:
  procedure 
  parse arg ceil
  return trunc(ceil) + (ceil > 0) * (ceil \= trunc(ceil))
floor:
  procedure 
  parse arg flor
  return trunc(flor) - (flor < 0) * (flor \= trunc(flor))

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
runSample:
  procedure
  -- sample data setup
  parse arg vals
  sparks = 0
  sparks.0 = 0
  if vals = '' then do
    si = sparks.0 + 1; sparks.0 = si; sparks.si = 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    si = sparks.0 + 1; sparks.0 = si; sparks.si = '1.5, 0.5 3.5, 2.5 5.5, 4.5 7.5, 6.5'
    end
  else do
    do until vals = ''
      -- split input on a ! character
      parse var vals lst '!' vals
      si = sparks.0 + 1; sparks.0 = si; sparks.si = lst
      end
    end
  -- run the samples
  do si = 1 to sparks.0
    vals = sparks.si
    parse value sparkline(vals) with slope .
    say 'Input:        ' vals
    say 'Sparkline:    ' slope
    say
    end si
  
  return

/*
http://www.fileformat.info/info/unicode/block/block_elements/index.htm
__ _ UTF-8  Unicode
00 ▀ E29680 U+2580 UPPER HALF BLOCK
01 ▁ E29681 U+2581 LOWER ONE EIGHTH BLOCK
02 ▂ E29682 U+2582 LOWER ONE QUARTER BLOCK
03 ▃ E29683 U+2583 LOWER THREE EIGHTHS BLOCK
04 ▄ E29684 U+2584 LOWER HALF BLOCK
05 ▅ E29685 U+2585 LOWER FIVE EIGHTHS BLOCK
06 ▆ E29686 U+2586 LOWER THREE QUARTERS BLOCK
07 ▇ E29687 U+2587 LOWER SEVEN EIGHTHS BLOCK
08 █ E29688 U+2588 FULL BLOCK
09 ▉ E29689 U+2589 LEFT SEVEN EIGHTHS BLOCK
0A ▊ E2968A U+258A LEFT THREE QUARTERS BLOCK
0B ▋ E2968B U+258B LEFT FIVE EIGHTHS BLOCK
0C ▌ E2968C U+258C LEFT HALF BLOCK
0D ▍ E2968D U+258D LEFT THREE EIGHTHS BLOCK
0E ▎ E2968E U+258E LEFT ONE QUARTER BLOCK
0F ▏ E2968F U+258F LEFT ONE EIGHTH BLOCK

10 ▐ E29690 U+2590 RIGHT HALF BLOCK
11 ░ E29691 U+2591 LIGHT SHADE
12 ▒ E29692 U+2592 MEDIUM SHADE
13 ▓ E29693 U+2593 DARK SHADE
14 ▔ E29694 U+2594 UPPER ONE EIGHTH BLOCK
15 ▕ E29695 U+2595 RIGHT ONE EIGHTH BLOCK
16 ▖ E29696 U+2596 QUADRANT LOWER LEFT
17 ▗ E29697 U+2597 QUADRANT LOWER RIGHT
18 ▘ E29698 U+2598 QUADRANT UPPER LEFT
19 ▙ E29699 U+2599 QUADRANT UPPER LEFT AND LOWER LEFT AND LOWER RIGHT
1A ▚ E2969A U+259A QUADRANT UPPER LEFT AND LOWER RIGHT
1B ▛ E2969B U+259B QUADRANT UPPER LEFT AND UPPER RIGHT AND LOWER LEFT
1C ▜ E2969C U+259C QUADRANT UPPER LEFT AND UPPER RIGHT AND LOWER RIGHT
1D ▝ E2969D U+259D QUADRANT UPPER RIGHT
1E ▞ E2969E U+259E QUADRANT UPPER RIGHT AND LOWER LEFT
1F ▟ E2969F U+259F QUADRANT UPPER RIGHT AND LOWER LEFT AND LOWER RIGHT
*/
