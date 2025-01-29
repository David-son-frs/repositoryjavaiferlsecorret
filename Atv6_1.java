package Atividades_IfElse;
import java.util.Scanner;
public class Atv6_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o saldo disponível: ");
            double saldo = scanner.nextDouble();
            System.out.print("Digite o valor do saque: ");
            double saque = scanner.nextDouble();

            if (saque <= saldo) {
                System.out.println("Saque autorizado.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }