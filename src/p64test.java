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
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] a = new randomArray().randomArray(1,2000,1000);
        new p64test(1000,a).solve();
        long startTime1 = System.currentTimeMillis();
        System.out.println("cost:"+(startTime1-startTime));
    }
}
