class Solution {
    int findK(int A[][], int n, int m, int k) {
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int count = 0;

        while (count < k) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k)
                    return A[top][i];
            }
            top++;

            // Traverse rightmost column
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k)
                    return A[i][right];
            }
            right--;

            // Traverse bottom row
            for (int i = right; i >= left; i--) {
                count++;
                if (count == k)
                    return A[bottom][i];
            }
            bottom--;

            // Traverse leftmost column
            for (int i = bottom; i >= top; i--) {
                count++;
                if (count == k)
                    return A[i][left];
            }
            left++;
        }

        return -1; // kth element not found
    }
}
