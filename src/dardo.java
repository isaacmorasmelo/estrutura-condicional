import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("digite as 3 distancias");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        if (d1>d2 && d1>d3){
            System.out.printf("MAIOR DISTANCIA %.2f",d1);
        }else if(d2>d3){
            System.out.printf("MAIOR DISTANCIA %.2f",d2);
        }else{
            System.out.printf("MAIOR DISTANCIA %.2f",d3);
        }
    }
}
