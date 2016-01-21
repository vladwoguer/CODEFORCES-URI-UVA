import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
 
         InputStreamReader in = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(in);
           
        String lido = br.readLine();
        int numero = Integer.parseInt(lido);
        br.readLine();
        int cont=0;
        HashMap<String, Float> arvores = new HashMap<String,Float>();
        int tamanho=0;
        TreeSet<String> lista = new TreeSet<String>();
         
        while ((lido=br.readLine()) != null) {
            if(lido.isEmpty()){
                cont++;
                controiResposta(arvores,lista, tamanho);
                System.out.println();
                arvores = new HashMap<String,Float>();
                tamanho=0;
                lista = new TreeSet<String>();
                }else{
                    if(!arvores.containsKey(lido)){
                        arvores.put(lido, new Float(0.0));
                        lista.add(lido);
                    }
                    arvores.put(lido, (arvores.get(lido)+1));
                    tamanho++;
                }
         
        }
        controiResposta(arvores,lista, tamanho);
    }
 
    private static void controiResposta(HashMap<String, Float> arvores,TreeSet<String>lista, int tamanho) {
        for(String chave : lista){
        System.out.printf(chave + " %.4f\n", ((arvores.get(chave))/tamanho)*100);
        }
    }
 
}