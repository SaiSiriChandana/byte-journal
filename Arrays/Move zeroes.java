//Solution 1: Two-pass approach (fill non-zero, then zeros)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroPos = 0;  // position to place next non-zero

        // Step 1: Move all non-zero elements to the front
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[nonZeroPos] = nums[i];
                nonZeroPos++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        for(int i = nonZeroPos; i < n; i++){
            nums[i] = 0;
        }
    }
}

/* Key Points:

Pattern: Two-pass → first move non-zeros, then fill zeros.

Time Complexity: O(n)

Space Complexity: O(1) → in-place

Logic: Maintain a pointer (nonZeroPos) to insert non-zero elements sequentially. */

//Solution 2: One-pass approach (swap with first zero)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1; // pointer to first zero

        // Find first zero
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        // No zeros → nothing to do
        if(j == -1) return;

        // Swap non-zeros with zeros
        for(int i = j + 1; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; // move zero pointer forward
            }
        }
    }
}

/*Key Points:

Pattern: One-pass → swap non-zero with first zero found.

Time Complexity: O(n)

Space Complexity: O(1) → in-place

Logic: Maintain a zero pointer (j) and swap whenever a non-zero is found.

Edge Cases:

No zeros → do nothing.

All zeros → do nothing.

Extra Notes / Pattern Recognition:

These are classic two-pointer / in-place rearrangement problems.

Useful for array partitioning problems, e.g., moving all negatives to front, segregating 0s/1s/2s, etc.
  */
