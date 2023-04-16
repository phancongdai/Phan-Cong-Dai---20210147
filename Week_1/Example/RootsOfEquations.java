package OOP_lab.Week_1;
import java.util.Scanner;
import java.lang.Math;
public class RootsOfEquations {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("The list:\n1.The first-degree equation (linear equation) with one variable\n2.The system of first-degree equations (linear system) with two variables\n3.The second-degree equation with one variable\n");
        int option;
        do{
        System.out.println("Input your option: ");
        option = keyboard.nextInt();
        switch(option)
        {
            case 1: System.out.println("1.The first-degree equation (linear equation) with one variable (a*x + b = 0)\n");//
                    //System.out.println("ax+b=0");
                    System.out.println("Input a"); double a = keyboard.nextDouble();
                    System.out.println("Input b"); double b = keyboard.nextDouble();
                    double x = 0;
                    if(a==0 && b==0)
                    {
                        System.out.println("The equation has infinite solution\n");
                    }
                    else {
                        if (a==0 && b!=0){
                            System.out.println("The equation has no solution\n"); 
                        }
                        x=-b/a;
                        if (a!= 0 && b==0)
                        {
                            System.out.println("The equation has an unique x = " + x);
                        }
                        if (a!=0 && b!=0)
                        {
                            System.out.println("The equation has an unique solution x = " + x);
                            System.out.println();
                        }
                    }
                    break;
            case 2: System.out.println("2.The system of first-degree equations (linear system) with two variables (a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2)");
                    System.out.println("Input a11"); double a11 = keyboard.nextDouble();
                    System.out.println("Input a12"); double a12 = keyboard.nextDouble();
                    System.out.println("Input b1") ; double b1 = keyboard.nextDouble();
                    System.out.println("Input a21"); double a21 = keyboard.nextDouble();
                    System.out.println("Input a22"); double a22 = keyboard.nextDouble();
                    System.out.println("Input b2") ; double b2 = keyboard.nextDouble();
                    double D = a11*a22 - a12*a21;
                    double Dx = b1*a22 - b2*a12;
                    double Dy = a11 *b2 - a21*b1;
                    if (D == 0 && Dx == 0 && Dy == 0){
                        System.out.println("The equations have infinite solutions\n");
                    }
                    else if (D == 0 && (Dx != 0 || Dy != 0)){
                        System.out.println("The equations have no solution\n");
                    }
                    else if (D!=0 && Dx!=0 && Dy!=0){
                        System.out.println("The equations have one solution: x1 = " + (double)(Dx/D) + " and x2 = " + (double)(Dy/D));
                        System.out.println();
                    }
                    break;
            case 3: System.out.println("3.The second-degree equation with one variable (a*x^2 + b*x +c = 0)");
                    System.out.println("Input a"); double A = keyboard.nextDouble();
                    System.out.println("Input b"); double B = keyboard.nextDouble();
                    System.out.println("Input c"); double c = keyboard.nextDouble();
                    double D0 = 0;
                    if(A==0)
                    {
                        if(B==0)
                        {
                            if(c==0)
                            {
                                System.out.println("The equation has infinite solutions\n");
                            }
                            else System.out.println("The equation has no solution\n");
                        } else
                        {
                            if(c==0)
                            {
                                System.out.println("The equation has one soluton x = 0");
                            }
                            else System.out.println("The equation has one soluton x = " + (double)(-c/B));

                        }    
                    }
                    else 
                    {
                         D0 = B*B - 4*A*c;
                         if(D0<0)
                         {
                            System.out.println("The equation has no solution\n");
                         } else 
                         {
                            if(D0==0){ 
                            System.out.println("The equation has an unique solution x = " + (double)(-B/(2*A)));
                            }
                            else System.out.println("The equation has two solution x1 = " +(double)((-B+Math.sqrt(D0))/(2*A)) +  " and x2 = " + (double)((-B-Math.sqrt(D0))/(2*A)));

                         }

                    }
                    break;
        }
    }while(option<=3) ; 
    keyboard.close();
    }
    
}
