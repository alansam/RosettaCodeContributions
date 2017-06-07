/* program RFlowControlC */

#include <stdlib.h>
#include <stdio.h>

int main(int argc, char ** argv, char ** envp) {
  int ret = 0;
  int i_;
  top:
  for (i_ = 0; i_ < 10; ++i_) {
    printf(" %06d\n", i_);
    if (i_ > 2) { break /*top*/; }
  }
  return ret;
}

