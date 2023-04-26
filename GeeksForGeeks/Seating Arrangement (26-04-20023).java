class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] arr) {
        for (int i = 0; i < m && n > 0; i++) {
            if (arr[i] == 0) {
                if ((i == 0 || arr[i-1] == 0) && (i == m-1 || arr[i+1] == 0)) {
                    n--;
                    arr[i] = 1;
                }
            }
        }
        return n == 0;
    }
}
