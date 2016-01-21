import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
         
        Scanner teclado = new Scanner(System.in);
         
        while(true){
            Integer vezes = Integer.parseInt(teclado.nextLine());
            if(vezes==0) break;
            Map<String, Integer> problema_resolvido =  new HashMap<String, Integer>();
            Map<String, Integer> submissao_incorreta =  new HashMap<String, Integer>();
             
            for(int y =0 ; y < vezes ; y++) {
                 String[] submissao = teclado.nextLine().split(" ");
                 if(submissao[2].equals("correct")){
                     if(!problema_resolvido.containsKey(submissao[0])) {
                         problema_resolvido.put(submissao[0], Integer.parseInt(submissao[1]));
                     }
                 } else {
                    if(!submissao_incorreta.containsKey(submissao[0])){
                        submissao_incorreta.put(submissao[0], 1);
                    } else {
                        submissao_incorreta.put(submissao[0], submissao_incorreta.get(submissao[0])+1);
                    }
                 }
            }
             
            int cont = 0;
            int tempo = 0;
            for(String a :  problema_resolvido.keySet()) {
                cont++;
                tempo+=( problema_resolvido.get(a) + (submissao_incorreta.containsKey(a) ? submissao_incorreta.get(a) * 20: 0));
            }
            System.out.println(cont+" "+tempo);
             
             
        }
 
    }
 
}