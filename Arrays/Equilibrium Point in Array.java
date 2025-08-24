class Solution{
    public static int equilibriumPoint(long arr[],int n){
        long totalSum=0; 
        for (int i=0;i<n; i++) totalSum+=arr[i]; // Sum of all elements
        long leftSum=0; // Sum of elements to the left
        long rightSum=totalSum; // Sum of elements to the right

        for (int i=0; i<n; i++){
            rightSum-=arr[i]; // Current element removed from rightSum

            if (leftSum==rightSum) return i+1; // 1-based index equilibrium

            leftSum+=arr[i]; // Add current element to leftSum
        }
        return -1; // No equilibrium point
    }
}
/*
Key Points:

Pattern: Prefix-sum / running-sum technique

Time Complexity: O(n) → single pass

Space Complexity: O(1) → no extra arrays

Logic: At equilibrium point: sum(left) == sum(right)

Edge Cases:

No equilibrium → return -1

Single element → equilibrium exists at index 1

Pattern Recognition:

Both problems use sum tricks.

Common in array sum / missing number / equilibrium / prefix-sum problems.
*/
