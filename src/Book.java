import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Book {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int res=0;
        if(n%2!=0){
            if(p>n/2){
                res=(n-p)/2;}
            if(p<=n/2){
                if(p%2==0){
                    res=p/2;}
                else
                    res=(p-1)/2;
            }
        }
        else{
            if(p<=n/2){
                res=p/2;
            }
            else{
                if(p%2==0){
                    res=(n-p)/2;
                }
                else
                    res=((n-p)/2)+1;
            }
        }
        System.out.println(res);
    }
}
