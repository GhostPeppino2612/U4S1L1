import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Utente inserisci la prima stringa:");
        String firstString = scanner.nextLine();
        System.out.println("Utente inserisci la seconda stringa:");
        String secondstring = scanner.nextLine();
        System.out.println("Utente inserisci la terza stringa:");
        String thirdstring = scanner.nextLine();
        System.out.println(firstString + secondstring + thirdstring);
        System.out.println(thirdstring + secondstring + firstString);
        scanner.close();
    }
}
