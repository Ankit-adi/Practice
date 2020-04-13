import java.util.*;
class BackspaceString {
    public static boolean backspaceCompare(String S,String T) {
        int s=S.length();
        int t=T.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s;i++){
            if(S.charAt(i)!='#')
                stack.push(S.charAt(i));
            else if(!stack.isEmpty())
                stack.pop();
        }
        String ans="";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        String answer="";
        for(int j=ans.length()-1;j>=0;j--){
            answer+=ans.charAt(j);
        }
        String k=answer;
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<t;i++){
            if(T.charAt(i)!='#')
                stack2.push(T.charAt(i));
            else if(!stack2.isEmpty())
                stack2.pop();
        }
        String ans2="";
        while(!stack2.isEmpty()){
            ans2+=stack2.pop();
        }
        String answer2="";
        for(int j=ans2.length()-1;j>=0;j--){
            answer2+=ans2.charAt(j);
        }
        String k2=answer2;
        if(k.equals(k2)){
            return true;
        }
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=sc.next();
        boolean result=backspaceCompare(S,T);
        System.out.println(result);
          }
}