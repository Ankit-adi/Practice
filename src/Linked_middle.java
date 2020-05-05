import java.util.*;
import java.io.*;
public class Linked_middle {
    public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int size=sc.nextInt();
                LinkedList<Integer> list=new LinkedList<>();
                for(int i=0;i<size;i++){
                    list.add(sc.nextInt());
                }
                int res,k;
                if(size%2==0){
                    res=size/2;
                    k=list.get(res);
                    System.out.println(k);
                }
                else {
                    res = size / 2;
                    k = list.get(res);
                    System.out.println(k);
                }
            }
        }

