import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double totalGPA = 0.0;

        for (int i = 0; i < n; i++) {
            double[] ygpas = new double[4]; 
            for (int j = 0; j < 4; j++) {
                ygpas[j] = scanner.nextDouble();
            }
            double studentGPA = calculateAverage(ygpas);
            totalGPA += studentGPA;
        }

        double averageGPA = totalGPA / n;
        char collegeGrade = calculateCollegeGrade(averageGPA);
        System.out.println(collegeGrade);

        scanner.close();
    }

    public static double calculateAverage(double[] ygpas) {
        double sum = 0.0;
        for (double ygpa : ygpas) {
            sum += ygpa;
        }
        return sum / ygpas.length;
    }

    public static char calculateCollegeGrade(double averageGPA) {
        if (averageGPA >= 8.5) {
            return 'A';
        } else if (averageGPA >= 7.0) {
            return 'B';
        } else {
            return 'C';
        }
    }
}
