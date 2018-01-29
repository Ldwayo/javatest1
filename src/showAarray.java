public class showAarray {
    int[][] a;
    int[] b;
    public showAarray(int[][] a,int [] b){
        this.a = a;
        this.b = b;
    }
    public void show(){
        if(a!=null&&b==null){
            for(int i = 0;i<a.length;i++){
                for(int j = 0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
        else if(a==null&&b!=null){
            for(int i = 0;i<b.length;i++)
                System.out.print(b[i]);
            System.out.println();
        }
        else {
            System.out.println("a:");
            for(int i = 0;i<a.length;i++){
                for(int j = 0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("b:");
            for(int i = 0;i<b.length;i++)
                System.out.print(b[i]);
            System.out.println();
        }
    }
}
