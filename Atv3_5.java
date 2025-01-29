package Atividades_IfElse;
import java.util.Scanner;
public class Atv3_5 {
    public class VerificarComprimentoPalavra {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();

            if (palavra.length() > 5) {
                System.out.println("A palavra tem mais de 5 caracteres.");
            } else {
                System.out.println("A palavra tem 5 caracteres ou menos.");
            }
            scanner.close();
        }
    }
}
