import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Você vai digitar em qual escala (C/F)? ");
        String cf = sc.nextLine();

        if (cf.equals("F")){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double F = sc.nextDouble();
            double C = (double) 5 / 9*(F-32);
            System.out.printf("Temperatura equivalente em Celsius: %.2f",C);
        } else if(cf.equals("C")){
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (double) c/((double) 5 /9)+32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f",f);

        }

    }
}
