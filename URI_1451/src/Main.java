import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
 
        while (scanner.hasNext()) {
            String lido = scanner.nextLine();
            LinkedList<String> saida = new LinkedList<String>();
            boolean escreverNoComeco = false;
            int comeco=0;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < lido.length(); i++) {
                char caractere = lido.charAt(i);
                switch (caractere) {
                case '[': {
                    escreverNoComeco = true;
                    comeco=0;
                }
                    break;
                case ']':
                    escreverNoComeco = false;
                    break;
                default:
                    if (escreverNoComeco) {
                        sb.insert(comeco++, caractere);
                    } else {
                        sb.append(caractere);
                    }
                }
            }
             
             
 
            System.out.println(sb.toString());
        }
    }
 
}