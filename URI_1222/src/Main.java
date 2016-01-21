import java.io.IOException;
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
         
        while(teclado.hasNext()) {
            String[] NLC =  teclado.nextLine().split(" ");
             
            int N =  Integer.parseInt(NLC[0]);
            int L = Integer.parseInt(NLC[1]);
            int C = Integer.parseInt(NLC[2]);
            String[] texto = teclado.nextLine().split(" ");
             
            int linha = 0;
            int pagina = 1;
             
            int tamanho_linha = 0;
             
         
             
            for(String palavra : texto) {
                if((tamanho_linha+palavra.length()) > C) {
                    tamanho_linha = palavra.length()+1;
                    linha++;
                } else {
                    tamanho_linha += palavra.length() + 1;
                }
                 
                if(linha == L) {
                    pagina++;
                    linha=0;
                }
            }
             
            System.out.println(pagina);
        }
  
    }
  
}