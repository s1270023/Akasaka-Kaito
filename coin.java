import java.util.Scanner;
import java.util.Random;

public class coin{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Who are you?");
    String string = scanner.next();
    System.out.println("Hello," + string + "!");

    String[] sides = {"Heads", "Tails"};
    Random r = new Random();
    int heads = 0;
    int tailes= 0;

    System.out.println("Tossing the dice...");
    for(int i = 0; i < 3; i++){
        int num = r.nextInt(2);
        String side = sides[num];
        int a = i+1;
        System.out.println("Round " + a + ":" + side);
        if(num == 1) tailes++;
        else heads++;
    }
    System.out.println("Heads: " + heads + "," + "Tails: " + tailes );

    if(heads > tailes){
      System.out.println(string + " won!");
    }else{
      System.out.println(string + " lost!");
    }

  }
}
