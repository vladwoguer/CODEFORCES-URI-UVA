import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
 
        while (br.hasNext()) {
            int n = Integer.parseInt(br.nextLine());
            int custo = Integer.parseInt(br.nextLine());
 
            long valor = Integer.MIN_VALUE;
            long valor_final = Integer.MIN_VALUE;
            TreeSet<Integer> candidatos = new TreeSet<Integer>();
            for (int i = 0; i < n; i++) {
                int lido = Integer.parseInt(br.nextLine()) - custo;
 
                if (lido + valor < lido) {
                    valor = lido;
                } else {
                    valor = valor + lido;
                }
                if (valor > valor_final) {
                    valor_final = valor;
                }
 
            }
            System.out.println(valor_final > 0 ? valor_final : 0);
        }
    }
 
}