package OOP_lab.Week_1;
import java.util.Scanner;
public class DrawingTriangle {
    public static void main(String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = keyboard.nextInt();
        for(int i = 1; i <= number; i++)
        {
            for(int j=1;j<=number-i;j++)
            {   
                System.out.print(" ");
            }
            for(int j =1; j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        keyboard.close();
    }
    
}
