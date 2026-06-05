public class test {
    public static boolean duplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return  false;
    }

    public static int searchNumber(int num[], int key) {
    int start = 0, end = num.length - 1; 
    while (start <= end) {
        int mid = (start + end) / 2;
        if (num[mid] == key) {
            return mid;
        }
        if (num[start] <= num[mid]) {
            if (key >= num[start] && key < num[mid]) {
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        } 
        else {
            if (key > num[mid] && key <= num[end]) {
                start = mid + 1; 
            } else {
                end = mid - 1;  
            }
        }
    }
    return -1; 
}
    
    public static void main(String[] args) {
        // int nums[] = {1, 2, 3, 1};
        // int num[] = {1, 2, 3, 4};
        // System.out.println(duplicate(nums));
        // System.out.println(duplicate(num));

        int num[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 1; 
        System.out.println(searchNumber(num, key));
    }
}