/*
 * RHanoiIterative.java
 *
 * Version:
 *   $Id$
 *
 * Revisions:
 *   $Log$
 */

import java.io.*;
import java.lang.*;

/**
 *  An iterative solution to the Towers of Hanoi problem.
 *
 *  @author Kevin Andrew Seiter
 *  @version 1.1
 *  @see <a href="http://www.cs.rit.edu/~jmg/courses/cs2/20012/code/hanoi/HanoiIterative.java">http://www.cs.rit.edu/~jmg/courses/cs2/20012/code/hanoi/HanoiIterative.java</a>
 */

public class RHanoiIterative {

  // -------------------------------------------------------------------------
  // All integers needed for program calculations.

  public static int n_;

  public static int numMoves;

  public static int second = 0;

  public static int third;

  public static int pos2;

  public static int pos3;

  public static int j_;

  public static int i_;
  // -------------------------------------------------------------------------
  /**
   * The main method of the program. It functions as follows: An int value
   * is passed via the commandline arguments which is then used to determine
   * the minimum number of steps the process will take. From there, an
   * array is filled with all disks starting locations. This array will be
   * used throughout the program to keep track of disks last position. This is
   * necessary iteratavely because recursively, stacked methods keep track of
   * this inherently. From there, the program enters a loop that is bounded by
   * the minimum number of processes. Inside the loops, the program begins
   * by determining if the number of disks on tower A are odd or even. For an
   * even number of starting disks, the program will function by moving all
   * disks to tower c. For an odd number of disks, they will all be moved to
   * tower b. This is for calculation sake, and does not effect the functionality
   * of the program. During the process, all conclusions are printed via
   * system.out.println and additional println()'s are for spacing purposes only.
   * When the program has reached the minimum number of processes, it assumes
   * all disks are in their proper locations and terminates. A try/catch/finally
   * block protects the programs integrity  from ridiculously ignorant users.
   * NOTE: Comments reading, "Iterative vs Recursive" highlight the downside
   * of solving this problem iteratively.
   */
  public static void main(String[] args) {
    //--------------------------------------------------------------------
    try {
      if (args.length == 1) {
        System.out.println();
        n_ = Integer.parseInt(args[0]);         //Sets n_ to commandline int
        int[] locations = new int[n_ + 2];      //Sets location size

        for (j_ = 0; j_ < n_; j_++) {           //For loop - Initially all
          locations[j_] = 0;                    //discs are on tower 1
        }

        locations[ n_ + 1 ] = 2;                //Final disk destination
        numMoves = 1;
        for (i_ = 1; i_ <= n_; i_++) {         //Calculates minimum steps
          numMoves *= 2;                       //based on disc size then
        }                                      //subtracts one. ( standard
        numMoves -= 1;                         //algorithm 2 ^ n_ - 1 )

        //Begins iterative solution. Bound by min number of steps.
        for (i_ = 1; i_ <= numMoves; i_++) {
          if (i_ % 2 == 1) {                   //Determines odd or even.
            second = locations[1];
            locations[1] = (locations[1] + 1) % 3;
            System.out.print("Move disc 1 to ");
            System.out.println((char) ('A' + locations[1]));
          }

          else {                               //If number is even.
            third = 3 - second - locations[1];
            pos2 = n_ + 1;
            for (j_ = n_ + 1; j_ >=2; j_--) {  //Iterative vs Recursive.
              if (locations[j_] == second) {
                pos2 = j_;
              }
            }
            pos3 = n_ + 1;
            for (j_ = n_ + 1; j_ >= 2; j_--) { //Iterative vs Recursive.
              if (locations[j_] == third) {
                pos3 = j_;
              }
            }
            System.out.print("Move disc ");    //Assumes something is moving.

            //Iterative set. Much slower here than Recursive.
            if (pos2 < pos3) {
              System.out.print(pos2);
              System.out.print(" to ");
              System.out.println((char) ('A' + third));
              locations[pos2] = third;
            }
            //Iterative set. Much slower here than Recursive.
            else {
              System.out.print(pos3);
              System.out.print(" to ");
              System.out.println((char) ('A' + second));
              locations[pos3] = second;
            }
          }
        }
      }
    }
    catch (Exception ex) {
      //Protects Program Integrity.
      System.err.println("YOU SUCK. ENTER A VALID INT VALUE FOR #");
      System.err.println("FORMAT : java RHanoiIterative #");
    }
    finally {
      //Protects Program Integrity.
      System.out.println();
      System.out.println("CREATED BY: KEVIN SEITER");
      System.out.println();
    }

    return;
  }
}//RHanoiIterative
//--------------------------------------------------------------------------------

