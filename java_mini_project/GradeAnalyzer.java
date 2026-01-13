package java_mini_project;
import java.util.Scanner;
public class GradeAnalyzer {
    public static void main(String[] args) {
        System.out.println("---- Grade Analyzer 1.0 ----");

        try (Scanner scanner = new Scanner(System.in)) {
            // Get Number of subjects
            System.out.println("Enter number of subjects : ");
            int size = scanner.nextInt();
             
            // Create the array
            int[] grades = new int[size];
            
            // Call method to fill grades ( Pass scanner inside)
            fillGrades(grades, scanner);
            
            // Calculate average
            double average = calculateAverage(grades);
            
            // Verdict
            System.out.println("\n--- Results ---");
            System.out.println("Average score : " + average);
            
            if (average >= 60) {
                System.out.println("Verdict : Passed");
            } else {
                System.out.println("Verdict : Failed");
            }   
        }
            
    }
        // ----- METHODS TO IMPLEMENT -----

        // Method to fill the array
        public static void fillGrades(int[] grades, Scanner scanner) {
            // use basic for , cause we need index
            for(int i = 0; i < grades.length; i++) {
                System.out.print("Enter grade for subject " + (i+1) + ":");
                grades[i] = scanner.nextInt();
            }
        }
        // Method calculate the average
        public static double calculateAverage(int[] grades) {
            int sum = 0;
            // Use for-each
            for(int grade : grades) {
                sum += grade; // sum = sum + grade
            }
            return (double) sum / grades.length;
        }
}

