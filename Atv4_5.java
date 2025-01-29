package Atividades_IfElse;
import java.util.Scanner;
public class Atv4_6 {
    public class VerificarQuadradoPerfeito {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            double raiz = Math.sqrt(numero);

            if (raiz == (int) raiz) {
                System.out.println("O número é um quadrado perfeito.");
            } else {
                System.out.println("O número não é um quadrado perfeito.");
            }

            scanner.close();
        }
    }
}
