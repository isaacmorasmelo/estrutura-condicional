import java.util.Locale;
import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: ");
        double sa = sc.nextDouble();

        if (sa<=1000){
            double ns = ((double) 20 /100*sa)+sa;
            double am = (double) ns-sa;
            System.out.printf("novo salário: %.2f\n",ns);
            System.out.printf("aumento: R$ %.2f\n",am);
            System.out.println("porcentagem: 20%");
        } else if (sa<=3000){
            double ns = ((double) 15 /100*sa)+sa;
            double am = (double) ns-sa;
            System.out.printf("novo salário: %.2f\n",ns);
            System.out.printf("aumento: R$ %.2f\n",am);
            System.out.println("porcentagem: 15%");
        } else if (sa<=8000){
            double ns = ((double) 10 /100*sa)+sa;
            double am = (double) ns-sa;
            System.out.printf("novo salário: %.2f\n",ns);
            System.out.printf("aumento: R$ %.2f\n",am);
            System.out.println("porcentagem: 10%");
        } else if (sa>8000){
            double ns = ((double) 5 /100*sa)+sa;
            double am = (double) ns-sa;
            System.out.printf("novo salário: %.2f\n",ns);
            System.out.printf("aumento: R$ %.2f\n",am);
            System.out.println("porcentagem: 5%");
        }
    }
}
