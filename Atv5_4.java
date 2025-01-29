package Atividades_IfElse;
import java.util.Scanner;

public class Atv5_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a pressão sistólica (mmHg): ");
        int sistolica = scanner.nextInt();
        System.out.println("Informe a pressão diastólica (mmHg): ");
        int diastolica = scanner.nextInt();
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("nível de risco: Normal");
        } else if ((sistolica >= 120 && sistolica <= 139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("nível de risco: Moderado");
        } else if (sistolica >= 140 || diastolica >= 90) {
            System.out.println("nível de risco: Alto");
        } else {
            System.out.println("Desconhecido");
        }
    }
}