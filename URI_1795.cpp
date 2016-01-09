#include <stdio.h>
#include <stdlib.h>
 
long long potencia(int base, int expoente);
int main()
{
    int r;
    long long x;
    scanf("%d", &r);
 
    x = potencia(3,r);
 
    printf("%lli\n", x);
 
 
    return 0;
}
 
long long potencia(int base, int expoente){
    long long retorno = base;
     
    if(expoente == 0){
        return 1;
    }
    for(int i=0;i<expoente-1; i++){
        retorno = retorno * base;
    }
    return retorno;
}

