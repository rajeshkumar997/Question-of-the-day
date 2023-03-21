import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        List<String> perms = generatePermutations(s);
        Collections.sort(perms);

        System.out.println(perms.get(k-1));
}

    private static List<String> generatePermutations(String s) {
        List<String> perms = new ArrayList<>();
        generatePermutationsHelper(s.toCharArray(), 0, perms);
        return perms;
    }

    private static void generatePermutationsHelper(char[] s, int i, List<String> perms) {
        if (i == s.length-1) {
            perms.add(new String(s));
        } else {
            Set<Character> seen = new HashSet<>();
                for (int j = i; j < s.length; j++) {
                  if (!seen.contains(s[j])) {
                      seen.add(s[j]);
                      swap(s, i, j);
                      generatePermutationsHelper(s, i+1, perms);
                      swap(s, i, j);
                    }
                }
            }
        }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
