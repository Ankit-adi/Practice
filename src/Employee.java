import java.util.*;
import java.io.*;
class Employee {
    int id,salary;
    String name;
    void insert(int i,String naam,int hafta){
        id=i;
        name=naam;
        salary=hafta;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee e1=new Employee();
        for(int i=0;i<n;i++) {
            System.out.println("Enter Id of Employee:");
            int id=sc.nextInt();
            System.out.println("Enter Name of Employee:");
            String name=sc.next();
            System.out.println("Enter Salary of Employee:");
            int salary=sc.nextInt();
            e1.insert(id, name, salary);
            e1.display();
        }
    }
}
