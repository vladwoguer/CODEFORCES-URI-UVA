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
            int N = Integer.parseInt(parser1.nextToken());
            int B = Integer.parseInt(parser1.nextToken());
            if(N==0 && B==0){
                break;
            }
            List<Long> bolas = new ArrayList<Long>();
     
            String dados = scanner.nextLine();
             
            StringTokenizer parser = new StringTokenizer(dados);
            while (parser.hasMoreTokens()) {
                String token = parser.nextToken();
                bolas.add(Long.parseLong(token));
            }
             
            Set<Long> possibilidades = new HashSet<Long>();
            for(Long bola1 : bolas)
                for(Long bola2 : bolas){
                    if(bola1 != bola2)
                        possibilidades.add(Math.abs(bola1 - bola2));
                }
             
            boolean possuiTodos = true;
             
            for(int i =1; i<=N; i++){
                if(!possibilidades.contains(new Long(i))){
                    possuiTodos = false;
                }
            }
             
            System.out.println(possuiTodos ? 'Y':'N');
        }
 
    }
 
}