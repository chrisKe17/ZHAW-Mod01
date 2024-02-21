import java.util.Scanner;

public class SpeedCalc {
    public static void main(String[] args) {
        //Variablen
        float speed =0;
        float totalDist;
        float reactDist = 0;
        float stoppDist =0;

        Scanner eingabe1 = new Scanner(System.in);
        System.out.println("Geben Sie die Geschwindigkeit in km/h ein: ");
        speed = eingabe1.nextFloat();

        reactDist = 3*(speed/10);
        stoppDist = (speed/10)*(speed/10);
        totalDist = reactDist + stoppDist;

        System.out.println("totalDist in m = " + totalDist);
        System.out.println("stoppDist in m = " + stoppDist);
        System.out.println("reactDist in m = " + reactDist);

    }
}