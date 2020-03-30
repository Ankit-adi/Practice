import java.util.*;
import java.io.*;
public class this_Student{
    int roll;
    String name,course;
    float fee;
    this_Student(int roll,String name,String course){
        this.roll=roll;
        this.name=name;
        this.course=course;
    }
    this_Student(int roll,String name,String course,float fee){
        this(roll,name,course);
        this.fee=fee;
    }
    void display(){
        System.out.println(roll+" "+name+" "+course+" "+fee);
    }
}
class Student1{
    public static void main(String args[]){
        this_Student s1=new this_Student(101,"Ankit","ECE");
        this_Student s2=new this_Student(102,"Arnav","CSE",350000);
        s1.display();
        s2.display();
    }
}
