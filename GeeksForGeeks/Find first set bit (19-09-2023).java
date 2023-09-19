class Solution {
    // Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n) {
        int position = 1;
        
        // If n is 0, there are no set bits.
        if (n == 0) {
            return 0;
        }
        
        // Iterate through the binary representation from right to left.
        while ((n & 1) == 0) {
            n >>= 1; // Right shift to check the next bit.
            position++;
        }
        
        return position;
    }
}
