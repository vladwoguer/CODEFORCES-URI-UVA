import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
 
        String str;
        int cont = 1;
        while (true) {
            str = br.nextLine();
 
            StringTokenizer st = new StringTokenizer(str);
            int uno = Integer.parseInt(st.nextToken());
            int[] prateleiras = new int[uno];
            int dos = Integer.parseInt(st.nextToken());
            if (uno == 0 && dos == 0) {
                break;
            }
            int conter = 0;
            for (int y = 0; y < uno; y++) {
                str = br.nextLine();
                st = new StringTokenizer(str);
                prateleiras[conter] = Integer.parseInt(st.nextToken());
                conter++;
            }
            Arrays.sort(prateleiras);
            System.out.println("CASE# " + cont + ":");
            for (int p = 0; p < dos; p++) {
                str = br.nextLine();
                st = new StringTokenizer(str);
                Integer procurado = Integer.parseInt(st.nextToken());
 
                int indice = busca_binaria(prateleiras, procurado);
                System.out.println(indice == -1 ? procurado + " not found"
                        : procurado + " found at " + indice);
            }
            cont++;
 
        }
 
    }
 
    private static int busca_binaria(int[] prateleiras, int procurado) {
        int indice = Arrays.binarySearch(prateleiras, procurado);
 
        if (indice == 0) {
            return 1;
        }
 
        if (indice < 0) {
            return -1;
        }
 
        while(prateleiras[indice -1]==procurado){
            if(indice-1 == 0) {
                return 1;
            }
            indice--;
        }
 
        return indice + 1;
    }
 
}