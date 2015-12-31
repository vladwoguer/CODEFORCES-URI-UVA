#include <stdio.h>

double media_ponderada(double a, double b, double c);

int main(void) {
	int n, i;
	double a, b, c;
	scanf("%d", &n);
	for(i = 0; i < n; i++) {
		scanf("%lf %lf %lf", &a, &b, &c);
		printf("%.1lf\n", media_ponderada(a, b, c));
	}  
	return 0;
}

double media_ponderada(double a, double b, double c) {
	return (a * 2 + b * 3 + c * 5) / 10;  
}
