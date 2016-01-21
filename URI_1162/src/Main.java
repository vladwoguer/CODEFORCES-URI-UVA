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

		lido = br.readLine();
		StringTokenizer st1 = new StringTokenizer(lido);
		int n = Integer.parseInt(st1.nextToken());

		for (int i = 1; i <= n; i++) {
			lido = br.readLine();
			StringTokenizer st2 = new StringTokenizer(lido);
			int p = Integer.parseInt(st2.nextToken());

			int[] vagoes = new int[p];

			lido = br.readLine();
			StringTokenizer st3 = new StringTokenizer(lido);

			for (int w = 0; w < p; w++) {
				vagoes[w] = Integer.parseInt(st3.nextToken());
			}
			int cont = 0;
			for (int u = 0; u < p - 1; u++) {
				for (int z = 0; z < p - 1; z++) {
					int k = z + 1;
					if (vagoes[z] > vagoes[k]) {
						int aux = vagoes[z];
						vagoes[z] = vagoes[k];
						vagoes[k] = aux;
						cont++;
					}
				}
			}
			System.out.println("Optimal train swapping takes " + cont
					+ " swaps.");
		}

	}
}