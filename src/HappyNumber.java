import java.util.*;
class HappyNumber {
    public static int add(int k){
        int rem;
        int sum=0;
        while(k!=0){
            rem=k%10;
            sum+=rem*rem;
            k=k/10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        int res=add(n);
        int s=res;
        int t=10;
        while(s!=1 && t!=0) {
            s = add(s);
            t--;
        }
            if(s==1)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=isHappy(n);
        System.out.println(result);
    }
}