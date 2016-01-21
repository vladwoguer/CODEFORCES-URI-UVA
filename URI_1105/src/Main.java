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
            String lido = scanner.nextLine();
            StringTokenizer parser1 = new StringTokenizer(lido);
            int B = Integer.parseInt(parser1.nextToken());
            int N = Integer.parseInt(parser1.nextToken());
            if(B==0 && N==0){
                break;
            }
            List<Long> reservas = new ArrayList<Long>();
            reservas.add(new Long(0));
     
            String dados = scanner.nextLine();
             
            StringTokenizer parser = new StringTokenizer(dados);
            while (parser.hasMoreTokens()) {
                String token = parser.nextToken();
                reservas.add(Long.parseLong(token));
            }
             
            for(int i = 1; i <= N; i++){
                String lido1 = scanner.nextLine();
                StringTokenizer parser2 = new StringTokenizer(lido1);
                int devedor = Integer.parseInt(parser2.nextToken());
                int credor = Integer.parseInt(parser2.nextToken());
                Long valor = Long.parseLong(parser2.nextToken());
                reservas.set(devedor, reservas.get(devedor) - valor);
                reservas.set(credor, reservas.get(credor) + valor);
            }
             
            boolean temValorNegativo = false;
            for(Long reserva : reservas){
                if(reserva<0){
                    temValorNegativo=true;
                }
            }
             
            if(temValorNegativo==true){
                System.out.println('N');
            }else{
                System.out.println('S');
            }
             
 
        }
 
    }
 
}