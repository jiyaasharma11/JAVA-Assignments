import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner si=new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p=si.nextDouble();

        System.out.print("Enter annual rate (%): ");
        double r=si.nextDouble();

        System.out.print("Enter time (years): ");
        double t=si.nextDouble();

        double SI= p*r*t/100;
        double finalamt= p+ SI;

        System.out.println("Simple Interest: "+SI);
        System.out.println("Final Amount: "+finalamt);

        si.close();
    }
}