package Atividades_IfElse;
import java.util.Scanner;
public class Atv9_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número da placa do veículo:");
            String placa = scanner.nextLine();

            char ultimaCifra = placa.charAt(placa.length() - 1);
            int numeroUltimaCifra = Character.getNumericValue(ultimaCifra);

            if (numeroUltimaCifra % 2 == 0) {
                System.out.println("O veículo pode passar no pedágio (placa termina com número par)");
            } else {
                System.out.println("O veículo não pode passar no pedágio (placa termina com número ímpar)");
            }
        }
    }