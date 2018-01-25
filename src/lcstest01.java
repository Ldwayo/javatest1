public class lcstest01 {
    int n,m;
    char[] s;
    char[] t;
    int[][] dp;
    public lcstest01(int n,int m,char[] s,char[] t){
        this.n = n;
        this.m = m;
        this.s = s;
        this.t = t;
        dp = new int[n+1][m+1];
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<m+1;j++){
                dp[i][j] = 0;
            }
        }
    }
    private void solve(){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(s[i] == t[j])
                    dp[i+1][j+1] = dp[i][j]+1;
                else {
                    dp[i+1][j+1]= new max(dp[i][j+1],dp[i+1][j]).max();
                }
            }
        }
        System.out.println(dp[n][m]);
    }
    public static void main(String args[]){
        char[] s = {'a','b','c','d'};
        char[] t = {'b','e','c','d'};
        new lcstest01(4,4,s,t).solve();
    }
}
