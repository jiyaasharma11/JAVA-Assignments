import java.util.Scanner;

public class DigitExtraction{
    public static void main(String[] args) {
        Scanner de=new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num=de.nextInt();

        int hundreds=num/100;
        int tens=(num/10)%10;
        int units=num%10;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Units: " + units);

        de.close();
    }
}