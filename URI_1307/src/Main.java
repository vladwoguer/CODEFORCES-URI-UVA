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
            String a = parser1.nextToken();
            String lidos2 = scanner.nextLine();
            StringTokenizer parser2 = new StringTokenizer(lidos2);
            String b = parser2.nextToken();
 
             
            System.out.println("Pair #"+w+": "+ (mdc(decimal(a),decimal(b))!=1?"All you need is love!":"Love is not all you need!"));
            }
            }
 
 
    private static long decimal(String b) {
        long pot = 1;
        String num=b+"";
        long resposta = 0;
        for(int i=num.length()-1; i>=0;i--){
            resposta+=Integer.parseInt(num.charAt(i)+"")*pot;
            pot *=2;
        }
        return resposta;
    }
 
 
    public static long mdc(long a , long b){
        if(b==0){
            return a;
        }else{
            return mdc(b, a % b);
        }
    }
}