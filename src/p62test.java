public class p62test {
    int n;
    int K;
    int[] a;
    int[] m;
    boolean[][] dp;
    public p62test(int K,int[] a,int[] m){
        this.a = a;
        this.m = m;
        this.K = K;
        this.n = a.length;
        dp = new boolean[n+1][K+1];
    }
    public void solve(){
        dp[0][0] = true;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=K;j++){
                for(int k = 0;k<=m[i]&&k*a[i]<=j;k++){
                    dp[i+1][j] |= dp[i][j-k*a[i]];
                }
            }
        }
        if(dp[n][K])
            System.out.println("yes");
        else System.out.println("no");
    }

    public static void main(String[] args) {
        int[] a = {3,5,8};
        int[] m = {3,2,2};
        int K = 17;
        new p62test(K,a,m).solve();
    }
}
