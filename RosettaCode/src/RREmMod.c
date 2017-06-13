
#include <stdlib.h>
#include <stdio.h>

int irem(int N, int D);
int imod(int N, int D);

int main(int argc, char ** argv, char ** envp) {
	int rc = 0;

	int N = 5;
	int D = 26;
	int Q = -5;
	int R;

	R = N % D;
	printf("%d\n", R);

	R = irem(N, D);
	printf("%d\n", R);

	R = imod(N, D);
	printf("%d\n", R);

	R = Q % D;
	printf("%d\n", R);

	R = irem(Q, D);
	printf("%d\n", R);

	R = imod(Q, D);
	printf("%d\n", R);

	return rc;
}

int irem(int N, int D) {
	return N - D * (N / D);
}

int imod(int N, int D) {
	return irem(D + irem(N, D), D);
}

