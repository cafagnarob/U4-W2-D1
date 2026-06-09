package es1;

import exeption.PosizioneNonValidaExeption;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayDiNumeri = new int[5];
        Random random = new Random();

        for (int i = 0; i < arrayDiNumeri.length; i++) {

            arrayDiNumeri[i] = random.nextInt(10) + 1;

        }

        boolean flag = true;

        while (flag) {


            System.out.println(Arrays.toString(arrayDiNumeri));
            System.out.println("------- Modifica l'array-------");

            try {
                System.out.println("---- inserisci un nuovo numero------");
                int nuovoValore = Integer.parseInt(scanner.nextLine());

                System.out.println("-----Inserisci la posizione (1-" + (arrayDiNumeri.length) + ") oppure 0 per uscire: ------");
                int nuovaPosizione = Integer.parseInt(scanner.nextLine());


                if (nuovaPosizione < 0 || nuovaPosizione > arrayDiNumeri.length) {
                    throw new PosizioneNonValidaExeption("la posizione" + nuovaPosizione + " non è valida");

                } else if (nuovaPosizione == 0) {
                    System.out.println("------CHIUSURA-------");
                    flag = false;
                } else {
                    arrayDiNumeri[nuovaPosizione - 1] = nuovoValore;

                }

            } catch (PosizioneNonValidaExeption e) {
                System.out.println("Errore" + e.getMessage());

            } catch (Exception e) {
                System.out.println("inserire un numero valido");
            }
            
            System.out.println("---- inserisci un nuovo numero------");


        }


    }

}
