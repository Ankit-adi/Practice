import java.util.*;
import java.io.*;
public class valid_parenthesis {
        public static boolean checkValidString(String s) {
            int left=0,right=0,star=0;
            int top=0;
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s.length();i++) {
                if (s.charAt(i) == '(') {
                    stack.push('(');
                    right++;
                } else if (s.charAt(i) == ')') {
                    if (stack.isEmpty() == false)
                        stack.pop();
                    if (stack.isEmpty())
                        left++;
                } else if (s.charAt(i) == '*') {
                    star++;
                }
            }
            if(stack.isEmpty()==true){
                return true;
            }
            if(stack.isEmpty()==false)
            {
                if(right==star || left==star)
                    return true;
            }
            return false;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String k=sc.nextLine();
            boolean result=checkValidString(k);
            System.out.println(result);
        }
}

