import java.util.*;
import java.io.*;
public class Count_ways {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = 0;
        int sum1;
        for (int i = 1; i <=sum/2+1; i++) {
            int k = i + 1;
            sum1=i+k;
            if(sum1==sum){
                count++;
            }
            while(sum1!=sum && sum1<=sum) {
                k = k + 1;
                sum1 = sum1 + k;
                if (sum1 == sum) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}

