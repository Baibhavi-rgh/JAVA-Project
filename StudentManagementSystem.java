
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {

        loadStudents();

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("================================");

            choice = readInt("Enter your choice: ");

            switch (choice) {
                
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    saveStudents();
                    System.out.println("Thank you for using the system!");
                    break;
            
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }

    // Read integer safely
    public static int readInt(String message) {

        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Read marks safely
    public static double readMarks(String message) {

        while (true) {
            try {
                System.out.print(message);
                double marks = Double.parseDouble(sc.nextLine().trim());

                if (marks >= 0 && marks <= 100) {
                    return marks;
                }

                System.out.println("Marks must be between 0 and 100.");

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid marks.");
            }
        }
    }

    // Add student
    public static void addStudent() {

        int id = readInt("Enter Student ID: ");

        if (findStudent(id) != null) {
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        double marks = readMarks("Enter Marks (0-100): ");

        Student s = new Student(id, name, course, marks);

        students.add(s);

        saveStudents();

        System.out.println("Student added successfully!");
    }

    // Display all students
    public static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n----- STUDENT RECORDS -----");

        for (Student s : students) {
            s.display();
        }
    }

    // Search student
    public static void searchStudent() {

        int id = readInt("Enter Student ID to search: ");

        Student s = findStudent(id);

        if (s != null) {
            System.out.println("Student found:");
            s.display();
        } else {
            System.out.println("Student not found!");
        }
    }

    // Update student
    public static void updateStudent() {

        int id = readInt("Enter Student ID to update: ");

        Student s = findStudent(id);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Course: ");
        String course = sc.nextLine();

        double marks = readMarks("Enter New Marks (0-100): ");

        s.setName(name);
        s.setCourse(course);
        s.setMarks(marks);

        saveStudents();

        System.out.println("Student updated successfully!");
    }

    // Delete student
    public static void deleteStudent() {

        int id = readInt("Enter Student ID to delete: ");

        Student s = findStudent(id);

        if (s != null) {

            students.remove(s);

            saveStudents();

            System.out.println("Student deleted successfully!");

        } else {
            System.out.println("Student not found!");
        }
    }

    // Find student by ID
    public static Student findStudent(int id) {

        for (Student s : students) {

            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    // Save students to file
    public static void saveStudents() {

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Student s : students) {
                writer.println(s.toFileString());
            }

        } catch (IOException e) {

            System.out.println("Error saving student records.");
        }
    }

    // Load students from file
    public static void loadStudents() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 4) {

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String course = data[2];
                    double marks = Double.parseDouble(data[3]);

                    students.add(
                        new Student(id, name, course, marks)
                    );
                }
            }

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error loading student records.");
        }
    }
}