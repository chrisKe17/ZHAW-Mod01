import java.util.Scanner;

public class SpeedCalc {
    public static void main(String[] args) {

        Scanner eingabe1 = new Scanner(System.in);
        System.out.println("Geben Sie die Geschwindigkeit in km/h ein: ");
        float speed = eingabe1.nextFloat();

        float reactDist = 3*(speed/10);
        float stoppDist = (speed/10)*(speed/10);
        float totalDist = reactDist + stoppDist;

        System.out.println("TotalDist in m = " + totalDist);
        System.out.println("StoppDist in m = " + stoppDist);
        System.out.println("ReactDist in m = " + reactDist);

    }
}