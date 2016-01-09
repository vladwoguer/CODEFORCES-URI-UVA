#include <cstdio>
void verificaIntervalo(double n);
int main() {
    int a, b;
    double valor[] = {4, 4.5, 5, 2, 1.5};
    scanf("%d %d", &a, &b);
     
    printf("Total: R$ %.2lf\n", valor[a-1] * b);
     
     
}
