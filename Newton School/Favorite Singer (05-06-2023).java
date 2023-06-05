import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        long[] songs = new long[N];
        for (int i = 0; i < N; i++) {
            songs[i] = sc.nextLong();
        }
        
        Map<Long, Integer> frequencyMap = new HashMap<>();
        for (long singer : songs) {
            frequencyMap.put(singer, frequencyMap.getOrDefault(singer, 0) + 1);
        }
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        int favoriteSingers = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                favoriteSingers++;
            }
        }
        System.out.println(favoriteSingers);
    }
}
