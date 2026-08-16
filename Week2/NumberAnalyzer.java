import java.util.Scanner;

public class NumberAnalyzer {

    static int readNumber(Scanner input) {
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    static boolean isEven(int num) {
        return num%2==0;
    }

    static boolean isPositive(int num){
        return num>0;
    }

    static int absoluteValue(int num){
        if (num<0){
            return -num;
        }
        return num;
    }

    static int countDigits(int num){
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    static int sumDigits(int num){
        int sum = 0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

    static void printReport(int num, boolean even, boolean positive, int digitCount, int digitSum) {
        System.out.println("Number: "+num);
        System.out.println("Even: "+even);
        System.out.println("Positive: "+positive);
        System.out.println("Digit Count: "+digitCount);
        System.out.println("Digit Sum: "+digitSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= readNumber(sc);
        boolean even = isEven(num);
        boolean positive = isPositive(num);
        int absValue = absoluteValue(num);
        int digitCount = countDigits(absValue);
        int digitSum = sumDigits(absValue);

        printReport(num, even, positive, digitCount, digitSum);

        sc.close();
    }
}