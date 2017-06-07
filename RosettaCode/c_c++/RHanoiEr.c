/*  Er's LLHanoi Hanoi Tower loop less algorithm */
/* http://hanoitower.mkolar.org/algo.html */

#include <stdio.h>
#include <stdlib.h>

#define PR      (void) printf(
#define PE      (void) fprintf(stderr,

#define ALLO(x) { if((x = (int *) malloc((n+2) * sizeof(int))) == NULL) {\
                  PE #x " allocation failed!\n"); exit(1); } }


/*========================*/
int main(int argc, char *argv[])
{
  int i, dir, *D, *s, n, n1;

  n = atoi(argv[1]);
  n1 = n + 1;
  ALLO(D)
  ALLO(s)

  for (i = 0; i <= n1; i++) {
    D[i] = 1;
    s[i] = i + 1;
  }

  dir = n & 1;

  for (;;) {
    i = s[0];
    if (i > n) break;
    PR"move disc %d from %d ", i, D[i]);
    PR"to %d\n", D[i] = (D[i] + (i & 1 ? dir : 1 - dir)) % 3 + 1);
    s[0]     = 1;
    s[i - 1] = s[i];
    s[i]     = i + 1;
  }
  return 0;
}

