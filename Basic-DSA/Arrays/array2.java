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

    //trapping rainwater
    public static int trappedWater(int height[]) {
        int n = height.length;
        //left max array 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        //right max array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //logic for waterlevel 
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            //Formula for calculating water
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    //Buy and sell stocks
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int number[] = {1, -2, 6, -1, 3};
        //maxSubArray(number);
        //maxSubArrayPrefix(number);
        // int height[]= {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trappedWater(height));
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}
