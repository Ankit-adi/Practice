import java.util.*;
import java.io.*;
public class pythogoras_triplet {
    public static boolean is_triplet(int a[] ){
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            if(Math.pow(a[i],2)+Math.pow(a[i+1],2)==Math.pow(a[i+2],2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[k];
        for(int i=0;i<k;i++){
            a[i]=sc.nextInt();
        }
        boolean ret = is_triplet(a);
        System.out.println( (ret) ? "Yes" : "No" );
    }
}
