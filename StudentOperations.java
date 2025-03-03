// StudentOperations.java
// Class to manage student records, including adding, searching, updating, and deleting students.

import java.util.ArrayList;
import java.util.Scanner;

class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>();

    // Method to add a new student
    public void addStudent(Scanner scan) {
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter PRN: ");
        long prn = scan.nextLong();
        scan.nextLine();  // Consume newline
        System.out.print("Enter Department: ");
        String dept = scan.nextLine();
        System.out.print("Enter Batch (YYYY-YY): ");
        String batch = scan.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scan.nextDouble();
        scan.nextLine();  // Consume newline

        students.add(new Student(name, prn, dept, batch, cgpa));
        System.out.println("Student added successfully.");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    // Method to search student by PRN
    public void searchByPRN(Scanner scan) {
        System.out.print("Enter PRN: ");
        long prn = scan.nextLong();
        scan.nextLine();  // Consume newline
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to search student by name
    public void searchByName(Scanner scan) {
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to update student details
    public void updateStudent(Scanner scan) {
        System.out.print("Enter PRN of student to update: ");
        long prn = scan.nextLong();
        scan.nextLine();  // Consume newline

        for (Student student : students) {
            if (student.getPRN() == prn) {
                System.out.print("Enter new name: ");
                student.setName(scan.nextLine());
                System.out.print("Enter new Department: ");
                student.setDept(scan.nextLine());
                System.out.print("Enter new Batch: ");
                student.setBatch(scan.nextLine());
                System.out.print("Enter new CGPA: ");
                student.setCGPA(scan.nextDouble());
                scan.nextLine();  // Consume newline
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to delete student by PRN
    public void deleteStudent(Scanner scan) {
        System.out.print("Enter PRN of student to delete: ");
        long prn = scan.nextLong();
        scan.nextLine();  // Consume newline

        // Remove student from the list if PRN matches
        boolean removed = students.removeIf(student -> student.getPRN() == prn);
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}

