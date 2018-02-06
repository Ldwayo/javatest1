import java.util.Arrays;

public class p64test_2 {
    int n;
    int[] a;
    int[] dp;
    final int INF = 10000;
    public p64test_2(int n,int[] a){
        this.a = a;
        this.n = n;
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = INF;
        }
    }
    private void solve(){
        for (int i = 0; i < n; i++) {
            dp[(-Arrays.binarySearch(dp,a[i]))-1] = a[i];
        }

        //System.out.println(Arrays.binarySearch(dp,INF));    //problem1
        for (int i = 0; i < n; i++) {
            if (dp[i] == INF){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] a = new randomArray().randomArray(1,2000,1000);
        //int[] a = {4,2,3,1,5,7};
        new p64test_2(a.length,a).solve();
        long startTime1 = System.currentTimeMillis();
        System.out.println("cost:"+(startTime1-startTime));
    }
}
