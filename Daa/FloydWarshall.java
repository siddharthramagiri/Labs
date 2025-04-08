import java.util.Scanner;

public class FloydWarshall {
    static final int INF = 999; // Represents infinity
    // Method to find the minimum of two numbers

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Floyd-Warshall Algorithm
    static void floyds(int[][] p, int n) {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j) {
                        p[i][j] = 0;
                    } else {
                        p[i][j] = min(p[i][j], p[i][k] + p[k][j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, e;
        System.out.print("Enter the number of vertices: ");
        n = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        e = sc.nextInt();
        int[][] p = new int[n + 1][n + 1]; // 1-based indexing
        // Initialize the matrix with INF
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                p[i][j] = (i == j) ? 0 : INF;
            }
        }
        // Input edges
        for (int i = 1; i <= e; i++) {
            System.out.print("Enter the end vertices of edge " + i + " with its weight (u v w): ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            p[u][v] = w;
        }
        // Display the input matrix
        System.out.println("\nMatrix of input data:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }
        // Apply Floyd-Warshall algorithm
        floyds(p, n);
        // Display transitive closure
        System.out.println("\nTransitive closure:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }
        // Display the shortest paths
        System.out.println("\nThe shortest paths are:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    System.out.println("<" + i + "," + j + "> = " + p[i][j]);
                }
            }
        }
        sc.close();
    }
}