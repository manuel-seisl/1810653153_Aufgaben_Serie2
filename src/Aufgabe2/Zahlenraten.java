package Aufgabe2;

import java.util.Random;

public class Zahlenraten
{

    public static void main(String[] args)
    {

        int min = 1;
        int max = 10;

        Random rnd = new Random();

        // Es wird eine zufällige Zahl zwischen 1 - 10 ausgegeben

        int zufallszahl = rnd.nextInt(max - min + 1) + min;

        if ( zufallszahl % 2 == 0 ){
            System.out.println("Die Zufallszahl ist gerade und ist: " + zufallszahl);
        } else {
            System.out.println("Die Zufallszahl ist ungerade und ist: " + zufallszahl);
        }

    }

}
