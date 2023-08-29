import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrivalTimes = new int[n];
        int[] departureTimes = new int[n];

        for (int i = 0; i < n; i++) {
            arrivalTimes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            departureTimes[i] = scanner.nextInt();
        }

        Arrays.sort(arrivalTimes);
        Arrays.sort(departureTimes);

        int doctorsRequired = 0;
        int maxDoctors = 0;
        int arrivalIndex = 0;
        int departureIndex = 0;

        while (arrivalIndex < n && departureIndex < n) {
            if (arrivalTimes[arrivalIndex] <= departureTimes[departureIndex]) {
                doctorsRequired++;
                arrivalIndex++;

                if (doctorsRequired > maxDoctors) {
                    maxDoctors = doctorsRequired;
                }
            } else {
                doctorsRequired--;
                departureIndex++;
            }
        }
        System.out.println(maxDoctors);
    }
}
