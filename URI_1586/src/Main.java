import java.io.IOException;
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N;
        String[] pessoas = new String[100005];
        int[] potuacao = new int[100005];
  
        String str = scanner.nextLine();
        N = Integer.parseInt(str);
  
        while (N != 0) {
            long total_sempesoB = 0;
            long timeB = 0;
            for (int i = 1; i <= N; i++) {
                potuacao[i] = 0;
  
                pessoas[i] = scanner.nextLine();
  
                for (int j = 0; j < pessoas[i].length(); j++)
                    potuacao[i] += pessoas[i].charAt(j);
  
                total_sempesoB += potuacao[i];
                timeB += potuacao[i] * i;
            }
  
            int solucao = 0;
            long timeA = 0;
            long total_sempesoA = 0;
            for (int i = 1; i <= N; i++) {
                timeB -= total_sempesoB;
                total_sempesoB -= potuacao[i];
  
                total_sempesoA += potuacao[i];
                timeA += total_sempesoA;
                if (timeA == timeB) {
                    solucao = i;
                    break;
                }
                if (timeA > timeB)
                    break;
            }
  
            if (solucao == 0) {
                System.out.println("Impossibilidade de empate.");
            } else {
                System.out.println(String.valueOf(pessoas[solucao]));
            }
            str = scanner.nextLine();
            N = Integer.parseInt(str);
        }
  
    }
}