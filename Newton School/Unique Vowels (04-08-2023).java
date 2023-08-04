import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = vowels(s);
        System.out.println(count);
    }

    public static int vowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> uniqueVowels = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                uniqueVowels.add(c);
            }
        }
        return uniqueVowels.size();
    }
}
