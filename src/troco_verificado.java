import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Preço Unitário do Produto: ");
        double pup = sc.nextDouble();

        System.out.print("Quantidade Comprada: ");
        double qc = sc.nextDouble();

        System.out.print("Dinheiro recebido: ");
        double dr = sc.nextDouble();

        if (pup*qc<=dr) {
            double t = dr-pup*qc;
            System.out.printf("TROCO = %.2f",t);
        }else {
            double di = pup*qc-dr;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f",di);
        }

    }
}
