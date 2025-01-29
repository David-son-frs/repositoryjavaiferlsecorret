package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x= sc.nextInt();
        System.out.println("Insira outro numero");
        int y= sc.nextInt();
        System.out.println("Insira outro numero");
        int z= sc.nextInt();
        int maior = x;
        if (y > maior) {
            maior = y;
        }
        if (z > maior) {
            maior = z;
        }
        System.out.println("O maior número é: " + maior);

    }
}


