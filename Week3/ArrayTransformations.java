public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        if (values==null || values.length==0)
            return;

        int left=0;
        int right=values.length - 1;

        while (left<right) {
            int temp=values[left];
            values[left]=values[right];
            values[right]=temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        if (values==null)
            return new int[0];

        int[] result=new int[values.length];

        for (int i=0; i<values.length; i++) {
            result[i]=values[values.length - 1 - i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {
        if (values==null || values.length==0)
            return 0;

        int count=0;

        for (int i=0; i<values.length; i++) {
            if (values[i]!=target) {
                values[count]= values[i];
                count++;
            }
        }

        return count;
    }

    static int[] runningSum(int[] values) {
        if (values==null || values.length==0)
            return new int[0];

        int[] result = new int[values.length];
        result[0]=values[0];

        for (int i=1; i<values.length; i++) {
            result[i]=result[i - 1] + values[i];
        }

        return result;
    }
}