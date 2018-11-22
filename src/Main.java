import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {

        String name  = JOptionPane.showInputDialog("Bitte Name eingeben:");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Bitte Alter eingeben:"));

        if ( alter >= 18 ){
            JOptionPane.showMessageDialog(null,"Sie sind volljährig und " + alter + " Jahre alt!");
        } else {
            JOptionPane.showMessageDialog(null,"Sie sind nicht volljährig und " + alter + " Jahre alt!");
        }

    }

}
