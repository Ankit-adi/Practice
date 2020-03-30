import java.io.*;
import java.util.*;
public class balanced_parenthesis {
    public static boolean isbalanced(String input){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                stack.push('(');
            }
            else if(input.charAt(i)=='{'){
                stack.push('{');
            }
            else if(input.charAt(i)==')'){
                if (stack.isEmpty()) return false;
                if(stack.pop()!='(') return false;
            }
            else if(input.charAt(i)=='}'){
                if (stack.isEmpty()) return false;
                if(stack.pop()!='{') return false;
            }
            else if(input.charAt(i)=='['){
                stack.push('[');
            }
            else if(input.charAt(i)==']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0) {
            String input = sc.next();
            boolean result = isbalanced(input);
            System.out.println(result);
            n--;
        }
    }
}
