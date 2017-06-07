
#include <stdio.h>
#include <stdlib.h>

/*
 * Doesn't work with Julian calendar (then again, you probably don't need to plan your weekends for middle ages).
 */
int main(int argc, char ** argv)
{
	int days[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int mth, yr, wk;
	int returnVal;

	if (argc < 2 || (yr = atoi(argv[1])) <= 1700) {
	  returnVal = 1;
	}
	else {
    days[1] -= (yr % 4) || (!(yr % 100) && (yr % 400));
    wk = yr * 365 + (yr - 1) / 4 - (yr - 1) / 100 + (yr - 1) / 400 + 6;
   
    for (mth = 0; mth < 12; mth++) {
      wk = (wk + days[mth]) % 7;
      printf("%d-%02d-%d\n", yr, mth + 1, days[mth] + (wk < 5 ? -2 : 5) - wk);
    }
    returnVal = 0;
	}
 
	return returnVal;
}

