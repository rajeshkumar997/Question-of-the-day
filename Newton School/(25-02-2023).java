import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int hour = 21 + k / 60; // calculate the hour
        int minute = k % 60; // calculate the minute

        // format the hour and minute to 2 digits
        String hourStr = String.format("%02d", hour);
        String minuteStr = String.format("%02d", minute);

        // print the time in HH:MM format
        System.out.println(hourStr + ":" + minuteStr);
    }
}
