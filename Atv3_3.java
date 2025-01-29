package Atividades_IfElse;
import java.util.Scanner;
public class Atv3_3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                if (scanner.nextLine().equals("1234")) {
                    System.out.println("Senha correta!");
                } else {
                    System.out.println("Senha incorreta!");
                }

                scanner.close();
            }
        }


