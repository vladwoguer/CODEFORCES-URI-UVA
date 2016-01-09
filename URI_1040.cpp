#include <cstdio>
void verificaIntervalo(double n);
int main() {
    double valor[4];;
    scanf("%lf %lf %lf %lf", &valor[0],&valor[1],&valor[2],&valor[3]);
    double media = (2*valor[0] + 3*valor[1]+ 4*valor[2]+valor[3])/10;
     
    printf("Media: %.1lf\n", media);
     
    if(media>=7.0){
        printf("Aluno aprovado.\n");
    }
    if(media< 5.0){
        printf("Aluno reprovado.\n");
    } 
    if(media >= 5.0 && media <= 6.9) {
         printf("Aluno em exame.\n");
         double final;
         scanf("%lf", &final);
         printf("Nota do exame: %.1lf\n", final);
         media = (media+final)/2;
         if(media>=5.0){
            printf("Aluno aprovado.\n");
        } else{
            printf("Aluno reprovado.\n");
        }
        printf("Media final: %.1lf\n", media);
    }
     
     
     
     
}
