public class Q1at {
    // The main method to calculate the minimum cost
    public int minCost(int[][] costs) {
        // Check if the input array 'costs' is null or empty
        if (costs == null || costs.length == 0)
            return 0;

        // Get the number of houses (rows) and colors (columns)
        int n = costs.length;
        int k = costs[0].length;

        // Create a 2D array 'dp' to store intermediate results
        int[][] dp = new int[n][k];

        // Initialize the first row of 'dp' with the costs of painting the first house
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];
        }

        // Fill in the 'dp' array for the remaining houses
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                // Initialize the cost for the current house and color to be the maximum possible value
                dp[i][j] = Integer.MAX_VALUE;

                // Iterate over the colors of the previous house and find the minimum cost
                for (int l = 0; l < k; l++) {
                    // Skip the case where the current color is the same as the previous house
                    if (j == l)
                        continue;
                    
                    // Update the minimum cost for the current house and color
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][l] + costs[i][j]);
                }
            }
        }

        // Find the minimum cost among the possible color choices for the last house
        int resultMinCost = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            resultMinCost = Math.min(resultMinCost, dp[n - 1][j]);
        }

        // Return the overall minimum cost
        return resultMinCost;
    }

    // Main method to test the 'minCost' function
    public static void main(String[] args) {
        // Create an instance of Q1a
        Q1at resultCost = new Q1at();

        // Example input: cost matrix for painting each house with different colors
        int[][] costs = { { 1, 3, 2 }, { 4, 6, 8 }, { 3, 1, 5 } };

        // Calculate and print the minimum cost
        System.out.println("Minimum cost: " + resultCost.minCost(costs));
    }
}