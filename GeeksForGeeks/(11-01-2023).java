class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        if (N == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int minIncrement = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i] <= arr[i - 1]) {
                minIncrement += arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }
        return minIncrement;
    }
}
