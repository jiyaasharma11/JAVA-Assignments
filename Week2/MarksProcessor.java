import java.util.Scanner;

public class MarksProcessor {

    static boolean isValidMark(int mark) {
        return mark>=0 && mark<=100;
    }

    static void printResults(int count, int sum, int highest, int passes, int fails) {
        if (count==0) {
            System.out.println("No valid marks entered.");
            return;
        }
        double average = (double) sum / count;
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Passes: " + passes);
        System.out.println("Failures: " + fails);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0, sum=0, highest=Integer.MIN_VALUE;
        int passes=0, fails=0;

        System.out.print("Enter mark (-1 to stop): ");
        int marks=sc.nextInt();

        while (marks!=-1) {
            if (isValidMark(marks)) {
                count++;
                sum += marks;
                if (marks>highest) {
                    highest=marks;
                }
                if (marks>=50){
                    passes++;
                } else {
                    fails++;
                }
            } else {
                System.out.println("Invalid mark rejected: " + marks);
            }
            System.out.print("Enter marks(-1 to stop): ");
            marks=sc.nextInt();
        }
        printResults(count, sum, highest, passes, fails);
    }
}