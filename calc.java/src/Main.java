import java.util.Scanner;

public class Main {
    public static void main(String[] args)



    {
        System.out.println("Addition: ");
        System.out.println("Enter number 1");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        System.out.println("Enter number 2");
        double num2 = sc.nextInt();
        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        {
            System.out.println("Multiplication: ");
            System.out.println("Enter number 1");
            double num3 = sc.nextInt();
            System.out.println("Enter number 2");
            double num4 = sc.nextInt();
            double multiply = num3 * num4;
            System.out.println("The multiplication is: " + multiply);
            {
                System.out.println("Division: ");
                System.out.println("Enter number 1");
                double num5 = sc.nextInt();
                System.out.println("Enter number 2");
                double num6 = sc.nextInt();
                double division = num5 / num6;
                System.out.println("The division is: " + division);
                {
                    System.out.println("Subtraction: ");
                    System.out.println("Enter number 1");
                    double num7 = sc.nextInt();
                    System.out.println("Enter number 2");
                    double num8 = sc.nextInt();
                     double subtraction = num7 - num8;
                     System.out.println("The subtraction is: " + subtraction);
                    {
                        System.out.println("Percentage: ");
                        System.out.println("Enter number 1");
                        double num9 = sc.nextInt();
                        System.out.println("Enter number 2");
                        double num10 = sc.nextInt();
                        double percentage = (num9 / num10)*100;
                        System.out.println("The percentage is: " + percentage + "%");



                    }
                }
            }

        }
    }
}