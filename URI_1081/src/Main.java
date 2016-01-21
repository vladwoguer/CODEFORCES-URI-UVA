import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    static boolean[] percorrido;
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        int vezes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < vezes; i++) {
            System.out.println("Caso " + (i + 1) + ":");
            String[] lido = scanner.nextLine().split(" ");
            int vertices = Integer.parseInt(lido[0]);
            int arestas = Integer.parseInt(lido[1]);
            ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
 
            for (int v = 0; v < vertices; v++) {
                adjLists.add(new ArrayList<Integer>());
            }
 
            percorrido = new boolean[vertices];
 
            for (int k = 0; k < arestas; k++) {
                String[] lido1 = scanner.nextLine().split(" ");
                int v1 = Integer.parseInt(lido1[0]);
                int v2 = Integer.parseInt(lido1[1]);
                adjLists.get(v1).add(v2);
            }
 
            for (int w = 0; w < vertices; w++) {
                Collections.sort(adjLists.get(w));
            }
             
            for (int w = 0; w < vertices; w++) {
                if (!percorrido[w] && !adjLists.get(w).isEmpty()) {
                    dfs(adjLists, w);
                    System.out.println();
                }
            }
        }
    }
 
    private static void dfs_rec(String inicio,
            ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v) {
        visited[v] = true;
        percorrido[v] = true;
        for (int w : adjLists.get(v)) {
            if (!visited[w]) {
                System.out
                        .println(inicio + v + "-" + w + " pathR(G," + w + ")");
                dfs_rec(inicio + "  ", adjLists, visited, w);
            } else {
                System.out.println(inicio+v+"-"+w);
            }
        }
    }
 
    public static void dfs(ArrayList<ArrayList<Integer>> adjLists, int s) {
        int n = adjLists.size();
        boolean[] visited = new boolean[n];
        dfs_rec("  ", adjLists, visited, s);
    }
 
}