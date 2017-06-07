/* program RFlowControlC+ */

#include <cstdlib>
#include <iostream>

int main(int argc, char ** argv, char ** envp) {
  int ret = 0;
  top:
  for (int i_ = 0; i_ < 10; ++i_) {
    std::cout << i_ << std::endl;
    if (i_ > 2) { break /*top*/; }
  }
  return ret;
}

