
#include <math.h>
#include <stdio.h>

#define toRadians(d) d * M_PI / 180.0
#define toDegrees(r) r * 180.0 / M_PI

double meanAngle(double * angles, int size)
{
  double y_part = 0, x_part = 0;
  int i;

  /*
  for (i = 0; i < size; i++)
  {
    x_part += cos(angles[i] * M_PI / 180);
    y_part += sin(angles[i] * M_PI / 180);
  }
  */
  for (i = 0; i < size; i++)
  {
    x_part += cos(toRadians(angles[i]));
    y_part += sin(toRadians(angles[i]));
  }

//  return atan2(y_part / size, x_part / size) * 180 / M_PI;
  x_part /= size;
  y_part /= size;
  double avg_r = atan2(y_part, x_part);
  double avg_d = toDegrees(avg_r);
  return avg_d;
}

int main(int argc, char ** argv, char ** envp)
{
  double angleSet1[] = { 350, 10 };
  double angleSet2[] = { 90, 180, 270, 360};
  double angleSet3[] = { 10, 20, 30};
  double angleSet4[] = { 180 };

  printf("\nMean Angle for 1st set : %12.6lf degrees", meanAngle(angleSet1, sizeof(angleSet1) / sizeof(angleSet1[0])));
  printf("\nMean Angle for 2nd set : %12.6lf degrees", meanAngle(angleSet2, sizeof(angleSet2) / sizeof(angleSet2[0])));
  printf("\nMean Angle for 3rd set : %12.6lf degrees", meanAngle(angleSet3, sizeof(angleSet3) / sizeof(angleSet3[0])));
  printf("\nMean Angle for 4th set : %12.6lf degrees", meanAngle(angleSet4, sizeof(angleSet4) / sizeof(angleSet4[0])));
  printf("\n");

  return 0;
}

