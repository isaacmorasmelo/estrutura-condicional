import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente A: ");
        double A = sc.nextDouble();

        System.out.print("coeficiente B: ");
        double B = sc.nextDouble();

        System.out.print("coeficiente C: ");
        double C = sc.nextDouble();

        double Delta = B * B - 4 * A * C;

        if (Delta < 0) {
            System.out.println("Esta equação não possui raizes reais.");
        } else {
            double x1 = (-B + Math.sqrt(Delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(Delta)) / (2 * A);
            System.out.printf("X1 = %.4f\n",x1);
            System.out.printf("X2 = %.4f\n",x2);
        }





    }
}
