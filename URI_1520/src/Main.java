import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
          
        String str;
        while (br.hasNext()) {
      
            ArrayList<Integer> prateleiras = new ArrayList<Integer>();
              
            long n = br.nextInt();
             
            for(int i=0; i<n; i++){
                
                int uno = br.nextInt();
                int dos = br.nextInt();
                for(int y=uno; y<=dos; y++){
                    prateleiras.add(y);
                }
            }
             
             
            Collections.sort(prateleiras);
            Integer procurado = br.nextInt();
            int indice =prateleiras.indexOf(procurado);
            int ultimo =prateleiras.lastIndexOf(procurado);
            System.out.println(indice ==-1? procurado + " not found" : procurado + " found from " +indice +" to "+ultimo);
          
        }
  
    }
  
  
  
}