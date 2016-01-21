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
            char[] frase = teclado.nextLine().toLowerCase().toCharArray();
 
            verificaIntruso(frase);
 
        }
 
    }
 
    private static void verificaIntruso(char[] frase) {
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();
 
        for (Character c : frase) {
            if (Character.isLetter(c)) {
                if (!mapa.containsKey(c)) {
                    mapa.put(c, 1);
                } else {
                    mapa.put(c, mapa.get(c) + 1);
                }
            }
        }
        int maior= 0;
        for(Integer in : mapa.values()){
            if(in > maior) {
                maior = in;
            }
        }
         
        String resultado = "";
         
        for(Entry<Character, Integer> en : mapa.entrySet()){
            if(en.getValue()==maior){
                resultado += en.getKey();
            }
        }
         
        char[] resul = resultado.toCharArray();
         
        Arrays.sort(resul);
        System.out.println(resul);
 
    }
 
}