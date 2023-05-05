import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] inputArray = input.split(" ");
            for (String str : inputArray) {
                a.add(Integer.parseInt(str));
            }
        }

        Collections.sort(a);
        if (a.get(0) + a.get(1) == a.get(2)) {
            System.out.println("Yes");
        } else if (a.get(0).equals(a.get(1)) && a.get(2) % 2 == 0) {
            System.out.println("Yes");
        } else if (a.get(1).equals(a.get(2)) && a.get(0) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
