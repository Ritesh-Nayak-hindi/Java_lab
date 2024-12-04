package CIE;

public class Student {
    protected String usn;
    protected String name;
    protected int sem;

    // Constructor to initialize student details
    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}
public class Internals extends Student {
    protected int[] internalMarks;
    public Internals(String usn, String name, int sem, int[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }
    public void displayInternalMarks() {
        System.out.println("Internal Marks for the student:");
        for (int i = 0; i < internalMarks.length; i++) {
            System.out.println("Course " + (i+1) + ": " + internalMarks[i]);
        }
    }
}
package SEE;
import CIE.Student;
public class External extends Student {
    protected int[] externalMarks;
    public External(String usn, String name, int sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }
    public void displayExternalMarks() {
        System.out.println("External Marks for the student:");
        for (int i = 0; i < externalMarks.length; i++) {
            System.out.println("Course " + (i+1) + ": " + externalMarks[i]);
        }
    }
}
import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Internals[] internalsArray = new Internals[n];
        External[] externalsArray = new External[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i+1));
            System.out.print("USN: ");
            String usn = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            int sem = scanner.nextInt();
            scanner.nextLine(); 
            int[] internalMarks = new int[5];
            System.out.println("Enter internal marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine(); 
            internalsArray[i] = new Internals(usn, name, sem, internalMarks);
            int[] externalMarks = new int[5];
            System.out.println("Enter external marks (SEE) for 5 courses:");
            for (int j = 0; j < 5; j++) {
                externalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();
            externalsArray[i] = new External(usn, name, sem, externalMarks);
        }
        System.out.println("\n--- Final Marks of Students ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student " + (i+1));
            internalsArray[i].displayStudentInfo();
            internalsArray[i].displayInternalMarks();
            externalsArray[i].displayExternalMarks();
            int totalInternalMarks = 0;
            for (int mark : internalsArray[i].internalMarks) {
                totalInternalMarks += mark;
            }
            int totalExternalMarks = 0;
            for (int mark : externalsArray[i].externalMarks) {
                totalExternalMarks += mark;
            }
            int finalMarks = totalInternalMarks + totalExternalMarks;
            System.out.println("Final Marks: " + finalMarks);
        }
        scanner.close();
    }
}
