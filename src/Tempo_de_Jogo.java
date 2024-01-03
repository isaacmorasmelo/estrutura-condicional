import java.util.Locale;
import java.util.Scanner;

public class Tempo_de_Jogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora Inicial: ");
        int h1 = sc.nextInt();

        System.out.print("Hora Final: ");
        int h2 = sc.nextInt();

        if (h2<=h1){
            int hj = 24-h1+h2;
            System.out.printf("O jogo durou %d Hora(s)",hj);
        }else{
            int hj = h2-h1;
            System.out.printf("o jogo durou %d Hora(s)",hj);
        }
    }
}
