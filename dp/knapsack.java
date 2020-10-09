package dp;

public class knapsack {

	public static void main(String[] args) {
		
		int W = 10;
		int w[] = {1, 3, 4, 6};
		int v[] = {20, 30, 10, 50};
		
		System.out.println(maxProfit1(W, w, v, w.length));
	}
	
	
//	Using Recursion 
//	Time complexity = 2^n	
	static int maxProfit(int W, int w[], int v[], int n) {
//		W is Bag Capacity, Array w and v contains weight and value of item respectively
//		and n is number of items 
		
		if(W == 0 || n == 0) {
			return 0 ;
		}
		
		if(w[n-1] > W) {
			return maxProfit(W, w, v, n-1);
		}
		else {
			return Math.max((v[n-1] + maxProfit(W-w[n-1], w, v, n-1)), 
							maxProfit(W, w, v, n-1));
		}
	}

	
//	Using DP
//	Time complexity = n * W
	static int maxProfit1(int W, int w[], int v[], int n) {
		int dp[][] = new int [n+1][W+1] ;
		
		for(int i=0 ; i<=n ; i++) {
			for(int j=0 ; j<=W ; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0 ;
				} 
				else if(w[i-1] <= j) {
					dp[i][j] = Math.max(v[i-1] + dp[i - 1][j - w[i - 1]],
							   dp[i - 1][j]) ;
				} else {
					dp[i][j] = dp[i-1][j] ;
				}
				
			}
		}
//		To check what is in dp array
		
//		for(int i=0 ; i<=n ; i++) {
//			for(int j=0 ; j<=W ; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		return dp[n][W] ;
	}
}
