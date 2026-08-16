import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int a, int b) {
        a=Math.abs(a);
        b= Math.abs(b);

        while (b != 0) {
            int remainder = a%b;
            a=b;
            b =remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner gcd = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = gcd.nextInt();
        System.out.print("Enter second number: ");
        int b = gcd.nextInt();

        System.out.println("GCD is: " + gcd(a, b));

    }
}