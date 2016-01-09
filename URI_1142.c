#include<stdio.h>
 
int main(){
    int numero=0;
    int n;
    int i;
     
    scanf("%d", &n);
     
    for(i=0; i< n;i++){
        printf("%d %d %d PUM\n", numero+1,numero+2,numero+3);
        numero=numero+4;
    }
     
    return 0;
}
