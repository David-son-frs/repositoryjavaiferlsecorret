package Atividades_IfElse;
import java.util.Scanner;
public class Atv9_2 {
        public static void main(String[] args) {
            int codigoCorreto = 1234;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira o codigo: ");
            int codigoInserido = scanner.nextInt();

            if (codigoCorreto==codigoInserido) {
                System.out.println("Acesso concedido.");
            } else {
                System.out.println("Código incorreto.");
            }
        }
    }