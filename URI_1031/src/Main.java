import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
 
/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         
        while(true) {
            String lido0 = scanner.nextLine();
            StringTokenizer parser0 = new StringTokenizer(lido0);
            int max = Integer.parseInt(parser0.nextToken());
            if(max==0)break;
            for(int salto =1; salto <= 9999;salto++ ){
            ArrayList<Integer> suicidas = new ArrayList<Integer>();
            for(int i = 0; i < max; i++){
                suicidas.add(i);
            }
            int posUltimoMorto = -(salto);
            String a="";
            while(suicidas.size() > 1){
                int proximo=posUltimoMorto;
                proximo = (proximo+salto) % suicidas.size();
                a += (suicidas.get(proximo)+1) +" ";
                suicidas.remove((proximo));     
                posUltimoMorto = proximo-1;
                    }
            if(suicidas.get(0) == 12){
                System.out.println(salto);
                break;
            }
            }
            }
            }
 
 
        }