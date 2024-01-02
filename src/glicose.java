import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double g = sc.nextDouble();

        if ((double)g<=100) {
            System.out.println("Classificacao: normal");
        }else if ((double)g<=140){
            System.out.println("Classificacao: elevada");
        }else if(g>140){
            System.out.println("classificacao: diabetes");
        }
    }
}
