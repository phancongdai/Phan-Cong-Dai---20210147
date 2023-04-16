package OOP_lab.Week_1;
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[]arg)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();
        System.out.println("Mr/Mrs. " +strName + ", " + iAge + " years old. "+ "Your height is " + dHeight + " meters.");

        keyboard.close();
    }

    
}
