import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
 
         InputStreamReader in = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(in);
           
        String lido;
         
        Map<Integer, ArrayList<Integer>> respostas;
        while ((lido=br.readLine()) != null) {
            respostas = new HashMap<Integer, ArrayList<Integer>>();
            StringTokenizer st1 = new StringTokenizer(lido);
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
             
            lido = br.readLine();
            StringTokenizer st2 = new StringTokenizer(lido);
            for(int i=1; i<=n; i++){
                int numero = Integer.parseInt(st2.nextToken());
                if(!respostas.containsKey(numero)){
                    respostas.put(numero, new ArrayList<Integer>());
                }
                respostas.get(numero).add(i);
            }
             
            for(int w=1; w<=m; w++){
                lido = br.readLine();
                StringTokenizer st3 = new StringTokenizer(lido);
                int k = Integer.parseInt(st3.nextToken());
                int v = Integer.parseInt(st3.nextToken());
                if(respostas.containsKey(v)){
                    if(!(k>respostas.get(v).size())){
                        System.out.println(respostas.get(v).get(k-1));
                    }else{
                        System.out.println(0);
                    }
                }else{
                    System.out.println(0);
                }
            }
             
         
        }
    }
 
}