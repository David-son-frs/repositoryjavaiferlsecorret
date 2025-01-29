package Atividades_IfElse;
import java.util.Scanner;
public class Atv8_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numeroSecreto = 7;
            int tentativa;

            System.out.println("Adivinhe o número secreto entre 1 e 10:");

            while (true) {
                tentativa = scanner.nextInt();

                if (tentativa == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou!");
                    break;
                } else {
                    System.out.println("Tente novamente.");
                }
            }
        }
    }