import java.util.*;
import java.io.*;
public class factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int m=sc.nextInt();
        int count=0;
        for(int i=1;i<=m/2;i++){
            if(m%i==0){
                list.add(i);
            }
        }
        System.out.println(list);
        int a[]=new int [list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        /*for(int i=1;i<i-1;i++) {
            int n = a[i];
            for (int j = 2; j <=n; j++) {
                if (n % j == 0){
                    int k = a[i + 1];
                    for (int l = 2; l <=k; l++) {
                        if (k % l == 0) {
                            count++;
                        }
                    }
                }
            }*/
        }
    }