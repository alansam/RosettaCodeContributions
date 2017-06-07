/*Arithmetic Geometric Mean of 1 and cos pi/4
 
  Abhishek Ghosh
  24th August, 2012
*/
#include <math.h>
#include <stdio.h>

double agm(double a0, double g0) {
  double a1, g1;

  /*while (a != g) {*/
  while (abs(a0 - g0) >= 1e-14) {
    a1 = (a0 + g0) / 2;
    g1 = sqrt(a0 * g0);

    a0 = a1;
    g0 = g1;
  }

  return a0;
}

int main(int argc, char ** argv, char ** envp) {
  double a0, g0;
  printf("Enter two numbers : ");
  scanf("%lf%lf", &a0, &g0);
  if (a0 == 0) { a0 = 1; }
  if (g0 == 0) { g0 = 1 / sqrt(2); }
  printf("The AGM of %0.16lf and %0.16lf is : %0.16lf\n", a0, g0, agm(a0, g0));
  return 0;
}

