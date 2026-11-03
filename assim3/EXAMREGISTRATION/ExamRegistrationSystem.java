package EXAMREGISTRATION;

import java.util.Scanner;

// Custom Exception
class InvalidregistrationException extends Exception {
    public InvalidregistrationException (String message) {
        super(message);
    }
}

// Exam Registration Class
class ExamRegistration {

    private String studentId;
    private String name;
    private int age;
    private double examMark;
    private int subjects;

    // Constructor
    ExamRegistration(String studentId, String name, int age,
                     double examMark, int subjects) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.examMark = examMark;
        this.subjects = subjects;
    }

    // Registration Method
    public void register() throws InvalidregistrationException {

        if (studentId.isEmpty()) {

            throw new  InvalidregistrationException ("Student ID cannot be empty.");

        }

        if (age < 18) {
            throw new  InvalidregistrationException ("age must be at least 18");
        }

        if (examMark < 0 || examMark > 100) {
            throw new InvalidregistrationException (
                    "Exam mark must be between 0 and 100.");
        }

        if (subjects < 1 || subjects > 5) {
           throw  new InvalidregistrationException ("Maximum allowed subjects is 5.");
        }

        System.out.println("\nRegistration Successful!");
        System.out.println("Student: " + name);
        System.out.println("Registered Subjects: " + subjects);
    }
}

// Main Class
public class ExamRegistrationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== EXAM REGISTRATION SYSTEM =====\n");

        try {
            System.out.print("Enter Student ID: ");
            String studentId = input.nextLine();

            System.out.print("Enter Student Name: ");
            String name = input.nextLine();

            System.out.print("Enter Age: ");
            int age = input.nextInt();

            System.out.print("Enter Exam Mark: ");
            double examMark = input.nextDouble();

            System.out.print("Enter Number of Subjects: ");
            int subjects = input.nextInt();

            ExamRegistration student = new ExamRegistration(
                    studentId, name, age, examMark, subjects
            );

            student.register();

        } catch (InvalidregistrationException e) {
            System.out.println("\nRegistration Failed!");
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("\nRegistration Failed!");
            System.out.println("Error: Invalid input.");

        } finally {
            System.out.println("\nRegistration attempt completed.");
            input.close();
        }
    }
}





