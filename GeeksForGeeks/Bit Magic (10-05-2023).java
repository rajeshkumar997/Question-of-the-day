class Solution {
    public static int bitMagic(int n, int[] arr) {
        // code here
        int count = 0;
        for(int i=0, j= n-1; i<j; i++, j--){
            if(arr[i] != arr[j]){
                count++;
            }
        }
        return (count+1)/2;
    }
}
