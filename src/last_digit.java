import java.io.*;
import java.util.*;

public class last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, r;
        int count = 0;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r = a[i];
            while (r > 0) {
                if ((r % 10 != 0) && (a[i] % (r % 10) == 0)) {
                    count++;
                }
                r = r / 10;
            }
            System.out.println(count);
            count = 0;
        }
    }
}



