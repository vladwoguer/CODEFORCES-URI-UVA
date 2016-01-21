import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         
        String lido0 = scanner.nextLine();
        StringTokenizer parser0 = new StringTokenizer(lido0);
        int max = Integer.parseInt(parser0.nextToken());
         
        for (int w = 1; w <= max; w++) {
            String lidos = scanner.nextLine();
            StringTokenizer parser1 = new StringTokenizer(lidos);
            int a = Integer.parseInt(parser1.nextToken());
            System.out.println(prime(a));
            }
            }
 
    public static String prime(int numero){
        for(int i=2; i< Math.round(Math.sqrt(numero));i++){
            if(numero % i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
}