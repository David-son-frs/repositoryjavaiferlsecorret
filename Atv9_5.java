package Atividades_IfElse;
import java.util.Objects;
import java.util.Scanner;

public class Atv9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastre o usuário: ");
        String user = scanner.nextLine();
        System.out.println("Cadastre uma senha: ");
        int senha = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira seu usuário:");
        String InputUser = scanner.nextLine();
        System.out.println("Insira sua senha:");
        int InputSenha = scanner.nextInt();
        if (Objects.equals(user, InputUser) && senha == InputSenha) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}