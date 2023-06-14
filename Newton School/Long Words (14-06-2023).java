import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String result = abbreviateWord(word);
            System.out.println(result);
        }
    }

    private static String abbreviateWord(String word) {
        if (word.length() <= 10) {
            return word;
        }

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        int count = word.length() - 2; 
        return String.valueOf(firstLetter) + count + lastLetter;
    }
}
