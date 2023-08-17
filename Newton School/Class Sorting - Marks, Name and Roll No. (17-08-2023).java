import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Student implements Comparable<Student> {
    String name;
    int marks;
    int rollNumber;

    public Student(String name, int marks, int rollNumber) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(Student other) {
        if (this.marks != other.marks) {
            return Integer.compare(this.marks, other.marks);
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        } else {
            return Integer.compare(this.rollNumber, other.rollNumber);
        }
    }

    @Override
    public String toString() {
        return name + " " + marks + " " + rollNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int marks = scanner.nextInt();
            int rollNumber = scanner.nextInt();
            students.add(new Student(name, marks, rollNumber));
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
