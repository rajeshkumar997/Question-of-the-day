class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
    int maxArea = 0;
    int l = 0, r = len - 1;
    while (l < r) {
        int minHeight = Math.min(A[l], A[r]);
        maxArea = Math.max(maxArea, minHeight * (r - l));
        if (A[l] < A[r]) {
            l++;
        } else {
            r--;
        }
    }

    return maxArea;
        
    }
    
}
