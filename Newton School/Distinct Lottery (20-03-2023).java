import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        HashMap<String, Integer> itemCounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String item = reader.readLine();
            int count = itemCounts.getOrDefault(item, 0);
            itemCounts.put(item, count + 1);
        }
        System.out.println(itemCounts.size());
        
                    ////   OR        /////////
        
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Set<String> items = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             String s = sc.next();
//             items.add(s);
//         }
//         System.out.println(items.size());
    }
}
