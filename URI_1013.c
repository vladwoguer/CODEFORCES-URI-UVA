#include<stdio.h>
#include<stdlib.h>
 
int maior(int a, int b);
int main(){
    int primeiro;
    int segundo;
    int terceiro;
    int mai;
 
    // Le a linha codigo quantidade valor
    scanf("%d %d %d", &primeiro, &segundo, &terceiro);
    mai = maior(primeiro, segundo);
    mai = maior(mai, terceiro);
     
    printf("%d eh o maior\n", mai);
     
    return 0;
}
 
// Fómula que ele deu
int maior(int a, int b) {
    return (a+b + abs(a-b)) / 2;
}
