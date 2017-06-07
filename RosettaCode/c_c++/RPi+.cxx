
#include <cstdlib>
#include <iostream>

using std::cout;
using std::endl;

int main(int argc, char ** argv, char ** envp) {
  int retCode(0);
  int places(0);
  int digitCt(0);
  int64_t q_(1), r_(0), t_(1), k_(1), n_(3), l_(3);
  int64_t nn, nr;
  bool first(true);

  if (argc > 1) {
    places = atoi(argv[1]);
  }

  while (true) {
    if (4 * q_ + r_ - t_ < n_ * t_) {
      digitCt++;
      if (places > 0 & digitCt - 1 > places) { break; }
      cout << n_;
      if (first) {
        cout << '.';
        first = false;
      }
      nr  = 10 * (r_ - n_ * t_);
      n_  = ((10 * (3 * q_ + r_)) / t_) - 10 * n_;
      q_ *= 10;
      r_  = nr;
    }
    else {
      nr  = (2 * q_ + r_) * l_;
      nn  = (q_ * (7 * k_ + 2) + r_ * l_) / (t_ * l_);
      q_ *= k_;
      t_ *= l_;
      l_ += 2;
      k_ += 1;
      n_  = nn;
      r_  = nr;
    }
  }
  cout << endl << endl;

  return retCode;
}

