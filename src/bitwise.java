import java.util.*;
class bitwise {
    public static int rangeBitwiseAnd(int m, int n) {
        int y=m;
        for(int i=m+1;i<=n;i++){
            y=y&i;
        }
        return y;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int res=rangeBitwiseAnd(m,n);
        System.out.println(res);
    }
}
