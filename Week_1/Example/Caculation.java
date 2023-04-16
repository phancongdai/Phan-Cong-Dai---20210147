package OOP_lab.Week_1;
import java.util.Scanner;
import java.lang.Math;
public class Caculation {
    public static void main(String[] arg)
    
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the first number(Num1): ");
        String strNum1 = keyboard.nextLine();
        double num1 = Double.parseDouble(strNum1);
        System.out.println("Input the second number(Num2): ");
        String strNum2 = keyboard.nextLine();
        double num2 = Double.parseDouble(strNum2);
        System.out.println("Sum:" + (double)(num2+num1));
        double  dif = num1-num2;
        System.out.println("Difference:" + (double)(Math.abs(dif)));
        System.out.println("Product:" + (double)(num1*num2));
        if(num1 == 0 && num2 == 0) System.out.println("Division Num1/Num2 and Num2/Num1 do not exist");
        if(num1 == 0 && num2 != 0) System.out.println("Division Num1/Num2 = 0 and Division Num2/Num1 does not exist");
        if(num1 != 0 && num2 == 0) System.out.println("Division Num1/Num2 does not exist Division Num2/Num1 = 0");
        if(num1 != 0 && num2 != 0) System.out.println("Quotient: Num1/Num2 = " + (double)(num1/num2) + " and " + "Num2/Num1 = " + (double)(num2/num1));
        keyboard.close();
    }
    
}
