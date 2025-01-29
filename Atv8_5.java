package Atividades_IfElse;
import java.util.Scanner;
import java.util.Random;
public class Atv8_5 {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int sorteado = random.nextInt(10) + 1;

            System.out.print("Tente adivinhar o número (1-10): ");
            int tentativa = scanner.nextInt();

            if (tentativa == sorteado) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Errado! O número correto era " + sorteado);
            }
        }
    }