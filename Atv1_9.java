package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x= sc.nextInt();
        if (x>=10&&x<=50){
            System.out.println(x+" está dentro do intervalo de 10 a 50");
        }else{
            System.out.println(x+ " NÃO está dentro do intervalo de 10 a 50");
        }
    }
}