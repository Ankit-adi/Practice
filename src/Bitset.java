import java.io.*;
import java.util.*;

public class Bitset {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        BitSet bs1=new BitSet(m);
        BitSet bs2=new BitSet(m);
        for(int i=0;i<n;i++){
            String op=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(op.equals("AND")||op.equals("OR")||op.equals("XOR")|| op.equals("SET")||op.equals("FLIP")){
                if(x==1){
                    switch(op){
                        case "AND":bs1.and(bs2);
                            break;
                        case "OR":bs1.or(bs2);
                            break;
                        case "XOR":bs1.xor(bs2);
                            break;
                        case "SET":bs1.set(y);
                            break;
                        case "FLIP":bs1.flip(y);
                            break;
                    }
                }
                else{
                    switch(op){
                        case "AND":bs2.and(bs1);
                            break;
                        case "OR":bs2.or(bs1);
                            break;
                        case "XOR":bs2.xor(bs1);
                            break;
                        case "SET":bs2.set(y);
                            break;
                        case "FLIP":bs2.flip(y);
                            break;
                    }
                }
            }
            System.out.println(bs1.cardinality()+" "+bs2.cardinality());
        }
    }
}
