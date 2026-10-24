import java.util.Scanner;

public class Problem08StudentGradeAssignment {
    public static char gradeFor(int marks) {
        if (marks < 0 || marks > 100) throw new IllegalArgumentException("Marks must be between 0 and 100.");
        if (marks >= 90) return 'A';
        if (marks >= 75) return 'B';
        if (marks >= 60) return 'C';
        if (marks >= 40) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) System.out.println("Grade " + gradeFor(sc.nextInt()));
    }
}
