#include <cstdio>
 
int main() {
    double valor;
    double nota[] = {100, 50, 20, 10, 5, 2};
    double moeda[] = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
     
    scanf("%lf", &valor);
    printf("NOTAS:\n");
    for(int i=0; i<6;i++){
        int cont=0;
        while((valor-nota[i])>=0){
            valor -=nota[i];
            cont++;
        }
        printf("%d nota(s) de R$ %.2lf\n", cont, nota[i]);
    }
     
     printf("MOEDAS:\n");
    for(int i=0; i<6;i++){
        int cont=0;
        while((valor-moeda[i])>0){
            valor -=moeda[i];
            cont++;
        }
        printf("%d moeda(s) de R$ %.2lf\n", cont, moeda[i]);
    }
    
  
}
