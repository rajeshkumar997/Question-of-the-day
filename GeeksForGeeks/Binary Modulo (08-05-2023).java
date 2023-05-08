class Solution{
	int modulo(String s, int m) {
		//Write your code here
		int k = 0;
        for (int i = 0; i < s.length(); i++) {
            k = k * 2 + (s.charAt(i) - '0'); // convert binary to decimal
            k %= m; // keep taking modulus to avoid overflow
        }
        return k;
	}
}
