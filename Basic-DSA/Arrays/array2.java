public class array2 {
    //Max sub array sum 
    public static void maxSubArray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                currSum = 0; 
                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max of sub array sum: " + maxSum);
    }

    //max sub array sum alt method
    public static void maxSubArrayPrefix(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; 
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max of sub array sum: " + maxSum);
    }

    public static void kadane(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max of sub array sum: " + ms);
    }
    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        //maxSubArray(number);
        maxSubArrayPrefix(number);
    }
}
