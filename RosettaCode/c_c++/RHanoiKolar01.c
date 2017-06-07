/* Kolar's Hanoi Tower algorithm no. 1 */
/* http://hanoitower.mkolar.org/algo.html */

#include <stdio.h>
#include <stdlib.h>

#define PR      (void) printf(
#define PE      (void) fprintf(stderr,

#define ALLO(x) { if((x = (int *) malloc((n + 3) * sizeof(int))) == NULL) {\
                  PE #x " allocation failed!\n"); exit(1); }}

/* ======================== */
int main(int argc, char * argv[])
{
  int i, *a, *b, *c, *p, *fr, *to, *sp, n, n1, n2;

  n  = atoi(argv[1]);
  n1 = n + 1;
  n2 = n + 2;
  ALLO(a)
  ALLO(b)
  ALLO(c)

  a[0]  = 1;
  b[0]  = c[0]  = n1;
  a[n1] = b[n1] = c[n1] = n1;
  a[n2] = 1;
  b[n2] = 2;
  c[n2] = 3;
  for (i = 1; i < n1; i++) {
    a[i] = i; b[i] = c[i] = 0;
  }

  fr = a;
  if (n & 1) {
    to = c;
    sp = b;
  }
  else {
    to = b; sp = c;
  }

  while (c[0] > 1) {
    PR"move disc %d from %d to %d\n", i = fr[fr[0]++], fr[n2], to[n2]);
    p = sp;
    if ((to[--to[0]] = i) & 1) {
      sp = to;
      if (fr[fr[0]] > p[p[0]]) {
        to = fr; fr = p;
      }
      else {
        to = p;
      }
    }
    else {
      sp = fr; fr = p;
    }
  }
  return 0;
}

