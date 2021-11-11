package com.programcreek.leetcode;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		
		int coins[] = {1,2,3};
		int amount = 8;
		int vaal = coinChange(coins,amount);
		System.out.println(vaal);
	}

	private static int coinChange(int[] coins, int amount) {
		int dp[] = new int[amount + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		 
		
		for(int i =1;i<=amount;i++) {
			 for(int j=0;j<coins.length;j++) {
				 if(coins[j] <= i) {
					 dp[i] = Math.min(dp[i], 1 + dp[i-coins[j]]);
				 }
			 }
		}
		return dp[amount];
	}

	
}
