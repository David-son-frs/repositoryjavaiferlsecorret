package Atividades_IfElse;
import java.util.Scanner;
public class Atv7_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe a hora (0-23): ");
            int hora = scanner.nextInt();
            if (hora >= 0 && hora < 12) {
                System.out.println("Manhã");
            } else if (hora >= 12 && hora < 18) {
                System.out.println("Tarde");
            } else if (hora >= 18 && hora < 24) {
                System.out.println("Noite");
            } else {
                System.out.println("Horário inválido.");
            }
        }
    }