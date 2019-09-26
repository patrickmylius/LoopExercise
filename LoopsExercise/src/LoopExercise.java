import java.util.Scanner;

public class LoopExercise {

    public static void main(String[] args) {

       int i = 10; // Sets i = 10
       while (i < 100) { // Sets loop till print aslong as i is less than 100.
           i = i + 5; // prints i = 10 till 100- with 5 + interval each print.
            System.out.println("Programming loops" + i);
        }

       Scanner input = new Scanner(System.in);
       String message;
       message = "";
       while (!message.equals("stop spamming me")) { // Keeps returning input message x 2 until (stop spamming me) is written in console
           message = input.nextLine(); // Allows console input
            System.out.println(message + message + " HOW TO SPAM, tutorial");
        }

       do { // Prints (Something else than just spam, when while condition is false / ended).
           System.out.println("Something else than just spam");

       } while (false);

    }
}
