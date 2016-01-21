import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
 
        int vezes = Integer.parseInt(teclado.nextLine());
 
        for (int i = 0; i < vezes; i++) {
            String senha = teclado.nextLine().toUpperCase();
 
            int cont = 1;
            for (char c : senha.toCharArray()) {
                cont *= pertenceAClasseDosTres(c) ? 3 : 2;
            }
            System.out.println(cont);
        }
 
    }
 
    private static boolean pertenceAClasseDosTres(char c) {
        char[] classe_dos_tres = { 'A', 'E', 'I', 'O', 'S' };
        for (char ch : classe_dos_tres) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
 
}