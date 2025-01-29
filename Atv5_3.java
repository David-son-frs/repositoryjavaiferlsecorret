package Atividades_IfElse;
import java.util.Scanner;
public class Atv5_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a altura em metros: ");
            double altura = scanner.nextDouble();
            if (altura < 1.60) {
                System.out.println("Baixa");
            } else if (altura <= 1.80) {
                System.out.println("Média");
            } else {
                System.out.println("Alta");
            }
        }
    }