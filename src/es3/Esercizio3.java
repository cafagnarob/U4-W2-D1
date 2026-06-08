package es3;

import exeption.BancaException;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente conto1 = new ContoCorrente("Roberto", 100.50);
        ContoOnLine contoOnLine1 = new ContoOnLine("Franco", 15.40, 10);

        System.out.println("-----PRELIEVO-----");
        Boolean flag = true;

        while (flag) {
            try {
                System.out.println("prelievo");
                double valorePrelievo = scanner.nextDouble();
                System.out.println("prelievo online");
                System.out.println(conto1.getSaldo());
                double valorePrelievoOnline = scanner.nextDouble();
                conto1.preleva(valorePrelievo);
                System.out.println(conto1.getSaldo());


                System.out.println(contoOnLine1.getSaldo());
                contoOnLine1.preleva(valorePrelievoOnline);
                System.out.println(contoOnLine1.getSaldo());


            } catch (BancaException e) {
                System.out.println("ERRORE" + e.getMessage());
                scanner.nextLine();
            }

        }


    }
}
