import java.util.*;
public class append {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s, t;
        int k;
        s = sc.next();
        t = sc.next();
        k = sc.nextInt();
        int count = 0;
        int len = Math.abs(s.length() - t.length());
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            }
        }
        if (s.length() + t.length() - 2 * count > k) {
            System.out.println("No");
        } else if ((s.length() + t.length() - 2 * count) % 2 == k % 2) {
            System.out.println("Yes");
        }
        if (s.length() + t.length() - k < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

