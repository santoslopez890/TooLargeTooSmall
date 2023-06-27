/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Random rd = new Random();
        int num=101;
        int rand=(rd.nextInt(100));
        Scanner in= new Scanner(System.in);

               while(num != rand){

                   System.out.println("select your number 1-100");
                   num = in.nextInt();
                   if(num<rand){
                       System.out.println("too small");
                   }
                   else if (num>rand){
                       System.out.println("too big");
                   }

               }
        System.out.println("Correct the number was "+rand);

    }
}
