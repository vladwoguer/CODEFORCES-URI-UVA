import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
  
 
public class Main {
  
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
 
          
        while(true){
                      
        String lido0 = scanner.nextLine();
        StringTokenizer parser0 = new StringTokenizer(lido0);
        int lin = Integer.parseInt(parser0.nextToken());
        int col = Integer.parseInt(parser0.nextToken());
        int color = Integer.parseInt(parser0.nextToken());
         
        if(lin==col && lin==0)
            break;
            if (color == 1)
                System.out.println(((col - 6)/2) * ((lin - 6)/2) + ((col - 7)/2) * ((lin - 7)/2));
        else
                System.out.println(((col - 7)/2) * ((lin - 6)/2) + ((col - 6)/2) * ((lin - 7)/2));
        }
            }
}