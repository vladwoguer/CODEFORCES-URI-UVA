import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class Main {
    static Set<String> solucao = new TreeSet<String>();
    static String inicio;
    static int[] letras = new int[2000];
    static char[] arrayAuxiliar = new char[2000];
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            inicio = scanner.nextLine();
            int proximoCaso = inicio.length();
            for (int i = inicio.length() - 1; i >= 0; i--) {
                letras[i] = proximoCaso;
                if (i > 0 && inicio.charAt(i) != inicio.charAt(i - 1))
                    proximoCaso = i;
            }
 
            solucao = new TreeSet<String>();
            backTrack(0, 0);
 
            for (String solucaoImpressa : solucao) {
                System.out.println(solucaoImpressa);
            }
            System.out.println();
        }
    }
 
    private static void backTrack(int indiceBase, int indiceCandidato) {
        if (indiceCandidato == inicio.length()) {
            if (indiceBase != 0)
                solucao.add(convertePraString(arrayAuxiliar, indiceBase));
        } else {
            backTrack(indiceBase, letras[indiceCandidato]);
            for (int i = indiceCandidato; i < letras[indiceCandidato]; i++) {
                arrayAuxiliar[indiceBase++] = inicio.charAt(i);
                backTrack(indiceBase, letras[indiceCandidato]);
            }
        }
    }
 
    private static String convertePraString(char[] charArray, int limite) {
        return String.valueOf(charArray, 0, limite);
    }
 
}