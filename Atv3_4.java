package Atividades_IfElse;
import java.util.Scanner;
public class Atv3_4 {
    public class VerificarInicioNome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();

            if (nome.length() > 0 && nome.substring(0, 1).equals("A")) {
                System.out.println("O nome começa com 'A'.");
            } else {
                System.out.println("O nome não começa com 'A'.");
            }

            scanner.close();
        }
    }
}

