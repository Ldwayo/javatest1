public class p68test {
    int M = 10000;
    int n;
    int m;
    int[] a;
    int[][] dp;                          //dp[i+1][j] = sum(min(j,ai),k=0) dp[i][j-k]
    public p68test(int n,int m,int[] a){ //dp[i+1][j] = dp[i+1][j-1]+dp[i][j]-dp[i][j-1-ai]
        this.a = a;
        this.m = m;
        this.n = n;
        dp = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
    }
    private void solve(){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                if(j-1-a[i]>=0)
                    dp[i+1][j] = (dp[i+1][j-1]+dp[i][j]-dp[i][j-1-a[i]]+M)%M;
                else dp[i+1][j] = (dp[i+1][j-1]+dp[i][j])%M;
            }
        }
        System.out.println(dp[n][m]);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        new p68test(3,3,a).solve();
    }
}
