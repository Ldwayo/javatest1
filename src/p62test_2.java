public class p62test_2 {
    int n;
    int K;
    int[] a;
    int[] m;
    int[] dp;
    public p62test_2(int K,int[] a,int[] m){
        this.a = a;
        this.m = m;
        this.K = K;
        this.n = a.length;
        dp = new int[K+1];
        for(int i = 0;i<K+1;i++){
            dp[i] = -1;
        }
        dp[0] = 0;
    }
    private void solve(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= K; j++) {
                if(dp[j]>=0){
                    dp[j] = m[i];
                }
                else if (j<a[i]||dp[j-a[i]]<=0){
                    dp[j] = -1;
                }
                else {
                    dp[j] = dp[j-a[i]]-1;
                }
            }
        }
        if (dp[K]>=0){
            System.out.println("yes");
        }
        else System.out.println("no");
    }

    public static void main(String[] args) {
        int[] a = {3,5,8};
        int[] m = {3,2,2};
        int K = 17;
        new p62test_2(K,a,m).solve();
    }
}
