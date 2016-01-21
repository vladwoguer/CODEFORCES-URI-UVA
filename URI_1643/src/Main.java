import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
    static int[] fibonacci;
 
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
 
        fibonacci = new int[30];
 
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        fibonacci[2] = 3;
 
        for (int pos = 3; pos < 29; pos++) {
            fibonacci[pos] = fibonacci[pos - 1] + fibonacci[pos - 2];
        }
 
        String str;
 
        str = br.nextLine();
 
        StringTokenizer st = new StringTokenizer(str);
        int t = Integer.parseInt(st.nextToken());
 
        for (int i = 0; i < t; i++) {
            str = br.nextLine();
            st = new StringTokenizer(str);
            int milhas = Integer.parseInt(st.nextToken());
            System.out.println(montaFibonnacci(milhas));
 
        }
 
    }
 
    private static int montaFibonnacci(int milhas) {
 
        for (int p = 29; p > 0; p--) {
            if (fibonacci[p] == milhas) {
 
                return fibonacci[p - 1];
            }
        }
 
        int numero = 0;
        int copia = milhas;
 
        int indice = 0;
        for (int p = 0; p < 30; p++) {
            if (fibonacci[p] >= milhas) {
                indice = p;
            }
        }
 
        for (int p = indice - 1; p >= 1; p--) {
            if (cabe(copia, fibonacci[p])) {
                copia -= fibonacci[p];
                numero += fibonacci[p - 1];
            }
        }
 
        return numero;
 
    }
 
    private static boolean cabe(int copia, int i) {
        return !(copia - i < 0);
    }
 
}