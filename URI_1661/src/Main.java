import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
     
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
 
        while(true){
            int t = br.nextInt();
             
            if(t==0){
                break;
            }
             
            int[] casas = new int[t];
            for(int y=0; y<t;y++){
                casas[y] = br.nextInt();
            }
             
            long custo=0;
            int y;
            for(y=0; y < t-1;y++){
                custo += Math.abs(casas[y]);
                casas[y+1] = casas[y + 1] + casas[y]; 
            }
            custo+=casas[y];
            System.out.println(custo);
             
        }
 
    }
 
 
}