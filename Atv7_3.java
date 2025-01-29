package Atividades_IfElse;
import java.util.Scanner;
public class Atv7_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um mês(1-12):");
            int mes = scanner.nextInt();
            System.out.println("Informe um dia:");
            int dia = scanner.nextInt();
            boolean valido = false;

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) valido = true;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) valido = true;
            } else if (mes == 2) {
                int ano = scanner.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) valido = true;
                } else {
                    if (dia >= 1 && dia <= 28) valido = true;
                }
            }

            System.out.println(valido ? "Dia válido." : "Dia inválido.");
        }
    }