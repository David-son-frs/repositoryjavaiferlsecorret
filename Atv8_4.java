package Atividades_IfElse;
import java.util.Scanner;
import java.util.Arrays;
public class Atv8_4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Informe o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Informe o terceiro número: ");
            int num3 = scanner.nextInt();

            int[] numeros = {num1, num2, num3};
            Arrays.sort(numeros);

            System.out.println("Números em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        }
    }