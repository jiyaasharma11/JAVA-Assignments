
public class LinearSearchToolkit {

    static boolean contains(int[] values, int target) {
        if (values==null || values.length==0)
            return false;

        for (int i=0; i<values.length; i++) {
            if (values[i]==target)
                return true;
        }

        return false;
    }

    static int firstIndexOf(int[] values, int target) {
        if (values==null || values.length==0)
            return -1;

        for (int i=0; i<values.length; i++) {
            if (values[i]==target)
                return i;
        }

        return -1;
    }

    static int lastIndexOf(int[] values, int target) {
        if (values==null || values.length==0)
            return -1;

        for (int i=values.length - 1; i>=0; i--) {
            if (values[i]==target)
                return i;
        }

        return -1;
    }

    static int countOccurrences(int[] values, int target) {
        if (values==null|| values.length==0)
            return 0;

        int count=0;

        for (int i=0; i<values.length; i++) {
            if (values[i]==target)
                count++;
        }

        return count;
    }
}