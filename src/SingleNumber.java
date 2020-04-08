import java.util.*;
class SingleNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int fr[]=new int[n];
        int visited=-1;
        int count;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        for (int i = 0; i <n; i++) {
            if(fr[i]!=visited){
                if(fr[i]==1)
                    System.out.println(arr[i]);
            }
        }
    }
}