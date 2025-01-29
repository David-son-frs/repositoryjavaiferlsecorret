package Atividades_IfElse;
import java.util.Scanner;
public class Atv2_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();

            if (nota1 >= 7 && nota2 >= 7) {
                System.out.println("Aprovado nas duas disciplinas");
            } else {
                System.out.println("Não aprovado nas duas disciplinas");
            }

            scanner.close();
        }
    }


