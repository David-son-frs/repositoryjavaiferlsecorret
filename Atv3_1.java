package Atividades_IfElse;

import java.util.Objects;
import java.util.Scanner;

public class Atv3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        String word = sc.next();
        if (Objects.equals(word, "Sim")) {
            System.out.println("A palavra que voce inseriu é 'Sim'");
        } else if (Objects.equals(word, "Não")) {
            System.out.println("A palavra que voce inseriu é 'Não'");
        } else {
            System.out.println("a palavra que voce inseriu nao é 'Sim' ou 'Não'");
        }
    }
}
