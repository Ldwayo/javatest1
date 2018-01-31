public class packagetest03 {
    int n,W;
    int[] w,v;
    int[][] dp;
    final int INF = 1000;
    public packagetest03(int n,int W,int[] w,int[] v,int max_v){
        this.n = n;
        this.dp = dp;
        this.W = W;
        this.w =w;
        this.v = v;
        dp = new int[n+1][n*max_v+1];
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<n*max_v+1;j++){
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;
    }
    private void solve(){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<dp[0].length;j++){
                if(j<v[i]){
                    dp[i+1][j] = dp[i][j];
                }
                else {
                    dp[i+1][j] = new max(dp[i][j],dp[i][j-v[i]]+w[i]).min();
                }
            }
        }
        int res = 0;
        for(int i = 0;i<dp[0].length;i++)
            if(dp[n][i]<=W)
                res = i;
        System.out.println(res);
        //new showAarray(dp,null).show();
    }

    public static void main(String[] args) {
        int[] w = {2,1,3,2};
        int[] v = {3,2,4,2};
        new packagetest03(4,5,w,v,4).solve();
    }
}
