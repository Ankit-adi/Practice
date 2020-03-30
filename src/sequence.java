import java.util.*;
public class sequence {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int m,q,y;
            m=sc.nextInt();
            int n;
            int a[]=new int[m+1];
            for(int i=1;i<=m;i++){
                q=sc.nextInt();
                a[q]=i;
            }
            for(int i=1;i<=m;i++){
                y=a[a[i]];
                System.out.println(y);
            }
        }
    }
