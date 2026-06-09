package es2;

import exeption.ValoreLitriNonValidoExeption;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        System.out.println("------ PROGRAMMA KM/L--------");


       /* boolean flag = true;

        while (flag) {
            try {
                System.out.println("------- -1 per uscire ------");
                System.out.println("------- inserisci i km percorsi-------");
                int km = Integer.parseInt(scanner.nextLine());
                if (km == -1) {
                    System.out.println("------ CHIUSURA------");
                    flag = false;
                } else if (km < 0) {
                    throw new ValoreLitriNonValidoExeption("valori negativi non validi");
                } else {
                    System.out.println("------- inserire i litri consumati------");
                    int litri = Integer.parseInt(scanner.nextLine());

                    if (litri == -1) {
                        flag = false;
                    } else if (litri == 0) {
                        throw new ValoreLitriNonValidoExeption("divisione per zero non valida (cambia numero)");
                    } else if (litri < 0) {
                        throw new ValoreLitriNonValidoExeption("valori negativi non validi");

                    } else {
                        double ratio = (double) km / litri;
                        System.out.println(ratio + "km/L");
                        flag = false;
                    }
                }


            } catch (ValoreLitriNonValidoExeption e) {
                System.out.println("Errore" + " " + e.getMessage());

            } catch (RuntimeException e) {
                System.out.println("inserisci un numero valido");
            }*/

        // test con double

        boolean flag = true;

        while (flag) {
            try {
                System.out.println("------- -1 per uscire ------");
                System.out.println("------- inserisci i km percorsi-------");
                double km = scanner.nextDouble();
                if (km == -1) {
                    System.out.println("------ CHIUSURA------");
                    flag = false;
                } else if (km < 0) {
                    throw new ValoreLitriNonValidoExeption("valori negativi non validi");
                } else {
                    System.out.println("------- inserire i litri consumati------");
                    double litri = scanner.nextDouble();

                    if (litri == -1) {
                        System.out.println("------ CHIUSURA ------");
                        flag = false;
                    } else if (litri == 0) {
                        throw new ValoreLitriNonValidoExeption("divisione per zero non valida (cambia numero)");
                    } else if (litri < 0) {
                        throw new ValoreLitriNonValidoExeption("valori negativi non validi");

                    } else {
                        double ratio = km / litri;
                        System.out.println(ratio + "km/L");

                    }
                }


            } catch (ValoreLitriNonValidoExeption e) {
                System.out.println("ERRORE:" + " " + e.getMessage());

            } catch (RuntimeException e) {
                System.out.println("inserisci un numero valido");
                scanner.nextLine();
            }


        }
    }
}
