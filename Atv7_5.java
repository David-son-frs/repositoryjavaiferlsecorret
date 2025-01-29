package Atividades_IfElse;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Atv7_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Informe a data (dd/MM/yyyy): ");
            LocalDate data = LocalDate.parse(scanner.next(), formato);

            System.out.print("Informe a data inicial do período (dd/MM/yyyy): ");
            LocalDate dataInicial = LocalDate.parse(scanner.next(), formato);

            System.out.print("Informe a data final do período (dd/MM/yyyy): ");
            LocalDate dataFinal = LocalDate.parse(scanner.next(), formato);

            if (!data.isBefore(dataInicial) && !data.isAfter(dataFinal)) {
                System.out.println("A data está dentro do período.");
            } else {
                System.out.println("A data está fora do período.");
            }
        }
    }