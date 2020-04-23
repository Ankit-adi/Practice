import java.util.*;
public class Codechef1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 42) {
                k = i;
            }
        }
            for (int i = 0; i < k; i++) {
                System.out.println(a[i]);
            }
        }
    }