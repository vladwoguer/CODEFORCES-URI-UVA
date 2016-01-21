import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
             
            while(true) {
                String lido = scanner.nextLine();
                StringTokenizer parser1 = new StringTokenizer(lido);
                long B = Long.parseLong(parser1.nextToken());
                if(B==0){
                    break;
                }
                int[] fatoriais = {1,2,6,24,120};
                String manipulavel = "" + B;
                 
                long valor = 0;
                int cont=0;
                for(int z = manipulavel.length()-1; z >-1; z--){
                    valor += Long.parseLong(""+manipulavel.charAt(z)) * fatoriais[cont++];
                }
                System.out.println(valor);
                     
             
             
 
        }
 
    }
}