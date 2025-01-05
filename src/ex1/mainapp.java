package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class mainapp {
    public static void main(String[] args) {
        // Numele fișierului de unde citim județele
       // String filename = "judet_in.txt";
        String filename = "judet_in.txt";

        String[] judete = null;

        // Încărcăm datele din fișier într-un tablou de String-uri
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/PC/IdeaProjects/lab2/src/judet_in.txt"));
            judete = reader.lines().toArray(String[]::new);  // Citim toate liniile în tabloul judete
            reader.close();
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
            return;
        }

        // Ordonăm tabloul de județe
        Arrays.sort(judete);

        // Afișăm lista ordonată de județe
        System.out.println("Județele ordonate sunt:");
        for (String judet : judete) {
            System.out.println(judet);
        }

        // Citim un județ de la tastatură
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numele unui județ: ");
        String judetCautat = scanner.nextLine();

        // Căutăm județul în lista ordonată folosind căutarea binară
        int pozitie = Arrays.binarySearch(judete, judetCautat);

        // Verificăm dacă județul a fost găsit
        if (pozitie >= 0) {
            System.out.println("Județul " + judetCautat + " se află pe poziția " + (pozitie + 1) + " în vectorul ordonat.");
        } else {
            System.out.println("Județul " + judetCautat + " nu a fost găsit în listă.");
        }

        scanner.close();
    }
}

