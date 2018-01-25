public class pakagetest01 {
    int n,W;
    int[] w;
    int[] v;
    int dp[][];
    private pakagetest01(int n,int W,int[] w,int[] v){
        this.n = n;
        this.W = W;
        this.w = w;
        this.v = v;
        dp = new int[n+1][W+1];
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<W+1;j++){
                dp[i][j] = 0;
            }
        }
    }
    private int rec(int i,int j){
        int res;
        if(dp[i][j]>=0){
            return dp[i][j];
        }
        if(i == n){
            res = 0;
        }
        else if(j<w[i]){
            res =rec(i+1,j);
        }
        else {
            int a=rec(i+1,j);
            int b=rec(i+1,j-w[i])+v[i];
            if(a>b){
                res = a;
            }
            else
                res = b;
        }
        dp[i][j] = res;
        return res;
    }
    private void solve(){
        System.out.println(rec(0,W));
    }
    private void solve_memory(){
        for(int i = n-1;i>=0;i--){
            for (int j = 0;j<=W;j++){
                if(j<w[i])
                    dp[i][j] = dp[i+1][j];
                else {
                    int a=dp[i+1][j];
                    int b=dp[i+1][j-w[i]]+v[i];
                    if(a>b){
                        dp[i][j] = a;
                    }
                    else
                        dp[i][j] = b;
                }
            }
        }
        System.out.println(dp[0][W]);
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<W+1;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[] w = {2,1,3,2};
        int[] v = {3,2,4,2};
        new pakagetest01(4,5,w,v).solve_memory();
    }
}
