class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       // Step 2: Reverse each row
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        
    }
}
/*
Key Takeaways

Pattern: Rotate 90° clockwise in-place using two steps:

Transpose → swap matrix[i][j] with matrix[j][i].

Reverse each row → flips columns for the final rotated matrix.

Time Complexity: O(n²) → iterate through all elements twice.

Space Complexity: O(1) → no extra matrix used.

Logic:

Transpose converts rows to columns.

Reversing each row achieves clockwise rotation.

Edge Cases:

1x1 matrix → rotation does nothing.

Non-square matrices are not considered in this problem (LC #48 assumes square).

Pattern Recognition:

Similar in-place matrix rotation patterns appear in matrix manipulation / image processing problems.

You can also rotate anticlockwise by reversing columns instead of rows.
*/
