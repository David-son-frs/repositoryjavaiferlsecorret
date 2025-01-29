package Atividades_IfElse;
import java.util.Scanner;
public class Atv4_3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int num2 = scanner.nextInt();

                if (num1 - num2 < 0) {
                    System.out.println("A diferença é negativa.");
                } else {
                    System.out.println("A diferença não é negativa.");
                }
            }
        }
