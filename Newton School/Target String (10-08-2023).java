import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String target = scanner.nextLine();

        if (s.length() != target.length()) {
            System.out.println("false");
            return;
        }

        if (s.equals(target) && hasDuplicates(s)) {
            System.out.println("true");
            return;
        }

        int diffCount = 0;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target.charAt(i)) {
                diffCount++;
                if (diffCount == 1) {
                    index1 = i;
                } else if (diffCount == 2) {
                    index2 = i;
                } else {
                    System.out.println("false");
                    return;
                }
            }
        }

        if (diffCount == 2 && s.charAt(index1) == target.charAt(index2) &&
            s.charAt(index2) == target.charAt(index1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean hasDuplicates(String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
            if (freq[c - 'a'] > 1) {
                return true;
            }
        }
        return false;
    }
}
