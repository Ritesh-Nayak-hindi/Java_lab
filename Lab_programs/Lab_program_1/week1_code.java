import java.util.Scanner;

class quadratic {
    private double a, b, c;
    private double D;
    private double root1;
    private double root2;

    quadratic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUES OF a, b AND c ACCORDING TO THE EXPRESSION OF THE QUADRATIC EQUATION ax^2 + bx + c = 0 ");
        this.a = sc.nextDouble();
        this.b = sc.nextDouble();
        this.c = sc.nextDouble();
        this.D = (b * b) - (4 * a * c);
    }

    public void solve() {
        if (D < 0) {
            System.out.println("THE ROOTS ARE NOT REAL");
            return;
        }
        if (D == 0) {
            root1 = (-1 * b) / (2 * a);
            root2 = root1;  // Since both roots are the same
            System.out.println("THE ROOTS ARE IDENTICAL" + "\n" + "ROOT 1: " + root1 + "\n" + "ROOT 2: " + root2);
            return;
        }
        if (D > 0) {
            root1 = (-1 * b + (Math.sqrt(D))) / (2 * a);
            root2 = (-1 * b - (Math.sqrt(D))) / (2 * a);
            System.out.println("THE ROOTS ARE UNIQUE" + "\n" + "ROOT 1: " + root1 + "\n" + "ROOT 2: " + root2);
            return;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        quadratic Q1 = new quadratic();
        Q1.solve();
        quadratic Q2 = new quadratic();
        Q2.solve();
        quadratic Q3 = new quadratic();
        Q3.solve();
    }
}
