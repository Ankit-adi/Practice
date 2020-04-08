import java.util.*;
import java.lang.Math;
public class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int visited = -1;
        int count = 0;
        int l = sc.nextInt();
        int a[] = new int[l];
        int fr[] = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            count = 1;
            for (int j = i + 1; j < l; j++) {
                if (a[i] == a[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        for (int i = 0; i < l; i++) {
            if(fr[i]!=visited)
            System.out.println(a[i] + "|" + " " + fr[i]);
        }

    }
}
