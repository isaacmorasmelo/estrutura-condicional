import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        double valor = 50.00;

        if (minutos<100){
            System.out.printf("valor a pagar: %.2f",valor);
        }else {
            double v2 = (minutos-100)*2+valor;
            System.out.printf("Valor a pagar: %.2f",v2);
        }
    }
}
