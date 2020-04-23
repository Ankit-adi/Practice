import java.util.*;
public class Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        int k=0;
        int i=stones.length;
        while(i>1){
            Arrays.sort(stones);
            if(stones[i-1]>stones[i-2]){
                stones[i-1]=stones[i-1]-stones[i-2];
                i=i-1;
            }
            else {
                i=i-2;
            }
        }
        if(i==0)
            return k;
        else
            k=stones[0];
            return k;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=lastStoneWeight(a);
        System.out.println(k);
    }
}
