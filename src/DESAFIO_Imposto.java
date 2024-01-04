import java.util.Locale;
import java.util.Scanner;

public class DESAFIO_Imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double RAS = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviços: ");
        double RAP = sc.nextDouble();
        System.out.print("Renda anual com ganho da capital: ");
        double RAG = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double GM = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double GE = sc.nextDouble();

        System.out.println(" ");
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA: ");
        System.out.println(" ");

        System.out.println("CONSOLIDADO DE RENDA: ");
        double IS = 0;
        double IP = 0;
        double IG = 0;
        double SM = RAS/12;

        if (SM>3000 && SM<5000) {
            IS = RAS*0.1;
        } else if (SM >= 5000){
            IS = RAS*0.2;
        }

        if (RAP>0){
            IP = (RAP/10)+RAP/20;
        }

        if (RAG>0){
            IG = RAG*0.2;
        }


        System.out.printf("Imposto Sobre Salário: %.2f\n",IS);

        System.out.printf("Imposto Sobre Serviços: %.2f\n",IP);

        System.out.printf("Imposto Sobre Ganho de Capital: %.2f\n",IG);

        System.out.println(" ");

        System.out.print("DEDUÇÕES: ");

        double MD = (IS+IP+IG)*0.3;

        System.out.printf("Máximo Dedutível: %.2f",MD);

        double GD = GM+GE;

        System.out.printf("Gastos Dedutíveis %.2f",GD);

        System.out.println(" ");

        System.out.println("Resumo: ");

        double ibt = IS+IP+IG;

        System.out.printf("Imposto Bruto Total: %.2f\n",ibt);

        double ab = 0;

        if (GD>MD){
            ab = MD;
        }else{
            ab = GM+GE;
        }

        System.out.printf("Abatimento: %.2f\n",ab);

        double id = ibt-ab;

        System.out.printf("abatimento devido: %.2f",id);
    }

}
