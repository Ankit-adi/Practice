import java.math.BigInteger;
import java.util.*;
public class factorial {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            BigInteger f=new BigInteger("1");
            for(int i=2;i<=n;i++){
                f=f.multiply(BigInteger.valueOf(i));
            }
            System.out.println(f);
        }
    }


