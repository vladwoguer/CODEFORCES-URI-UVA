import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main {
 
    static List<Integer> chamadas = new ArrayList<Integer>();
    static List<Integer> resultados = new ArrayList<Integer>();
 
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        montaChamadas();
        montaResultados();
        int n = br.nextInt();
        List<Integer> lidos = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int numero = br.nextInt();
            System.out.println("fib(" + numero + ") = " + chamadas.get(numero)
                    + " calls = " + resultados.get(numero));
        }
 
    }
 
    private static void montaResultados() {
        resultados.add(0);
        resultados.add(1);
        resultados.add(1);
        resultados.add(2);
        resultados.add(3);
        for (int i = 5; i < 1000; i++) {
            resultados.add(resultados.get(i - 1) + resultados.get(i - 2) );
        }
         
    }
 
    static void montaChamadas() {
        chamadas.add(0);
        chamadas.add(0);
        chamadas.add(2);
        chamadas.add(4);
        for (int i = 4; i < 1000; i++) {
            chamadas.add(chamadas.get(i - 1) + chamadas.get(i - 2) + 2);
        }
    }
 
}