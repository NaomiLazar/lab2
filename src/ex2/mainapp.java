package ex2;

import java.util.Scanner;

public class mainapp {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Citim șirul inițial de la tastatură
    System.out.print("Introduceți șirul de caractere inițial: ");
    String sirInitial = scanner.nextLine();

    // Creăm un StringBuilder pe baza șirului inițial
    StringBuilder sb = new StringBuilder(sirInitial);

    // Citim șirul pe care dorim să-l inserăm
    System.out.print("Introduceți șirul de inserat: ");
    String sirDeInserat = scanner.nextLine();

    // Citim poziția unde dorim să inserăm șirul
    System.out.print("Introduceți poziția de inserare: ");
    int pozitieInserare = scanner.nextInt();
    scanner.nextLine();  // Consumăm newline-ul rămas

    // Inserăm șirul la poziția specificată
    if (pozitieInserare >= 0 && pozitieInserare <= sb.length()) {
        sb.insert(pozitieInserare, sirDeInserat);
        System.out.println("Șirul după inserare: " + sb.toString());
    } else {
        System.out.println("Poziția de inserare este invalidă.");
    }

    // Citim poziția de unde dorim să ștergem caracterele
    System.out.print("Introduceți poziția de unde să înceapă ștergerea: ");
    int pozitieStergere = scanner.nextInt();

    // Citim numărul de caractere care trebuie șterse
    System.out.print("Introduceți numărul de caractere de șters: ");
    int numarCaractereDeSters = scanner.nextInt();

    // Ștergem caracterele de la poziția specificată
    if (pozitieStergere >= 0 && pozitieStergere < sb.length()) {
        int finalStergere = Math.min(pozitieStergere + numarCaractereDeSters, sb.length());
        sb.delete(pozitieStergere, finalStergere);
        System.out.println("Șirul după ștergere: " + sb.toString());
    } else {
        System.out.println("Poziția de ștergere este invalidă.");
    }

    scanner.close();
}
}
