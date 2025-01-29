package Atividades_IfElse;
import java.util.Scanner;
public class Atv7_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a hora: ");
            int hora = scanner.nextInt();
            System.out.println("Informe os minutos: ");
            int minuto = scanner.nextInt();

            if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
                System.out.println("Horário válido.");
            } else {
                System.out.println("Horário inválido.");
            }
        }
    }
