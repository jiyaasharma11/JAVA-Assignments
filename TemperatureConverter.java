import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        double c=tc.nextDouble();

        double f=c*9.0/5.0+32.0;

        System.out.println(c+" Celsius= "+f+" Fahrenheit");

        tc.close();
    }
}
    
