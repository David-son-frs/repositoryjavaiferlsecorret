package Atividades_IfElse;
import java.util.Scanner;
public class Atv6_4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o salário ($): ");
            double salario = scanner.nextDouble();

            System.out.print("Informe o valor da parcela ($): ");
            double parcela = scanner.nextDouble();

            if (parcela <= salario * 0.10) {
                System.out.println("A compra pode ser realizada.");
            } else {
                System.out.println("A compra não pode ser realizada.");
            }
        }
    }