import java.util.Random;
import java.util.Scanner;

public class HoT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Tossing a coin...");
        int h=0,t=0;

        Random rand = new Random();

        for(int i=1;i<4;i++){
        int j= rand.nextInt(2);

        if(j==0) {
        System.out.println("Round " + i + ": Heads");
        h++;

        }
        else{
        System.out.println("Round " + i + ": Tails");
        t++;
        }
        }

        System.out.println("Heads: "+h+", Tails: "+t);

        scanner.close();
        }
        }
