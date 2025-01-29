package Atividades_IfElse;
import java.util.Scanner;
public class Atv9_4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Informe seu peso (kg): ");
            double peso = scanner.nextDouble();

            if (idade >= 18 && idade <= 65 && peso >= 50) {
                System.out.println("Você está apto(a) para doar sangue.");
            } else {
                System.out.println("Você não está apto(a) para doar sangue.");
            }
        }
    }