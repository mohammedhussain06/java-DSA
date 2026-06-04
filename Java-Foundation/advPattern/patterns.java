
public class patterns {

    // public static void hollow(int totRow, int totCol) {
    //     for (int i = 1; i <= totRow; i++) {
    //         for (int j = 1; j <= totCol; j++) {
    //             if (i == 1 || i == totRow || j == 1 || j == totCol) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <= i; k++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted(int n) {
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <= i; k++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void invertedNumber(int n) {
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <= i; k++) {
    //             System.out.print(k + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void Floyd(int n) {
    //     int count = 1;
    //     for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    //     System.out.print(" ");
    // }
    //for (int k = 1; k <= i; k++) {
    //int count = 1;    prints 1, 11, 111... 
    //             System.out.print(count + " ");
    //             count++; 
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void zero_one(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             if((i + j) % 2 == 0) {
    //                 System.out.print("1 ");
    //             } else {
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();   
    //     }
    // }

    // public static void butterfly(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         for (int k = 1; k <= 2 * (n - i); k++) {
    //             System.out.print(" ");
    //         }
    //         for (int l = 1; l <= i; l++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         for (int k = 1; k <= 2 * (n - i); k++) {
    //             System.out.print(" ");
    //         }
    //         for (int l = 1; l <= i; l++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void solidRhombus(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <= n; k++) {
    //             System.out.print("*");      
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollowRhombus(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <= n; k++) {
    //             if (i == 1 || i == n || k == 1 || k == n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }     
    //         }
    //         System.out.println();
    //     }
    // }

    public static void diamond(int n) {
        for (int i = 1; i <+ n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollow(4, 5);
        // inverted(5);
        //inverted(5);
        //invertedNumber(5);
        //Floyd(5);
        //zero_one(5);
        //butterfly(5);
        //solidRhombus(5);
        //hollowRhombus(5);
        diamond(5);
    }
}
