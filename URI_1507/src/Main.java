import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String lido0 = br.readLine();
        StringTokenizer parser0 = new StringTokenizer(lido0);
        int max = Integer.parseInt(parser0.nextToken());
 
        for (int w = 1; w <= max; w++) {
            String palavra = br.readLine();
            lido0 = br.readLine();
            parser0 = new StringTokenizer(lido0);
            int max2 = Integer.parseInt(parser0.nextToken());
 
            for (int j = 1; j <= max2; j++) {
                System.out.println(isSubstring(br.readLine(), palavra) ? "Yes"
                        : "No");
            }
        }
 
    }
 
    private static boolean isSubstring(String nextLine, String palavra) {
        int index = 0;
        for(int i=0;i<palavra.length();i++){
            if(nextLine.charAt(index)==palavra.charAt(i)){
                index++;
            }
            if(index==nextLine.length()){
                return true;
            }
        }
        return false;
    }
}