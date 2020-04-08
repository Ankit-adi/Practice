package mypack;
import pack.*;
public class B {
    static void msg(){
        System.out.println("Welcome to B");
    }
    public static void main(String args[]){
        A obj=new A();
        B obj2=new B();
        obj.msg();
        obj2.msg();
    }
}
