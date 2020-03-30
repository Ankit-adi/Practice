
import java.io.*;
import java.util.Stack;

public class Stack1 {
    static void stack_push(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }
    static void stack_pop(Stack<Integer> stack){
        System.out.println("POP:");
        for(int i=0;i<5;i++){
            int y=(Integer)stack.pop();
            System.out.println(y);
        }
    }
    static void stack_peek(Stack<Integer> stack){
        int top=(Integer)stack.peek();
        System.out.println("Element at top is:" +top);
    }
    static void stack_search(Stack<Integer> stack,int element){
        int pos=(Integer)stack.search(element);
        if(pos==-1){
            System.out.println("Not Found");
        }
        else
            System.out.println("Element is found at "+pos);
    }
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack,2);
    }
}
