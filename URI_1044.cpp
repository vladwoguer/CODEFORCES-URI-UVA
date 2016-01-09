#include<stdio.h>
 
int eh_multiplo(int a, int b);
int main(void) {
    int a,b;
    scanf("%d %d", &a,&b);
    printf(eh_multiplo(a,b) ? "Sao Multiplos\n" : "Nao sao Multiplos\n");
    return 0;
}
 
int eh_multiplo(int a, int b) {
    if (a > b) {
        return a % b == 0;
    } else {
        return b % a == 0;
    }
}
