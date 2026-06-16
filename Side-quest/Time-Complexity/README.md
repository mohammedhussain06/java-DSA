# This is a special repository for time and space complexity

 Time Complexity: It shows the amount of time an algorithm or a code takes to execute a code. It does not tells the exact time, it merely shows a relationship as time 
(T) => f(n)

 Space Complexity: It measures the space occupied by the code in the memory
 It checks input + auxiliary spaces --> (mostly talked)
 The memory/space is divided as ---> Heap
                                ---> Stack 
 ## Types of time complexity: 
  1. Big Omega Notation: Best time complexity 
  2. Big Theta Notation: Average time complexity 
  3. Big O Notation: Worst time complexity 

  We measure the worst case time complexity 

## Some common time complexities: 
 1. O(1): Constant time 
 2. O(log n): Uses divide and conquer strategy 
 3. O(n): Uses sequential and linear traversal techniques
 4. O(n^2): Worse time complexity than O(n) 
 5. O(2^n): Output in recursive algorithms and it is the worse 

 ## Time complexity analysis: 
 1. Simple loop analysis:
 -> Time Complexity: O(n)
 -> Space Complexity: O(1)

 2. Nested loop analysis: 
 e.g. 1: for (int i =0; i < n; i++){
            for (int j = 1; j < i + 1; j++){
                //Constant kaam 
        }
     }
 -> Time Complexity: O(n^2)
 -> Space Complexity: O(1)

 e.g. 2: for (int i =0; i < n; i++){
            for (int j = 0; j < i; j++){
                //Constant kaam
            }
        }
-> Time complexity: O(n^2)

e.g. 3: //for k < n
        for (int i = 0; i < n; i = i + k){
            for (int j = 0; j <= k; j++){
                //Constant kaam 
            }
        }
-> Time Complexity: O(n)

3. Bubble Sort Complexity:
Logic: for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                //Swap logic 
            }
        }
-> Time Complexity: O(n^2)

4. Binary Search: 
Logic: while (start <= end) {
    mid = (start + end) / 2
    if (key == mid) {
        return mid
    } if (key < mid) {
        mid - 1
    } else {
        mid + 1
    }
}
-> Time Complexity: O(log n)

5. Recursion problems: 
e. g. 1: Factorial 
Logic: n * fact (n - 1)
-> Time Complexity: O(n)

e. g. 2: Sum of N numbers: 
Logic: n + sum(n - 1)
-> Time Complexity: O(n)

e. g. 3: Fibonaccii series
Logic: fib(n - 1) + fib(n - 2)
-> Time Complexity: O(2^n)

e. g. 4: Merge Sort
-> Time Complexity: O(n log n)

