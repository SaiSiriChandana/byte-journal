class Solution {
    int missingNumber(int arr[]) {
        int n = arr.length + 1; // Numbers range from 1 to n
        long totalSum = (long) n * (n + 1) / 2; // Sum of first n natural numbers
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num; // Sum of elements in the array
        }
        return (int) (totalSum - actualSum); // Missing number = totalSum - actualSum
    }
}
/*
Key Points:

Pattern: Sum formula → 1 + 2 + ... + n = n*(n+1)/2

Time Complexity: O(n) → one pass over array

Space Complexity: O(1) → constant extra space

Logic: The difference between expected sum and actual sum gives the missing number.

Edge Cases:

Array contains only one element → return 1 or that element depending on missing number.

Use long to prevent integer overflow for large n.
*/
