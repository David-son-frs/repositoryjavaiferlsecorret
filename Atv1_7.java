package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int x= sc.nextInt();
        if (x%5==0){
            System.out.printf(x+" é multiplo de 5");
        }else {
            System.out.printf(x+" NÃO é multiplo de 5");
        }
    }
}
