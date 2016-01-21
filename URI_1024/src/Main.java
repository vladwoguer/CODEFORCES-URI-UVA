import java.io.IOException;
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
  
        Scanner teclado = new Scanner(System.in);
        int vezes = Integer.parseInt(teclado.nextLine());
         
        for(int i=0; i<vezes; i++) {
            char[] proximo = teclado.nextLine().toCharArray();
            int tamanho = proximo.length;
            char[] novo =new char[tamanho];
            int cont =0;
            for(int k=tamanho-1; k >= 0; k--) {
                novo[cont++] = (char) (Character.isLetter(proximo[k]) ? proximo[k] + 3 : proximo[k]);
            }
         
            for(int z=tamanho/2;z < tamanho; z++) {
                novo[z] = (char) (novo[z] - 1);
            }
             
            System.out.println(novo);
        }
         
         
    }
  
}