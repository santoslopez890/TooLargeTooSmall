/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Random rd = new Random();
        int num=101;
        int oldGuess=0;
        int counter=0;
        int rand=(rd.nextInt(100));
        Scanner in= new Scanner(System.in);
        System.out.println("select your number 1-100");
               while(num != rand) {


                   num = in.nextInt();

                   if (oldGuess == num) {
                    System.out.println("printed same num");
                       continue;
                   } else if (num < rand) {
                       System.out.println("too small");
                   } else if (num > rand) {
                       System.out.println("too big");
                   }
                   oldGuess = num;
                   counter++;



               }
        System.out.println("Correct the number was "+rand+" it took you "+counter+" guesses");

    }
}
