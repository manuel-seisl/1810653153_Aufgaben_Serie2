package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten
{

    public static void main(String[] args) {

        String zahl = JOptionPane.showInputDialog("Bitte Zahl zwischen 1 und 10 eingeben:");

        int min = 1;
        int max = 10;

        Random rnd = new Random();

        // Es wird eine zufällige Zahl zwischen 1 - 10 ausgegeben

        int zufallszahl = rnd.nextInt(max - min + 1) + min;

        /*if ( zufallszahl % 2 == 0 ){
            System.out.println("Die Zufallszahl ist gerade und ist: " + zufallszahl);
        } else {
            System.out.println("Die Zufallszahl ist ungerade und ist: " + zufallszahl);
        }*/

        // Nicht möglich, da von der Usereingabe ein String und kein Integer Wert kommt
        /*if ( zahl == zufallszahl ){

        }*/

        int gerZahl = Integer.parseInt(zahl);

        if (gerZahl == zufallszahl) {
            JOptionPane.showMessageDialog(null, "Sie haben die Zahl erraten!" + zufallszahl);
        } else if ( (zufallszahl - gerZahl) <= 2 && (zufallszahl - gerZahl) >= -2 ){
            JOptionPane.showMessageDialog(null, "Sie sind +2 oder -2 an der Zahl dran! " + zufallszahl);
        } else {
            JOptionPane.showMessageDialog(null, "Sie haben die Zahl nicht erraten!" + zufallszahl);
        }

    }

}
