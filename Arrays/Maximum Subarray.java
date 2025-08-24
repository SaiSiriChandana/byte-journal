class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE; // Stores maximum subarray sum so far
        int sum=0; // Running sum of current subarray
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; // Add current element to running sum
            // Update max if current sum is greater
            if(sum>max){
                max=sum;
            }
             // If running sum becomes negative, reset it to 0
            if(sum<0){
                sum=0;
            }
        }
        return max; // Maximum sum of contiguous subarray
    }
}
/*
Key Takeaways

Pattern: Kadane’s Algorithm → optimal O(n) solution for maximum sum contiguous subarray.

Time Complexity: O(n) → single pass through the array.

Space Complexity: O(1) → no extra array used.

Logic:

Keep a running sum of the current subarray.

If the running sum goes negative, it cannot contribute to a maximum subarray → reset to 0.

Track max sum seen so far.

Edge Cases:

Array contains all negative numbers → max = maximum single element.

Array contains all positive numbers → max = sum of entire array.

Pattern Recognition:

This is a classic sliding window / running sum trick.

You’ll see this in max/min subarray, max difference, and stock problems.
*/
