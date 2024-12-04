import java.util.Scanner;

class Student {
    int n;
    String usn, name;
    float marks[];
    float credits[];
    Scanner sc = new Scanner(System.in);

    Student() {
        System.out.println("ENTER THE NUMBER OF SUBJECTS");
        this.n = sc.nextInt();
    }

    void create() {
        System.out.println("Enter the name of the Student");
        this.name = sc.next();
        sc.nextLine();
        System.out.println("Enter the USN of the Student");
        this.usn = sc.nextLine();

        this.marks = new float[n];
        this.credits = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of subject " + (i + 1));
            marks[i] = sc.nextFloat();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter valid marks (0-100): ");
                marks[i] = sc.nextFloat();
            }

            System.out.println("Enter the credits of subject " + (i + 1));
            credits[i] = sc.nextFloat();

            while (credits[i] <= 0) {
                System.out.println("Invalid credits! Please enter valid credits (>0): ");
                credits[i] = sc.nextFloat();
            }
        }
    }

    int grade(float a) {
        if (a <= 100 && a > 90) {
            return 10;
        } else if (a > 80) {
            return 9;
        } else if (a > 70) {
            return 8;
        } else if (a > 60) {
            return 7;
        } else if (a > 50) {
            return 6;
        } else if (a > 40) {
            return 5;
        } else if (a > 30) {
            return 4;
        } else if (a > 20) {
            return 3;
        } else if (a > 10) {
            return 2;
        } else if (a > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    void sgpa() {
        float totalCredits = 0;
        float totalGradePoints = 0;

        for (int i = 0; i < n; i++) {
            totalCredits += credits[i];
            totalGradePoints += credits[i] * grade(marks[i]);
        }

        float sgpa = totalGradePoints / totalCredits;

        System.out.println("NAME: " + name);
        System.out.println("USN: " + usn);
        System.out.println("THE SGPA OF THE STUDENT IS: " + sgpa);
    }
}

public class labpro {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.create();
        S1.sgpa();
    }
}
