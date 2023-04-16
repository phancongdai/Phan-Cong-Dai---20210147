package OOP_lab.Week_1;
import java.util.Scanner;
public class SortArray {
    public static void main(String arg[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the size of array: ");
        int size = keyboard.nextInt();
        System.out.println("Input the elements of array:"); 
        double arr[] = new double[size];
        for(int i = 0; i<size; i++)
        {
            arr[i]= keyboard.nextDouble();
            //keyboard.nextLine();
            //System.out.println(arr[i]);
        }
        keyboard.close();
        for(int i = 0; i<size-1; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(arr[i]>arr[j])
                {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sort the array:");
        double sum = 0;
        for(int i = 0; i<size; i++)
        {
            System.out.print(arr[i]+"\t");
            sum += arr[i]; 
        }
        System.out.println("\nSum: " + sum);
        double average = sum/arr.length;
        System.out.println("Average: "+ average );


    }
    
}
