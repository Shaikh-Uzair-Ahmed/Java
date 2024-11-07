package Experiment_2;
import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] GradePts;

    // Constructor
    Student(int numberOfSubjects) {
        credits = new int[numberOfSubjects];
        GradePts = new int[numberOfSubjects];
    }

    // Method to accept student details
    void acceptDetails() {
        Scanner sx = new Scanner(System.in);
        
        System.out.print("Enter USN: ");
        usn = sx.nextLine();
        
        System.out.print("Enter Name: ");
        name = sx.nextLine();
        
        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = sx.nextInt();
            
            System.out.print("Enter Grade Point for subject " + (i + 1) + ": ");
            GradePts[i] = sx.nextInt();
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        
        System.out.println("Subject Details:");
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits = " + credits[i] + ", GradePoints = " + GradePts[i]);
        }
    }

    // Method to calculate SGPA
    int calculateSGPA() {
        int totalCredits = 0;
        int weightedMarks = 0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            weightedMarks += (GradePts[i] * credits[i]);
        }

        return (totalCredits == 0) ? 0 : (weightedMarks / totalCredits);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sx.nextInt();

        Student student = new Student(numberOfSubjects);
        student.acceptDetails();
        student.displayDetails();

        float sgpa = student.calculateSGPA();
        System.out.printf("SGPA: %.2f\n", sgpa);
        
        sx.close();
    }
}