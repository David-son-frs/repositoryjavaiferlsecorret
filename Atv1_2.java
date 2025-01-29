package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x= sc.nextInt();
        if (x%2==0){
            System.out.printf(x+" é par");
        }else {
            System.out.printf(x+" é impar");
        }
    }
}
