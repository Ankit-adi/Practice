import java.util.*;
    public class anagram {
        static boolean isAnagram(String a, String b) {
            char str1[]=a.toCharArray();
            char str2[]=b.toCharArray();
             if(str1.length!=str2.length) {
                return false;
            }
            Arrays.sort(str1);
            Arrays.sort(str2);

                for (int i = 0; i < str1.length; i++) {
                    if (str1[i] != str2[i]) {
                        return false;
                    }
                }
                return true;

        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            boolean ret = isAnagram(a,b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }
