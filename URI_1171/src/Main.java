import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        int[] array = new int[2001];
         
        for(int i =0; i<a; i++){
            array[scanner.nextInt()]++;
        }
         
        for(int p=0; p < 2001; p++ ){
            if(array[p] > 0){
                System.out.println(p + " aparece " + array[p] + " vez(es)" );
            }
        }
    }
}