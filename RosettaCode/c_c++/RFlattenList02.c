
#include <stdio.h>
#include <string.h>

int main(int argc, char* argv[])
{
  char* tok = NULL;
  char* delims = "'()[], ";

  static char defaultArg[] = "[[1], 2, [[3,4], 5], [[[]]], [[[6]]], 7, 8, []]";
  char* inArg;

  /*
  if (argc != 2) {
    fprintf(stderr, "Usage: flatten <list>\n");
    return 1;
  }
  */
  if (argc != 2) {
    inArg = defaultArg;
  }
  else {
    inArg = argv[1];
  }
  printf("%s\n", inArg);

  printf("[");
  if ((tok = strtok(inArg/*argv[1]*/, delims)) != NULL) {
    printf("%s", tok);
    while ((tok = strtok(NULL, delims)) != NULL) {
      printf(", %s", tok);
    }
  }
  printf("]\n");

  return 0;
}

/*
$ ./flatten '[[1], 2, [[3,4], 5], [[[]]], [[[6]]], 7, 8, []]'
[1, 2, 3, 4, 5, 6, 7, 8]
*/

