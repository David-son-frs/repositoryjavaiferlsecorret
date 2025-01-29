package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade:");
        int idade= sc.nextInt();
        if (idade>=16){
            System.out.println("Você pode votar!");
        }else{
            System.out.println("Você NÃo pode votar!");
        }
    }
}
