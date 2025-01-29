package Atividades_IfElse;
import java.util.Scanner;
public class Atv1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = sc.next().charAt(0);
        if ('A' == caractere || 'E' == caractere || 'I' == caractere || 'O' == caractere || 'U' == caractere ||
                'a' == caractere || 'e' == caractere || 'i' == caractere || 'o' == caractere || 'u' == caractere) {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " não é uma vogal.");
        }

    }
    }