package Atividades_IfElse;
import java.util.Scanner;
public class Atv5_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero >= 1 && numero <= 10) {
                System.out.println("Faixa A");
            } else if (numero >= 11 && numero <= 20) {
                System.out.println("Faixa B");
            } else if (numero >= 21 && numero <= 30) {
                System.out.println("Faixa C");
            } else {
                System.out.println("Número fora das faixas classificadas");
            }
        }
    }