import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // TASK 63 - ARRAY STATISTICS

        int[] values={1,2,3,4,-1};

        System.out.println("TASK 63");
        System.out.println("Sum: "+ArrayStatistics.sum(values));
        System.out.println("Average: "+ArrayStatistics.average(values));
        System.out.println("Minimum: "+ArrayStatistics.minimum(values));
        System.out.println("Maximum: "+ArrayStatistics.maximum(values));
        System.out.println("Even count: "+ArrayStatistics.countEven(values));
        System.out.println("Odd count: "+(values.length-ArrayStatistics.countEven(values)));
        ArrayStatistics.printSignCounts(values);


        // TASK 64 - LINEAR SEARCH

        int[] search={10,20,30,20,40};

        System.out.println("\nTASK 64");
        System.out.println("Contains: "+LinearSearchToolkit.contains(search,20));
        System.out.println("First index: "+LinearSearchToolkit.firstIndexOf(search,20));
        System.out.println("Last index: "+LinearSearchToolkit.lastIndexOf(search,20));
        System.out.println("Count: "+LinearSearchToolkit.countOccurrences(search,20));


        // TASK 65 - ARRAY TRANSFORMATIONS

        int[] numbers={1,2,3,4,5};

        System.out.println("\nTASK 65");

        ArrayTransformations.reverseInPlace(numbers);

        System.out.println("Reversed:");
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }

        int[] copy=ArrayTransformations.reversedCopy(numbers);

        System.out.println("\nReversed copy:");
        for(int i=0;i<copy.length;i++) {
            System.out.print(copy[i]+" ");
        }

        int[] remove={1,2,3,2,4};

        int length=ArrayTransformations.removeValue(remove,2);

        System.out.println("\nLogical length: "+length);

        int[] sums=ArrayTransformations.runningSum(numbers);

        System.out.println("Running sum:");
        for(int i=0;i<sums.length;i++) {
            System.out.print(sums[i]+" ");
        }


        // TASK 66 - MATRIX OPERATIONS

        int[][] matrix={
            {1,2,3},
            {4,5,6}
        };

        System.out.println("\n\nTASK 66");

        System.out.println("Matrix:");
        MatrixOperations.printMatrix(matrix);

        System.out.println("Row sums:");
        int[] rows=MatrixOperations.rowSums(matrix);

        for(int i=0;i<rows.length;i++) {
            System.out.print(rows[i]+" ");
        }

        System.out.println("\nColumn sums:");
        int[] columns=MatrixOperations.columnSums(matrix);

        for(int i=0;i<columns.length;i++) {
            System.out.print(columns[i]+" ");
        }

        System.out.println("\nTranspose:");
        MatrixOperations.printMatrix(MatrixOperations.transpose(matrix));


        // TASK 69 - BIT MASK

        Scanner sc=new Scanner(System.in);

        System.out.println("\nTASK 69");

        System.out.print("Enter number: ");
        int number=sc.nextInt();

        System.out.print("Enter bit position: ");
        int position=sc.nextInt();

        System.out.println("Binary: "+BitMaskUtility.toBinary32(number));
        System.out.println("Bit set: "+BitMaskUtility.isBitSet(number,position));
        System.out.println("Set bit: "+BitMaskUtility.setBit(number,position));
        System.out.println("Clear bit: "+BitMaskUtility.clearBit(number,position));
        System.out.println("Toggle bit: "+BitMaskUtility.toggleBit(number,position));

        sc.close();
    }
}