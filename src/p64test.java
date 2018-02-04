public class p64test {
    int n;
    int[] a;
    int[] dp;
    public final int INF = 1000;
    public p64test(int n,int[] a){
        this.a = a;
        this.n = n;
        dp = new int[n];
    }
    private void solve(){
        int res = 0;
        for (int i  = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(a[j]<a[i])
                dp[i]  = new max(dp[i],dp[j]+1).max();
            }
            res = new max(res,dp[i]).max();
        }
        System.out.println(res);
        new showAarray(null,dp).show();
    }

    public static void main(String[] args) {
        int[] a = {4,2,3,1,5};
        new p64test(5,a).solve();
    }
}
