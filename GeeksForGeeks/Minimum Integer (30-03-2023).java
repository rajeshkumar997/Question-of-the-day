class Solution {
    public static long sum(int[] arr){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static int minimumInteger(int n, int[] A) {
        if(n==1) return A[0];
        
        long totalSum = sum(A);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(totalSum <= (long) n*A[i]){
                min = Math.min(min, A[i]);
            }
        }
        return min;
    }
}
