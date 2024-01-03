import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double p1 = 5.00;
        double p2 = 3.50;
        double p3 = 4.80;
        double p4 = 8.90;
        double p5 = 7.32;

        System.out.print("Código do produto comprado: ");
        int pc = sc.nextInt();

        System.out.print("Quantidade Comprada: ");
        int qc = sc.nextInt();

        if (pc==1){
            double vp1 = (double) qc * p1;
            System.out.printf("Valor a Pagar: %.2f",vp1);
        }else if (pc==2){
            double vp2 = (double) qc * p2;
            System.out.printf("Valor a Pagar: %.2f",vp2);
        } else if (pc==3){
            double vp3 = (double) qc * p3;
            System.out.printf("Valor a Pagar: %.2f",vp3);
        } else if (pc==4) {
            double vp4 = (double) qc * p4;
            System.out.printf("Valor a Pagar: %.2f", vp4);
        }    else if (pc==5) {
            double vp5 = (double) qc * p5;
            System.out.printf("Valor a Pagar: %.2f", vp5);
        }
    }
}
