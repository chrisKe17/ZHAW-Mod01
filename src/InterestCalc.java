import java.util.Scanner;


public class InterestCalc {
    public static void main(String[] args) {
        System.out.println("Welche Laufzeit: ");
        Scanner scanner = new Scanner(System.in); //scanner initalisieren und befüllen
        int duration = scanner.nextInt();

        System.out.println("Welcher Betrag: ");
        scanner = new Scanner(System.in); //Variabel scanner erneut befüllen, resp. überschreiben
        float kontostand = scanner.nextInt();

        float rate = 2;

        for (int i = 1; i <= duration; i++) {
            float interrest = kontostand / 100 * rate;
            float kontostandNeu = kontostand + interrest;
            System.out.println("Kontostand im " + i + ". Jahr ist " +kontostandNeu );
            kontostand = kontostandNeu;
        }

    }
}