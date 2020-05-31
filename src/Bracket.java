import java.util.*;
import java.io.*;
class Bracket{
    static int check(String str){
        int top=0;
        for(int i=0;i<str.length();i++){
            if(top<0)
                return 0;
            else if(str.charAt(i)=='(')
                top++;
            else
                top--;
        }
        if(top==0)
            return(str.length());
        else
            return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=0;
        for(int i=0;i<str.length();i++)
            for(int j=i+1;j<=str.length();j++){
                int len1= check(str.substring(i,j));
                if(len<len1)
                    len=len1;
            }
        System.out.println(str.length()-len);
    }
}