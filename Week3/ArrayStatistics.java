

public class ArrayStatistics{

    static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    static double average(int[] values) {
        if (values.length == 0) {
            return 0;
        }
        return (double) sum(values) / values.length;
    }

    static int minimum(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    static int maximum(int[] values) {
        int max = values[0];

        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    static int countEven(int[] values) {
        int count = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static void printSignCounts(int[] values) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int value : values) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }

}