import java.util.Scanner;

public class LoopPatterns {

    // Pattern A:
    static void patternA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern B:
    static void patternB(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern C:
    static void patternC(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern D:
    static void patternD(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern E:
    static void patternE(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        if (size < 1) {
            System.out.println("Invalid size. Must be 1 or greater.");
            return;
        }

        System.out.println("Pattern A:");
        patternA(size);

        System.out.println("Pattern B:");
        patternB(size);

        System.out.println("Pattern C:");
        patternC(size);

        System.out.println("Pattern D:");
        patternD(size);

        System.out.println("Pattern E:");
        patternE(size);
    }
} 
