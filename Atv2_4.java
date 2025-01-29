package Atividades_IfElse;
import java.util.Scanner;
public class Atv2_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();

            if (nota >= 10) {
                System.out.println("Aluno aprovado com nota máxima!");
            } else {
                System.out.println("Aluno não recebeu nota máxima.");
            }

            scanner.close();
        }
    }


