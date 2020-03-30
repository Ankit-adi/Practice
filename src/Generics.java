import java.io.*;
public class Generics {
    public static <E> void printArray(E[] elements){
        for(E element:elements) {
            System.out.println(element);
        }
    }
    public static void main(String args[]){
        Integer intArray[]={1,2,3};
        Character charArray[]={'A','N','K','I','T'};
        printArray(intArray);
        printArray(charArray);
    }
}
