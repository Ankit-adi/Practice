import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equalize_array {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr, int n) {
        int max = 0;
        int max1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            max1 = count;
            if (max1 > max) {
                max = max1;
            }
        }
        int result = n - max;
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = equalizeArray(a, n);
        System.out.println(result);
    }
}
