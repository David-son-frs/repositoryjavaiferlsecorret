package Atividades_IfElse;
import java.util.Scanner;
public class Atv6_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o valor total da compra (R$): ");
            double valorTotal = scanner.nextDouble();
            if (valorTotal > 500) {
                System.out.println("$"+valorTotal * 0.90);
            } else {
                System.out.println("$"+valorTotal);
            }
        }
    }