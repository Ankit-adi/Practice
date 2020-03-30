import java.util.*;
public class sticks{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,small,count=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        small=a[0];
        for(int i=0;i<n;){
            System.out.println(n-i);
            i++;
        while(a[i]==small){
            i++;
        }
            small=a[i];
        }
}
}