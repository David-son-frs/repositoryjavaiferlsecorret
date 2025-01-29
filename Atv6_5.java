package Atividades_IfElse;
import java.util.Scanner;
public class Atv6_5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o valor da compra (R$): ");
            double valorCompra = scanner.nextDouble();

            System.out.print("Informe o valor mínimo para ganhar um brinde (R$): ");
            double valorMinimo = scanner.nextDouble();

            if (valorCompra >= valorMinimo) {
                System.out.println("Você ganhou um brinde!");
            } else {
                System.out.println("você não atingiu o valor mínimo para ganhar um brinde!");
            }
        }
    }