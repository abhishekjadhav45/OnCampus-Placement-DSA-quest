// LeetCode CC2  // 
class Solution {
    public int change(int amount, int[] coins) {

        int[] dp = new int[amount + 1];

        // base case 

        dp[0] = 1;  // 0 coins wwe can use 0 to make it 

        // for each coins 

        for(int coin : coins){

            for(int i=coin ; i<= amount ; i++) {

                dp[i] = dp[i] + dp[i-coin]; // i-1 means the total ways to complete the amount was i-1 supp amt = 5 , 1 = 5 c = 1 than i-c = 4 how amy ways to compete 4

            }
        }
        return dp[amount];
    }
}
