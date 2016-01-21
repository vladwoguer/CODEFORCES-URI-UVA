import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         
        while (true) {
            String lido = scanner.nextLine();
            StringTokenizer parser1 = new StringTokenizer(lido);
            int B = Integer.parseInt(parser1.nextToken());
            int N = Integer.parseInt(parser1.nextToken());
            if(B==0 && N==0){
                break;
            }
            Set<Long> reservasB = new HashSet<Long>();
     
            String dados = scanner.nextLine();
             
            StringTokenizer parser = new StringTokenizer(dados);
            while (parser.hasMoreTokens()) {
                String token = parser.nextToken();
                reservasB.add(Long.parseLong(token));
            }
             
            Set<Long> reservasN = new HashSet<Long>();
             
            String dados2 = scanner.nextLine();
             
            StringTokenizer parser2 = new StringTokenizer(dados2);
            while (parser2.hasMoreTokens()) {
                String token = parser2.nextToken();
                reservasN.add(Long.parseLong(token));
            }
             
            Set<Long> aux= new HashSet<Long>(reservasN);
            reservasN.removeAll(reservasB);
            reservasB.removeAll(aux);
            int reservaB = reservasN.size();
            int reservaN = reservasB.size();
            System.out.println(reservaB > reservaN ? reservaN : reservaB);
             
             
             
 
        }
 
    }
 
}