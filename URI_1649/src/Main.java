import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
 
        while (true) {
            int n = br.nextInt();
            int m = br.nextInt();
            int r = br.nextInt();
            int c = br.nextInt();
             
            if(n==0 && m==0 && r==0 && c==0 ) {
                break;
            }
 
            char[][] resultadoEsperado = new char[n][m];
            char[][] pinturaInicial = new char[n][m];
 
            for (int i = 0; i < n; ++i) {
                resultadoEsperado[i] = br.next().toCharArray();
                for (int j = 0; j < m; ++j) {
                    pinturaInicial[i][j] = '0';
                }
            }
            int conta = 0;
            for (int linha = 0; linha + r <= n; ++linha) {
                for (int coluna = 0; coluna + c <= m; ++coluna) {
                    if (!(resultadoEsperado[linha][coluna] == pinturaInicial[linha][coluna])) {
                        conta += 1;
                        for (int linhaBloco = 0; linhaBloco < r; ++linhaBloco) {
                            for (int colunaBloco = 0; colunaBloco < c; ++colunaBloco) {
                                pinturaInicial[linha + linhaBloco][coluna + colunaBloco] = inverte(pinturaInicial[linha
                                        + linhaBloco][coluna + colunaBloco]);
                            }
                        }
                    }
                }
            }
 
            System.out.println(possivel(n, m, resultadoEsperado,
                    pinturaInicial) ? conta : -1);
 
        }
 
    }
 
    private static boolean possivel(int n, int m, char[][] resultadoEsperado,
            char[][] pinturaInicial) {
         
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if(!(resultadoEsperado[i][j] == pinturaInicial[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
 
    private static char inverte(char c) {
        return c == '1' ? '0' : '1';
    }
 
}