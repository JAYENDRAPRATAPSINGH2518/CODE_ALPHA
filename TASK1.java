package CODE_ALPHA;

import java.util.ArrayList;
import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Clear buffer

        // Input student details
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter grade: ");
            double grade = input.nextDouble();
            input.nextLine(); // Clear buffer

            studentNames.add(name);
            studentGrades.add(grade);
        }

        // Calculate statistics
        double total = 0;
        double highest = studentGrades.get(0);
        double lowest = studentGrades.get(0);

        for (double grade : studentGrades) {
            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = total / studentGrades.size();

        // Display summary report
        System.out.println("\n===== STUDENT GRADE REPORT =====");

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + " : " + studentGrades.get(i));
        }

        System.out.println("-------------------------------");
        System.out.printf("Average Score : %.2f%n", average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        input.close();
    }
}
