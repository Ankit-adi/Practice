import java.io.*;
import java.util.*;
public class Except_itself {
        public static int[] productExceptSelf(int[] nums) {
            int l=nums.length;
            int k;
            int[] output = new int[l];
            for(int i=0;i<nums.length;i++){
                k=1;
                for(int j=0;j<nums.length;j++){
                    if(i!=j){
                        k*=nums[j];
                        output[i]=k;
                    }
                }
            }
            return output;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            int nums[]=new int[k];
            for(int i=0;i<k;i++){
                nums[i]=sc.nextInt();
            }
             System.out.println(productExceptSelf(nums));
    }
}
