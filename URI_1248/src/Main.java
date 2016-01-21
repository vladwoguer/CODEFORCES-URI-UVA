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
 
        for (int i = 0; i < vezes; i++) {
            char[] dieta = teclado.nextLine().toCharArray();
            String cafe = teclado.nextLine();
            String almoco = teclado.nextLine();
            char[] soma = (cafe + almoco).toCharArray();
 
            Arrays.sort(dieta);
            Arrays.sort(soma);
 
            verificaIntruso(dieta, soma);
 
        }
 
    }
 
     
 
    private static void verificaIntruso(char[] dieta, char[] soma) {
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();
 
        for (Character c : dieta) {
            if (!mapa.containsKey(c)) {
                mapa.put(c, 1);
            } else {
                mapa.put(c, mapa.get(c) + 1);
            }
        }
 
        for (Character c : soma) {
            if (mapa.containsKey(c)) {
                if (mapa.get(c) == 0) {
                    System.out.println("CHEATER");
                    return;
                } else {
                    mapa.put(c, mapa.get(c) - 1);
                }
            } else {
                System.out.println("CHEATER");
                return;
            }
        }
         
        String resultado = "";
        for(Character c : dieta) {
            for(int i=0; i < mapa.get(c); i++){
                resultado+=c;
            }
        }
        System.out.println(resultado);
 
    }
 
}