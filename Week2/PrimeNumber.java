import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num) {
        if (num<2) {
            return false;
        }
        for (int i=2; i< num;i++) {
            if (num% i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner prime= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no=prime.nextInt();

        if (isPrime(no)) {
            System.out.println(no+ " is Prime");
        } else {
            System.out.println(no+ " is not Prime");
        }
    }
}