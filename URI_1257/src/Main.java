import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
 
        int vezes = Integer.parseInt(teclado.nextLine());
         
        for(int i=0; i < vezes; i++) {
            int palavras = Integer.parseInt(teclado.nextLine());
            int soma = 0;
            int cont1 = 0;
            for(int j=0; j < palavras; j++) {
                String palavra = teclado.nextLine();
                int cont2=0;
                for(char c: palavra.toCharArray()) {
                    soma+= (c-65) + cont1 + cont2;
                    cont2++;
                }
                cont1++;
            }
            System.out.println(soma);
        }
 
    }
 
}