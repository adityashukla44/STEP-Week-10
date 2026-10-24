import java.util.Locale;

public class Problem10StudentResultCardGenerator {
    private static class StudentResult {
        final String name;
        final int[] marks;
        StudentResult(String name, int[] marks) { this.name = name; this.marks = marks.clone(); }
        double average() {
            int total = 0;
            for (int mark : marks) total += mark;
            return (double) total / marks.length;
        }
        char grade() {
            double average = average();
            if (average >= 90) return 'A';
            if (average >= 75) return 'B';
            if (average >= 60) return 'C';
            if (average >= 40) return 'D';
            return 'F';
        }
        void print() {
            System.out.printf(Locale.US, "%s: Average %.1f, Grade %c%n", name.toUpperCase(Locale.ROOT), average(), grade());
        }
    }

    public static void main(String[] args) {
        StudentResult[] students = {
            new StudentResult("Asha", new int[]{80, 90, 70}),
            new StudentResult("Ravi", new int[]{60, 55, 50})
        };
        for (StudentResult student : students) student.print();
    }
}
