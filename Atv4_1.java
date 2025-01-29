package Atividades_IfElse;

import java.util.Scanner;

public class Atv4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 + num2 > 100) {
            System.out.println("A soma é maior que 100.");
        } else {
            System.out.println("A soma não é maior que 100.");
        }
    }
}

