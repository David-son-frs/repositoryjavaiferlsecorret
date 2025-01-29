package Atividades_IfElse;
import java.util.Scanner;
public class Atv7_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um mes(1-12): ");
            int mes = scanner.nextInt();

            if (mes >= 1 && mes <= 12) {
                System.out.println("Mês valido");
            } else {
                System.out.println("Mês invalido");
            }
        }
    }