/* Rexx */

/**
 * Loops
 * <h3>Loops/Break</h3>
 * <p>
 * Show a loop which prints random numbers (each number newly generated each loop) from 0 to 19 (inclusive).
 * If a number is 10, stop the loop after printing it, and do not generate any further numbers.
 * Otherwise, generate and print a second random number before restarting the loop.
 * If the number 10 is never generated as the first number in a loop, loop forever.
 * </p>
 * <h3>Loops/Continue</h3>
 * <p>
 * Show the following output using one loop.
 * <pre>
 * 1, 2, 3, 4, 5
 * 6, 7, 8, 9, 10
 * </pre>
 * <p>
 * Try to achieve the result by forcing the next iteration within the loop upon a specific condition,
 * if your language allows it.
 * </p>
 * <h3>Loops/Do-while</h3>
 * <p>
 * Start with a value at 0. Loop while value mod 6 is not equal to 0. Each time through the loop,
 * add 1 to the value then print it. The loop must execute at least once.
 * </p>
 * <h3>Loops/Downward for</h3>
 * <p>
 * Write a for loop which writes a countdown from 10 to 0.
 * </p>
 * <h3>Loops/For</h3>
 * <p>
 * "For" loops are used to make some block of code be iterated a number of times, setting a variable or parameter
 * to a monotonically increasing integer value for each execution of the block of code. Common extensions of this
 * allow other counting patterns or iterating over abstract structures other than the integers.
 * <p>
 * For this task, show how two loops may be nested within each other, with the number of iterations performed by
 * the inner for loop being controlled by the outer for loop. Specifically print out the following pattern by
 * using one for loop nested in another:
 * </p>
 * <pre>
 * *
 * **
 * ***
 * ****
 * *****
 * </pre>
 * <h3>Loops/For with a specified step</h3>
 * <p>
 * Demonstrate a for loop where the step value is greater than one.
 * </p>
 * <h3>Loops/Foreach</h3>
 * <p>
 * Loop through and print each element in a collection in order. Use your language's "for each" loop if it has one,
 * otherwise iterate through the collection in order with some other loop.
 * </p>
 * <h3>Loops/Infinite</h3>
 * <p>
 * Specifically print out "SPAM" followed by a newline in an infinite loop.
 * </p>
 * <h3>Loops/N plus one half</h3>
 * <p>
 * Quite often one needs loops which, in the last iteration, execute only part of the loop body.
 * The goal of this task is to demonstrate the best way to do this.
 * </p>
 * <p>
 * Write a loop which writes the comma-separated list
 * <pre>
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * </pre>
 * <p>
 * using separate output statements for the number and the comma from within the body of the loop.
 * </p>
 * <h3>Loops/Nested</h3>
 * <p>
 * Show a nested loop which searches two-dimensional array filled with random number uniformly distributed on [1..20].
 * The loops iterate rows and columns of the array printing the iterated elements of, until the value 20 is met.
 * Specifically, this task also shows how to <a href="http://rosettacode.org/wiki/Loop/Break">break</a> out of nested loops.
 * </p>
 * <h3>Loops/While</h3>
 * <p>
 * Start an integer value at 1024. Loop while it is greater than 0. Print the value (with a newline)
 * and divide it by two each time through the loop.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Loops/Break">rosettacode.org/wiki/Loops/Break</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Continue">rosettacode.org/wiki/Loops/Continue</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Do-while">rosettacode.org/wiki/Loops/Do-while</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Downward_for">rosettacode.org/wiki/Loops/Downward_for</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/For_with_a_specified_step">rosettacode.org/wiki/Loops/For_with_a_specified_step</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Foreach">rosettacode.org/wiki/Loops/Foreach</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Infinite">rosettacode.org/wiki/Loops/Infinite</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/N_plus_one_half">rosettacode.org/wiki/Loops/N_plus_one_half</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Nested">rosettacode.org/wiki/Loops/Nested</a>
 */
--
  call loopsBreak
  call loopsContinue
  call loopsDoWhile
  call loopsDownwardFor
  call loopsFor
  call loopsForSpecStep
  call loopsForEach
  call loopsInfinite
  call loopsNplusHalf
  call loopsNested
  call loopsWhile

  return
exit

/**
 * Loops/Break
 */
loopsBreak:
procedure
  say
  say 'Loops/Break'
  rn = ''
  out = ''

  do /*label lb*/ forever
    rn = random(19)
    out = out || right(rn, 3)' '
    if rn = 10 then leave /*lb*/
    rn = random(19)
    out = out || right(rn, 3)' '
    end /*lb*/
  say strip(out)
  say

  return
exit

/**
 * Loops/Continue
 */
loopsContinue:
procedure
  say
  say 'Loops/Continue'
  out = ''

  do i_ = 1 to 10
    out = out ||right(i_, 2)
    if i_ // 5 = 0 then do
      say
      iterate i_
      end
    out = out || ', '        
    end i_
  say out

  return
exit

/**
 * Loops/Do-while
 */
loopsDoWhile:
procedure
  say
  say 'Loops/Do-while'
  out = ''

  i_ = 0
  do until i_ // 6 = 0
    i_ = i_ + 1
    out = out || i_' '
    end
  say strip(out)

  return
exit

/**
 * Loops/Downward for
 */
loopsDownwardFor:
procedure
  say
  say 'Loops/Downward for'
  out = ''

  do i_ = 10 to 0 by -1
    out = out || right(i_, 2)' '
    end i_
  say strip(out, )

  return
exit

/**
 * Loops/For
 */
loopsFor:
procedure
  say
  say 'Loops/For'
  out = ''

  do i_ = 1 to 5
    do /*for*/ i_
      out = out || '* '
      end
    end i_
  say out

  return
exit

/**
 * Loops/For with a specified step
 */
loopsForSpecStep:
procedure
  say
  say 'Loops/For with a specified step'
  out = ''

  do i_ = -1.4 to 10.6 by 1.7
    out = out || format(i_, 3, 1) || ' '
    end i_
  say
  say strip(out)

  return
exit

/**
 * Loops/Foreach
 */
loopsForEach:
procedure
  say
  say 'Loops/Foreach'
  out = ''

/*
  days = .array~of('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday')

  do daysi over days
    out ||= daysi' '
    end daysi
  say strip(out)
*/

  return
exit

/**
 * Loops/Infinite
 */
loopsInfinite:
procedure
  say
  say 'Loops/Infinite'
  out. = ''

  ct = 0
  do /*label spam*/ forever
    out.0 = 1
    out = out.1 || 'SPAM, '
    ct = ct + 1
    if isDebug() & ct >= 8 then do
      out.0 = 2
      out.2 = 'Loverly SPAM, wonderful SPAM, SPAM, SPAM, SPAM'
      leave /*spam*/
      end
    end /*spam*/

  do line = 1 to out.0
    say strip(strip(out.line),'t', ',')'!'
    end line

  return
exit

/**
 * Loops/N plus one half
 */
loopsNplusHalf:
procedure
  say
  say 'Loops/N plus one half'

  rs = ''
  istart = 1
  iend   = 10
  do i_ = istart to iend
    rs = rs || right(i_, 3)
    if i_ < iend then do
      rs = rs','
      end
    end i_
  say rs

  return
exit

/**
 * Loops/Nested
 */
loopsNested:
procedure
/*
  say
  say 'Loops/Nested'
  out. = ''

  rnd = Random()
  dim2 = .array~new(10, 10)

  do i1 = 1 for dim2~dimension(1)
    do i2 = 1 for dim2~dimension(2)
      dim2[i1, i2] = random(20) + 1
      end i2
    end i1

  do x1 = 1 for dim2~dimension(1)
    out.0 = x1
    do x2 = 1 for dim2~dimension(2)
      out = out.x1 || right(dim2[x1, x2], 3) || ' '
      if dim2[x1, x2] = 20 then leave x1
      end x2
    end x1

    do line = 1 to out.0
      say right(line, 4)': ' || strip(out.line, 't')
      end line
*/
  return
exit

/**
 * Loops/While
 */
loopsWhile:
procedure
  say
  say 'Loops/While'

  x_ = 1024
  do while x_ > 0
    say right(x_, 6)
    x_ = x_ % 2
    end

  return
exit

isDebug:
procedure
  return isTrue()

isTrue:
procedure
  return 1 == 1 --.true

isFalse:
procedure
  return \isTrue() --.false

/*
 */

