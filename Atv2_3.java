package Atividades_IfElse;
import java.util.Scanner;
public class Atv2_3 {
    public class MaiorMenorNota {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double maior = Math.max(nota1, Math.max(nota2, nota3));
            double menor = Math.min(nota1, Math.min(nota2, nota3));

            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);

            scanner.close();
        }
    }

}
