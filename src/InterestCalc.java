public class InterestCalc {
    public static void main(String[] args) {
        //Variablen
        float kontostand = 2000;
        float rate = 2;
        int duration = 10;
        float kontostandNeu;
        float interrest;

        for (int i = 1; i <= duration; i++) {
            interrest = kontostand / 100 * rate;
            kontostandNeu = kontostand + interrest;
            System.out.println("Kontostand im " + i + ". Jahr ist " +kontostandNeu );
            kontostand = kontostandNeu;
        }

    }
}