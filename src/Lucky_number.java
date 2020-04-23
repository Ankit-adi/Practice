import java.util.*;
import java.io.*;
public class Lucky_number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;;i++)
        {
            int a=4*i;
            int c=0;
            for(int j=1;j<=i+1;j++){
                if(j!=1)
                    a=a+3;
                if(a==n){
                    for(int k=1;k<=i;k++){
                        if(k>=i-(j-2))
                            System.out.print("7");
                        else
                            System.out.print("4");}
                        return;
                }
                else if(a>n)
                    c++;

            }
            if(c==i+1){
                System.out.print("-1");
                return;
            }
        }
    }
}

