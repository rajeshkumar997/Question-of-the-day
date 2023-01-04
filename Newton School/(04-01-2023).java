import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); 
    String[] strings = new String[n];
    for (int i = 0; i < n; i++) {
      strings[i] = sc.nextLine();
    }
    sc.close();
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (isStringram(strings[i], strings[j])) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

  public static boolean isStringram(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    return Arrays.equals(c1, c2);
  }
}

//                        Answer is correct but TLE problem
