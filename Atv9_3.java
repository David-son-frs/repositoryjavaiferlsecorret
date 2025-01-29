package Atividades_IfElse;
import java.util.Scanner;
public class Atv9_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira a temperatura em celcius: ");
            double celsius = scanner.nextDouble();
            System.out.println("Escolha 'F' para converter para Fahrenheit ou 'K' para Kelvin");
            char escolha = scanner.next().charAt(0);
            if (escolha == 'F') {
                System.out.println((celsius * 9/5) + 32);
            } else if (escolha == 'K') {
                System.out.println(celsius + 273.15);
            }
        }
    }