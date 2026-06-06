
public class program {
    public static void evenOdd(int n) {
        int bitMask = 1;
        if( (n & bitMask) == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }

    public static int getithBit(int n, int i) {
        int bitMask = 1 << i;
        if( (n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateithBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearithBit(n, i);
        // } else {
        //     return setithBit(n, i);
        // }

        n = clearithBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        evenOdd(2);
        evenOdd(1);
        evenOdd(6);
        System.out.println(getithBit(10, 2));
        System.out.println(setithBit(10, 2));
        System.out.println(setithBit(10, 1));
        System.out.println(updateithBit(10, 2, 1));
        System.out.println(clearLastBit(15, 2));
    }
}
