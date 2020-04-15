import java.util.*;
import java.io.*;
public class min_parenthesis {
    public static int check(String exp){
        int top=0;
        for(int i=0;i<exp.length();i++){
            if(top<0)
                return 0;
            else if(exp.charAt(i)=='('){
                top++;
            }
            else
                top--;
        }
        if(top==0)
            return exp.length();
        else
            return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        int len=0;
        for(int i=0;i<exp.length();i++){
            for(int j=i+1;j<=exp.length();j++){
                int len1=check(exp.substring(i,j));
                if(len<len1)
                    len=len1;
            }
        }
        System.out.println(len);
    }
}
