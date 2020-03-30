import java.util.*;
import java.io.*;
class inheritance1 {
    static int salary=40000;
}
class programmer extends inheritance1{
    static int bonus=10;
    public static void main(String args[]){
        programmer p=new programmer();
        System.out.println("Bonus is"+bonus);
        System.out.println("Salary is"+p.salary);
    }
}
