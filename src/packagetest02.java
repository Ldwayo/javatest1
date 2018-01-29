public class packagetest02 {
    int n,W;
    int[] w;
    int[] v;
    int dp[][];
    public packagetest02(int n,int W,int[] w,int[] v){
        this.n = n;
        this.W = W;
        this.w = w;
        this.v = v;
        dp = new int[n+1][W+1];
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<W+1;j++){
                dp[i][j] = -1;
            }
        }
    }
    private void solve(){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=W;j++){
                if(j<w[i]){
                    dp[i+1][j] = dp[i][j];
                }
                else {
                    dp[i+1][j] = new max(dp[i][j],dp[i+1][j-w[i]]+v[i]).max();
                }
            }
        }
        //new showAarray(dp,v).show();
        System.out.println(dp[n][W]+1);
    }
    public static void main(String args[]){
        int[] w = {3,4,2};
        int[] v = {4,5,3};
        new packagetest02(3,7,w,v).solve();
    }
}
