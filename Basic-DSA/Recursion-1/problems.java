public class problems {
    //tiling problem 
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    //remove duplicates:
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    //pairing friends:
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    //binary strings:
    public static void binaryString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendsPairing(3));
        binaryString(3, 0, "");
    }
}
