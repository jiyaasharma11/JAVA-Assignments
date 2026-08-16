import java.util.Scanner;

public class MenuDrivenCalculator {

    static Scanner calc= new Scanner(System.in);

    static void printMenu() {
        System.out.println("Enter 1-- Add\n2-- Subtract\n3-- Multiply\n4-- Divide\n0-- Exit\n");
    }
    static double calculate(int choice, int a, int b) {
        double result=0;
        switch (choice) {
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                if (b==0) {
                    System.out.println("Division not possible");
                }
                result = (double) a/b;
                break;
            default:
                System.out.println("Option invalid !");
        }
        return result;
    }

    public static void main(String[] args) {
        int choice, a,b;

        do {
            printMenu();
            choice = calc.nextInt();

            if (choice != 0) {
                System.out.println("Enter the 1st number:");
                a = calc.nextInt();
                System.out.println("Enter the 2nd number:");
                b = calc.nextInt();

                double result = calculate(choice,a,b);

                if (choice >= 1 && choice <= 4) {
                    System.out.println("Result is: " + result);
                }
            } else {
                System.out.println("Exit ! ");
            }

        } while (choice != 0);
    }
}