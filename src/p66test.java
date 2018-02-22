public class p66test {
    int n;
    int m;
    int M;
    int[][] dp;
    public p66test(int n,int m,int M){
        this.M = M;
        this.m = m;
        this.n = n;
        dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[i][j] = 0;
            }
        }
    }
    private void solve(){
        dp[0][0] = 1;
        for (int i = 1; i <= m ; i++) {
            for (int j = 0; j <= n; j++) {
                if(j-i>=0){
                    dp[i][j] = (dp[i-1][j]+dp[i][j-i])%M;
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[m][n]);
    }

    public static void main(String[] args) {
        new p66test(5,3,10000).solve();
    }
}
