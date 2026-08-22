public class BitMaskUtility {

    static boolean isBitSet(int number,int position) {
        return (number&(1<<position))!=0;
    }

    static int setBit(int number,int position) {
        return number|(1<<position);
    }

    static int clearBit(int number,int position) {
        return number&~(1<<position);
    }

    static int toggleBit(int number,int position) {
        return number^(1<<position);
    }

    static String toBinary32(int number) {
        String result="";

        for(int i=31;i>=0;i--) {
            if((number&(1<<i))!=0)
                result+="1";
            else
                result+="0";
        }

        return result;
    }
}