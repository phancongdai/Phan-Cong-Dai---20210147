package OOP_lab.Week_1;
import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int row = keyboard.nextInt();
        System.out.println("Input the number of colums: ");
        int colum = keyboard.nextInt();
        double[][] a = new double[row][colum];
        double[][] b = new double[row][colum];
        double[][] result = new double[row][colum];
        System.out.println("Input the elements of matrix A:");
        for(int i = 0; i< row ; i++)
        {
            for(int j = 0; j < colum;j++)
            {
                 a[i][j] = keyboard.nextDouble();
                
            }

        }
        System.out.println("Input the element of matrix B: ");
        for(int i = 0; i< row ; i++)
        {
            for(int j = 0; j < colum;j++)
            {
                 b[i][j] = keyboard.nextDouble();
                
            }

        }
        
        System.out.println("The sum of two matrices: ");
        for(int i = 0; i< row ; i++)
        {
            for(int j = 0; j < colum;j++)
            {
                 result[i][j] = a[i][j] + b[i][j]; 
                
            }

        }
        for(int i = 0; i< row ; i++)
        {
            for(int j = 0; j < colum;j++)
            {
                 System.out.print(result[i][j]+" "); 
            }
        System.out.println();

        }
        
        keyboard.close();

    }
    
}
