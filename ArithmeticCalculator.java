import java.util.Scanner;

public class ArithmeticCalculator{
    public static void main(String[] args){
        Scanner ac=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=ac.nextInt();

        System.out.print("Enter second number: ");
        int b=ac.nextInt();

        int sum=a+b;
        int difference=a-b;
        int product=a*b;
        int quotient=a/b;
        int remainder=a%b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        ac.close();
    }
}