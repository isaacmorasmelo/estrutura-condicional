import java.util.Locale;
import java.util.Scanner;

public class menor_de_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("primeiro  valor: ");
        int v1 = sc.nextInt();

        System.out.print("segundo valor: ");
        int v2 = sc.nextInt();

        System.out.print("terceiro valor: ");
        int v3 = sc.nextInt();

        if (v1<v2 && v1<v3){
            System.out.printf("Menor: %d",v1);
        } else if (v2<v1 && v2<v3){
            System.out.printf("Menor: %d",v2);
        } else {
            System.out.printf("Menor: %d",v3);
        }
    }
}
