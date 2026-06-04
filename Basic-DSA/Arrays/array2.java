public class array2 {
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
    public static void main(String[] args) {
         int number[] = {1, -2, 6, -1, 3};
        maxSubArray(number);
    }
}
