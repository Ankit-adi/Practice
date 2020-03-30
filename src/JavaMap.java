import java.util.*;
public class JavaMap {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Amit",102);
        map.put("Raj",103);
        map.put("Shyam",105);
        map.put("Ram",106);
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
