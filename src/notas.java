import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = nota1+nota2;

        if (media<60.00){
            System.out.printf("NOTA FINAL: %.1f\n",media);
            System.out.println("REPROVADO");
        }
        else {
            System.out.printf("NOTA FINAL: %.1f",media);
        }
    }
}
