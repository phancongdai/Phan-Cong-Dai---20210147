package OOP_lab.Week_1;
import java.util.Scanner;
public class CheckValidDay {
   
    public static void main(String[]arg)
    {
        //
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the year:");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Input the month:");
        String month = keyboard.nextLine();
      
        int check_year;
        int imonth = 0;
        if(year % 4 == 0||(year % 100 == 0 && year % 400 != 0))
        {
            check_year = 1;

        }
        else check_year = 0;
        
        String full[] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String abbreviation[] = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String letter[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String number[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        for(int i = 0; i<=11; i++)
        {
            if(month.equals(full[i])||month.equals(abbreviation[i])||month.equals(letter[i])||month.equals(number[i]))
            {
                imonth = i+1;
                break;
             
            }
            
        }
        switch(imonth)
        {
            case 1,3,5,7,8,10,12: System.out.println("The number of days is: 31"); 
                break;
            case 4,6,9,11: System.out.println("The number of days is: 30"); 
                break;
            case 2: if(check_year==1)
            {
                System.out.println("The number of days is: 29");
            }   else 
                {
                    System.out.println("The number of days is: 28");  
                }

        }
        keyboard.close();
    }
}
