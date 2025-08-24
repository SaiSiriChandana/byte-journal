class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxPro=0;  // stores the max profit so far
        int minPrice=Integer.MAX_VALUE; // stores the min price seen so far
        for(int i=0;i<n;i++){
            // Update the minimum price up to current day
            minPrice=Math.min(minPrice, prices[i]);
            // Calculate profit if selling today, update maxPro if better
            maxPro=Math.max(maxPro,prices[i]-minPrice);
        }
        return maxPro; // maximum profit achievable
    }
}
/* Key Takeaways

Pattern: Single pass + running min → optimal solution for “buy/sell once” problems.

Time Complexity: O(n) → only one loop.

Space Complexity: O(1) → no extra array needed.

Logic:

Track the minimum price seen so far (potential buy day).

Track maximum profit by comparing current price with that min price (potential sell day).

Edge Cases:

Prices are strictly decreasing → maxProfit = 0.

Prices length = 0 or 1 → maxProfit = 0.

Extra note:

This is a classic “running min / max trick”. You’ll see similar patterns in:

Maximum difference in array

Stock variants with transaction limits
*/
