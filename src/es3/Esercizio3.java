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
                System.out.println("saldo:" + conto1.getSaldo());
                System.out.println("Quato vuoi prelevare? ");
                double valorePrelievo = scanner.nextDouble();
                conto1.preleva(valorePrelievo);
                System.out.println("saldo attuale" + conto1.getSaldo());
                System.out.println("prelievo online: quanto vuoi prelevare?");
                System.out.println("saldo online" + contoOnLine1.getSaldo());
                double valorePrelievoOnline = scanner.nextDouble();
                contoOnLine1.preleva(valorePrelievoOnline);
                System.out.println("saldo online attuale" + contoOnLine1.getSaldo());


            } catch (BancaException e) {
                System.out.println("ERRORE" + e.getMessage());
                scanner.nextLine();
            }

        }


    }
}
