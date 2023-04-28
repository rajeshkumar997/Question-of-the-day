import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map < Character, Integer > map = new HashMap <> ();
        int maxOccurrence = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxOccurrence = Math.max(maxOccurrence, map.get(c));
        }
        if (maxOccurrence == 1 || maxOccurrence == 2) {
            System.out.println(4);
        } else if (maxOccurrence == 3) {
            System.out.println(6);
        } else {
            System.out.println(-1);
        }
    }
}
