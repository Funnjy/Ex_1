import javax.swing.*;

/**
 * Created by Anton on 30.03.2017.
 */
public class Exercise_2test{
    public static void main(String[] args) {

        Exercise_2 bok = new Exercise_2();
        String input = JOptionPane.showInputDialog("Skriv inn kursnavn");

        bok.setKursnavn(input);
        bok.visTittel();
    }
}
