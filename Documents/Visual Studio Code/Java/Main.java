import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of rows
        int n = sc.nextInt();
        // Read the number of columns (which is always 2 as per the problem description)
        int m = 2;

        // Read the grid values
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // dp[i][j] will store the maximum sum starting from cell (i, j)
        int[][] dp = new int[n][m];

        // Initialize the last row with its own values as there are no more rows to move to
        for (int j = 0; j < m; j++) {
            dp[n - 1][j] = a[n - 1][j];
        }

        // Fill the dp table from bottom to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                int currentValue = a[i][j];
                dp[i][j] = currentValue;

                // Check possible moves to the next row
                for (int k = 0; k < m; k++) {
                    if (a[i + 1][k] > currentValue) {
                        dp[i][j] = Math.max(dp[i][j], currentValue + dp[i + 1][k]);
                    }
                }

                // Take modulo
                dp[i][j] %= MOD;
            }
        }

        // Find the maximum sum starting from the first row
        int result = Math.max(dp[0][0], dp[0][1]);
        
        // Print the result
        System.out.println(result);
    }
}
