class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0) matrix[0][j]=0;
                    else col0=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0|matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        
    }
}
/*
Key Takeaways

Pattern: Use first row & first column as markers to save space → O(1) extra space solution.

Time Complexity: O(n*m) → two passes over the matrix.

Space Complexity: O(1) → no extra matrix used.

Logic:

First pass → mark rows & columns that need to be zeroed.

Second pass → set all non-first row/column elements to 0 using markers.

Finally → handle first row & first column separately.

Edge Cases:

First cell matrix[0][0] may overlap row and column marker → use col0 flag to distinguish.

Pattern Recognition:

Similar in-place marking tricks are useful in matrix manipulation problems.

Avoids extra O(n*m) space that a naive solution with extra matrix would need.
*/
