import java.io.*;
import java.util.*;
class Address{
    String city,country,state;
    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

public class Aggregation {
    int id;
    String name;
    Address add;
    Aggregation(int id,String name,Address add){
        this.id=id;
        this.name=name;
        this.add=add;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(add.city+" "+add.state+" "+add.country);
    }
    public static void main(String args[]){
        Address add1=new Address("Patna","Bihar","India");
        Address add2=new Address("New Jersey","New York","USA");
        Aggregation emp1=new Aggregation(1705144,"Ankit",add1);
        Aggregation emp2=new Aggregation(1705145,"Shaurya",add2);
        emp1.display();
        emp2.display();
    }
}
