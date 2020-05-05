import java.util.*;
public class dhruv {
    public static int highestPowerof2(int n) {
        int p = (int) (Math.log(n) /
                        Math.log(2));
        return p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n, res, k;
        int a[] = new int[m];
        int b[] = new int[m];
        for (int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            n = a[i];
            res = highestPowerof2(n);
            k= (int) (n-Math.pow(2,res));
            b[i]=res+k;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(b[i]);
        }

    }
}
