import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int uniqueCount = unique(s);
        System.out.println(uniqueCount);
    }

    public static int unique(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (isConsonant(c)) {
                set.add(c);
            }
        }
        return set.size();
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c) && Character.isLetter(c);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
