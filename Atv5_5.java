package Atividades_IfElse;
import java.util.Scanner;
public class Atv5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();
        if (temperatura < 15) {
            System.out.println("O clima está: Frio");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("O clima está: agradavel");
        } else {
            System.out.println("O clima está: quente");
        }
    }
}