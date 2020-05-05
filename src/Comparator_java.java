import java.util.*;
import java.io.*;
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        } else {
            return b.score - a.score;
        }
    }
}
class Player{
    String name;
    int score;
    Player(String name,int score){
        this.name=name;
        this.score=score;
    }
}
public class Comparator_java {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Player player[]=new Player[n];
        Checker checker=new Checker();
        for(int i=0;i<n;i++){
            player[i]=new Player(sc.next(),sc.nextInt());
        }
        Arrays.sort(player,checker);
        for(int i=0;i<player.length;i++){
            System.out.printf("%s %s \n",player[i].name, player[i].score);
        }
    }
}
