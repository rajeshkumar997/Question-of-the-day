import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int result = findLCM(input);
        System.out.println(result);
    }

    public static int findLCM(String s) {
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }
        int lcm = 1;
        for (int freq : charFreqMap.values()) {
            lcm = findLCM(lcm, freq);
        }
        return lcm;
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
