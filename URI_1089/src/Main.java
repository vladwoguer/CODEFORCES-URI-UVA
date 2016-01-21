import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         
        while (true) {
            Integer lido = Integer.parseInt(scanner.nextLine());
            if(lido == 0){
                break;
            }
            List<Long> numeros = new ArrayList<Long>();
     
            String dados = scanner.nextLine();
             
            StringTokenizer parser = new StringTokenizer(dados);
            while (parser.hasMoreTokens()) {
                String token = parser.nextToken();
                numeros.add(Long.parseLong(token));
            }
 
            int picos = 0;
            for (int i = 0; i < numeros.size(); i++) {
                Long antecessor;
                Long numero;
                Long sucessor;
 
                if (i == 0) {
                    if (numeros.size() == 2) {
                        antecessor = numeros.get(numeros.size() - 1);
                        numero = numeros.get(i);
                        sucessor = antecessor;
                    } else {
                        antecessor = numeros.get(numeros.size() - 1);
                        numero = numeros.get(i);
                        sucessor = numeros.get(i + 1);
                    }
                } else if (i == (numeros.size() - 1)) {
                    if (numeros.size() == 2) {
                        antecessor = numeros.get(0);
                        numero = numeros.get(i);
                        sucessor = numeros.get(0);
                    } else {
                        antecessor = numeros.get(i - 1);
                        numero = numeros.get(i);
                        sucessor = numeros.get(0);
                    }
                } else {
                    antecessor = numeros.get(i - 1);
                    numero = numeros.get(i);
                    sucessor = numeros.get(i + 1);
                }
                if ((numero < antecessor && numero < sucessor)
                        || (numero > antecessor && numero > sucessor))
                    picos++;
            }
            System.out.println(picos);
 
        }
 
    }
 
}