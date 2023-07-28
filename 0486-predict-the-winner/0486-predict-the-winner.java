class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        for(int i = 1; i <= n; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int[][] dp = new int[n][n];

        for(int L = 1; L <= n; L++){
            for(int st = 0; st < n - L + 1; st++){
                int en = st + L - 1;

                if(L <= 2){
                    dp[st][en] = Math.max(nums[st], nums[en]);
                }

                else{
                    dp[st][en] = prefixSum[en + 1] - prefixSum[st] - Math.min(dp[st + 1][en], dp[st][en - 1]);
                }

            }

        }

        int p1Score = dp[0][n - 1];
        int p2Score = prefixSum[n] - p1Score;

        return p1Score >= p2Score;


    }
}