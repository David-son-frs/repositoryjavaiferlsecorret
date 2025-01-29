package Atividades_IfElse;

import java.util.Scanner;

public class Atv2_1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Insira a primeira nota:");
        double n1= sc.nextDouble();
        System.out.println("Insira a segunda nota:");
        double n2= sc.nextDouble();
        double media=(n1+n2)/2;
        if (media>=7){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno NÃO foi aprovado");
        }
    }
}