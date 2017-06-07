#include <stdio.h>
#include <stdlib.h>

int main(int argc, char ** argv, char envp)
{
  int n_, x_;
  int moves = 0;
  printf("How many disks? ");
  scanf("%d", &n_);
  printf("\n");
  for (x_ = 1; x_ < (1 << n_); x_++)
  {
    ++moves;
    /* normalize towers to 1 - 3 */
    int move1 = ((x_ & x_ - 1) % 3) + 1;
    int move2 = (((x_ | x_ - 1) + 1) % 3) + 1;
    printf("%5d: move from tower %i to tower %i.\n", moves, move1, move2);
  }
  return 0;
}

