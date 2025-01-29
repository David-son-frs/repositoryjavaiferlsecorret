package Atividades_IfElse;

import java.util.Scanner;

public class Atv3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua senha: ");
        int senha= sc.nextInt();
        if (senha==1234){
            System.out.println("acesso liberado");
        }else{
            System.out.println("acesso negado");
        }
    }
}
