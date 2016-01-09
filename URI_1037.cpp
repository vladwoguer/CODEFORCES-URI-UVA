#include <cstdio>
void verificaIntervalo(double n);
int main() {
    double a;
    scanf("%lf", &a);
    verificaIntervalo(a);
    return 0;
}
 
void verificaIntervalo(double n) {
    if(n>=0 && n<=25) {
        printf("Intervalo [0,25]\n");
        return;
    }
     
    if(n>25 && n<=50) {
        printf("Intervalo (25,50]\n");
        return;
    }
     
     if(n>50 && n<=75) {
        printf("Intervalo (50,75]\n");
        return;
    }
     
     if(n>75 && n<=100) {
        printf("Intervalo (75,100]\n");
        return;
    }
    printf("Fora de intervalo\n");
};
