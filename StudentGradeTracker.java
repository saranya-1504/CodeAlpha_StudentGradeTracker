import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        int total = 0;
        int highest = -1;
        int lowest = 101;

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            names.add(name);
            marks.add(mark);

            total += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== Summary Report =====");

        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }

        System.out.printf("\nAverage Marks : %.2f\n", average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}
