public class recursion {
    //Decreasing order 
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1 );
    }

    //increasing order 
    public static void inc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        inc(n - 1);
        System.out.print(n + " ");
    }

    //factorial 
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int f = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    //sum on n natural numbers
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int s = calcSum(n - 1);
        int sn = n + s;
        return sn;
    }

    //fibonaccii series
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        int fi = f1 + f2;
        return fi;
    }

    //check if array is sorted or not 
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    //first occurence 
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return  -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
    
    //last occurence
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return  -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    //print x^n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    //optimized power fun:
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }


    public static void main (String args[]) {
        int n = 5;
        printDec(n);
        inc(n);
        System.out.println(fact(n));
        System.out.println(calcSum(n)); 
        System.out.println(fib(23)); 
        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(isSorted(arr, 0));
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, 0));
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}