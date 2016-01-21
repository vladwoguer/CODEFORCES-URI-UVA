import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        String str = br.nextLine();
        int n = Integer.parseInt(str);
          
        for(int i=0; i< n; i++){
            str = br.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            int N =Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            long[] valores = new long[N];
            str = br.nextLine();
            StringTokenizer tk = new StringTokenizer(str);
            for(int j=0; j<N; j++){
                valores[j]= Long.parseLong(tk.nextToken());
            }
            Arrays.sort(valores);
            System.out.println(determinaValor(valores, K));
        }
  
    }
  
    private static String determinaValor(long[] valores, int n) {
        List<String> numeros = new ArrayList<String>();
        for(Long val : valores) {
                String binario = Long.toString(val, 2);
                String pre = "";
                for(int i =0; i< 32-binario.length();i++){
                        pre+="0";
                }
                binario = pre + binario;
                numeros.add(binario);
        }
        
        List<String> resposta = null;
        for(int i=0; i < 32; i++){
                int cont =0;
                resposta = new ArrayList<String>();
                for(String numero : numeros){
                       if(numero.charAt(i) == '1'){
                           cont++;
                           resposta.add(numero);
                       }
                }
                if(cont >= n){
                    numeros = new ArrayList<String>(resposta);
                }
        }
        
        return montaResposta(numeros);
    }
 
    private static String montaResposta(List<String> resposta) {
        if(resposta == null || resposta.size() == 0){
            return "0";
        }
         
        String inicial = "11111111111111111111111111111111";
        for(String r :  resposta) {
            inicial=and(inicial, r);
        }
         
        return String.valueOf(decimal(inicial));
    }
 
    private static long decimal(String inicial) {
        long resposta=0;
        long cont = 1;
        for(int i=31; i > -1; i--){
            resposta += cont*(inicial.charAt(i) == '1' ? 1 : 0);
            cont *=2;
        }
         
        return resposta;
    }
 
    private static String and(String inicial, String r) {
        String resposta = "";
        for(int i=0; i<32; i++){
            resposta+= (inicial.charAt(i)=='1' && r.charAt(i)=='1') ? "1":"0"; 
        }
        return resposta;
    }
  
}