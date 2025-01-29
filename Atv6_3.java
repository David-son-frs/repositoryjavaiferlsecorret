package Atividades_IfElse;
import java.util.Scanner;
public class Atv6_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira seu salário: $");
            double salario = scanner.nextDouble();
            if (salario >= 3000) {
                System.out.println("Pode financiar o imóvel.");
            } else {
                System.out.println("Não pode financiar o imóvel.");
            }
        }
    }