class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ans[] stores the indices of the two numbers
        int ans[]=new int[2];
        ans[0]=ans[1]=-1; // initialize with -1 (in case no solution exists)
        // HashMap to store value -> index mapping
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int moreneeded=target-num; // the number we still need to get 'target'
            // If the needed number already exists in the map, we found a solution
            if(mpp.containsKey(moreneeded)){
                ans[0]=mpp.get(moreneeded); // index of the previous number
                ans[1]=i; // index of the current number
                return ans;
            }
            // Store the current number with its index
            mpp.put(nums[i],i);
        }
        return ans; // problem guarantees solution, but fallback for safety
    }
}

/* Key Takeaways

Why HashMap? → It allows O(1) lookup for the "needed" number, making the solution O(n).

Naive way → A nested loop would take O(n²).

Edge cases:

Array with duplicates (e.g., [3,3] with target 6).

Negative numbers (works fine).

Pattern learned: Use HashMap to remember previously seen numbers when searching for pairs.
*/
