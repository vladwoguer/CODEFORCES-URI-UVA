#include<stdio.h>
 
int main(){
    int codigo;
    int quantidade;
    float valor;
    float total=0;
    int i;
    // Executa duas vezes
    for(i=0; i<2;i++){
        // Le a linha codigo quantidade valor
        scanf("%d %d %f", &codigo, &quantidade, &valor);
        total += quantidade * valor;
     
    }
    // %.2f quer dizer um float com duas casas depois da virgula
    printf("VALOR A PAGAR: R$ %.2f\n", total);
     
    return 0;
}
