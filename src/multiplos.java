import java.util.Locale;
import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1>n2){
            if (n1%n2==0){
                System.out.println("são multiplos.");
            } else {
                System.out.println("não são multiplos");
            }
        } else {
            if (n2%n1==0){
                System.out.println("são multiplos.");
            } else {
                System.out.println("não são multiplos");
            }
        }
    }
}
