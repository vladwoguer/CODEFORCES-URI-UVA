import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
 
        int vezes = Integer.parseInt(teclado.nextLine());
 
        for (int i = 0; i < vezes; i++) {
            String frase = teclado.nextLine().toLowerCase();
 
            Set<Character> caracteres = new HashSet<Character>();
            for (Character c : frase.toCharArray()) {
                if (c != ',' && c != ' ') {
                    caracteres.add(c);
                }
            }
 
            int letras = caracteres.size();
            System.out.println(
                    letras == 26 ? "frase completa" : (letras >= 13 ? "frase quase completa" : "frase mal elaborada"));
        }
 
    }
 
}