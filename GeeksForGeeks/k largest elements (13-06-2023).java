class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int ans[] = new int[k];
        Arrays.sort(arr);
        int t = 0;
        int i=arr.length-1;
        while(k-->0){
            ans[t] = arr[i];
            t++;
            i--;
        }
        return ans;
    }
}
