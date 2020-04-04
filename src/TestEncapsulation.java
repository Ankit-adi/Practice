import java.util.Scanner;

class Account{
    private long acct_no;
    private String name,email;
    private float salary;
    public long getAcct_no(){
        return acct_no;
    }
    public void setAcct_no(long acct_no){
        this.acct_no=acct_no;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public float getSalary(){
        return salary;
    }
    public void  setSalary(float salary){
        this.salary=salary;
    }
}

public class TestEncapsulation {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Account acc=new Account();
        acc.setAcct_no(979890689);
        acc.setEmail("ankitaditya02@gmai.com");
        acc.setName("Ankit Aditya");
        acc.setSalary(500000);
        System.out.println(acc.getName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getAcct_no());
        System.out.println(acc.getSalary());
    }
}
