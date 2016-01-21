import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;
 
/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
 
        while (true) {
            if (Integer.parseInt(br.readLine()) == 0) {
                break;
            }
 
            while (true) {
                String lido = br.readLine();
                StringTokenizer tk = new StringTokenizer(lido);
                 
                ArrayList<String> lidos = new ArrayList<String>();
                while(tk.hasMoreTokens()){
                    lidos.add(tk.nextToken());
                }
 
                int[] vagoes = new int[lidos.size()];
                for (int i = 0; i < lidos.size(); i++) {
                    vagoes[i] = Integer.parseInt(lidos.get(i));
                }
 
                if (vagoes[0] == 0) {
                    break;
                }
                Stack<Integer> pilha = new Stack<Integer>();
                int conta = 0;
                for (int i = 1; i <= vagoes.length; i++) {
                    pilha.push(i);
                    while (!pilha.empty() && pilha.peek() == vagoes[conta]
                            && conta <= vagoes.length) {
                        pilha.pop();
                        conta++;
                    }
                }
                System.out.println(pilha.empty() ? "Yes" : "No");
            }
            System.out.println();
        }
    }
}