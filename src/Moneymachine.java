import java.util.Scanner;

public class Moneymachine {
    public static void main(String[] args) {
        //Variablen
        int requestAmount = 0;
        int restAmount=0;
        int anzHundert;
        int anzFuenfzig;
        int anzZwanzig;
        int anzZehn;
        int anzEiner;

        Scanner eingabe1 = new Scanner(System.in);
        System.out.println("Wieviel möchten Sie abheben? Bitte ganzzahligen Betrag eingeben: ");
        requestAmount = eingabe1.nextInt();

        anzHundert = requestAmount/100;
        restAmount = requestAmount%100;

        anzFuenfzig = restAmount/50;
        restAmount = restAmount%50;

        anzZwanzig = restAmount/20;
        restAmount = restAmount%20;

        anzZehn = restAmount/10;
        restAmount = restAmount%10;

        anzEiner = restAmount;

        System.out.println("Anzahl 100: " +anzHundert);
        System.out.println("Anzahl  50: " +anzFuenfzig);
        System.out.println("Anzahl  20: " +anzZwanzig);
        System.out.println("Anzahl  10: " +anzZehn);
        System.out.println("Anzahl   1: " +anzEiner);

    }
}