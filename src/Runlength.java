import java.util.*;
import java.io.*;
public class Runlength {
    static void runlen(String str){
        HashMap<Character,Integer> count=new HashMap<Character,Integer>();
        char strarr[]=str.toCharArray();
        for(char c:strarr){
            if(count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }
            else
                count.put(c,1);
        }
        for (Map.Entry entry : count.entrySet()) {
            System.out.print(entry.getValue()+""+entry.getKey());
        }
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        runlen(word);

        }
}
