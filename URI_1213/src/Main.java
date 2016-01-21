import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         
            while(scanner.hasNext()) {
                 
                String lido = scanner.nextLine();
                StringTokenizer parser1 = new StringTokenizer(lido);
                int B = Integer.parseInt(parser1.nextToken());
                 
            System.out.println(getNumeroDeUns(B));
                 
        }
    }
     
    public static int  getNumeroDeUns(int divisor){
        int i=1;
        long numero =1;
        while(!(numero%divisor==0)){
            numero = ((10%divisor*numero%divisor)%divisor + 1%divisor) % divisor;
            i++;
        }
        return i;
    }
}