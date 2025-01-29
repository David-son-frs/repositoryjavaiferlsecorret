package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x= sc.nextInt();
        System.out.println("Insira outro numero");
        int y= sc.nextInt();
        if(x<y){
            System.out.printf(y+" é o maior valor");
        }else{
            System.out.println(x+" é o maior numero ");
        }
    }
}
