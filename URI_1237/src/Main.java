import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
 
        while (teclado.hasNext()) {
            String nome1 = teclado.nextLine();
            String nome2 = teclado.nextLine();
 
            int tam_max = 0;
            for (int i = 0; i <= nome1.length(); i++) {
                for (int j = i; j <= nome1.length(); j++) {
                    String teste = nome1.substring(i, j);
                    if (nome2.contains(teste)) {
                        if (teste.length() > tam_max) {
                            tam_max = teste.length();
                        }
                    }
                }
            }
            System.out.println(tam_max);
        }
 
    }
 
}