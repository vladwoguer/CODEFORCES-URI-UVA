import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
            int A = Integer.parseInt(parser1.nextToken());
            int C = Integer.parseInt(parser1.nextToken());
            if(A==0 && C==0){
                break;
            }
            List<Long> alturas = new ArrayList<Long>();
     
            String dados = scanner.nextLine();
             
            StringTokenizer parser = new StringTokenizer(dados);
            while (parser.hasMoreTokens()) {
                String token = parser.nextToken();
                alturas.add(Long.parseLong(token));
            }
            Long counter =A- alturas.get(0);
             
                for(int i =0; i< C-1; i++){
                    if(alturas.get(i) > alturas.get(i+1)){
                            counter+= alturas.get(i) - alturas.get(i+1);        
                    }
                }
             
            System.out.println(counter);
        }
 
    }
 
}