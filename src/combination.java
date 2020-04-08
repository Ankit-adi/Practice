import java.util.*;
import java.io.*;
import static java.lang.Math.sqrt;

public class combination {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long count=0;
        int k,l;
        float x;
         for(int i=1;i<=num;i++) {
             k = i + 1;
                 while (k < num) {
                     if (i + k == num) {
                         count++;
                     } else {
                         for (l = k + 1; l < num; l++) {
                             if (i + k + l == num) {
                                 count++;
                                 break;
                             }
                         }
                     }
                     k++;
                 }
             }
       for (int i = 2; i <sqrt(2*num); i++) {
          x= (float) ((float)num/i-i/2.0+1.0/2);
          if(x==(int)x)
              count++;
          }

        System.out.println(count);
    }
}
