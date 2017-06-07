/*
 */

class RFlowControl {

  public static void main(String[] args) {
    boolean some_condition = true;
    boolean thisCondition = true;
    _Time_: do {
      for (int i = 0; i < 10; ++i) {
        System.out.println("let us begin");
        if (some_condition) { break _Time_; /* terminate the do-while loop */}
        System.out.println("done");
        }
        System.out.println("all done");
    } while (thisCondition);
    return;
  }
}

// Java does provide two other statements that provide flow control: <tt>break</tt> and <tt>continue</tt>.
//
// ===break===
// The <tt>break</tt> statement can be used to terminate a <tt>case</tt> clause in a <tt>switch</tt> statement and to terminate a <tt>for</tt>, <tt>while</tt> or <tt>do-while</tt> loop.  In loops, a <tt>break</tt> can be ''labeled'' or ''unlabeled''.
//
// <lang Java>switch (xx) {
//   case 1:
//   case 2:
//     /* 1 & 2 both come here... */
//     ...
//     break;
//   case 4:
//     /* 4 comes here... */
//     ...
//     break;
//   case 5:
//     /* 5 comes here... */
//     ...
//     break;
//   default:
//     /* everything else */
//     break;
// }
// 
// for (int i = 0; i < 10; ++i) {
//   ...
//   if (some_condition) { break; }
//   ...
// }
// 
// _Time_: do {
//   for (int i = 0; i < 10; ++i) {
//     ...
//     if (some_condition) { break _Time_; /* terminate the do-while loop */}
//     ...
//     }
//   ...
// } while (thisCondition);</lang>
// 
// ===continue===
// The <tt>continue</tt> statement skips the current iteration of a <tt>for</tt>, <tt>while</tt>, or <tt>do-while</tt> loop.  As with <tt>break</tt> the <tt>continue</tt> statement can be ''labeled'' or ''unlabeled'' to allow iterating a loop level other than the current one in nested loops.
// 
// <lang Java>while (condition) {
//   ...
//   if (someCondition) { continue; /* skip to beginning of this loop */ }
//   ...
// }
// 
// top: for (int 1 = 0; i < 10; ++i) {
//   ...
//   middle: for (int j = 0; j < 10; ++j) {
//     ...
//     bottom: for (int k = 0; k < 10; ++k) {
//     ...
//     if (top_condition) { continue top; /* restart outer loop */ }
//     ...
//     if (middle_condition) { continue middle; /* restart middle loop */ }
//     ...
//     if (bottom_condition) { continue bottom; /* restart bottom loop */ }
//     ...
//     if (bottom_condition) { continue; /* this will also restart bottom loop */ }
//     ...
//     }
//     ... 
//   }
//   ....
// }</lang>
// 

