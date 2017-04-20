import javax.swing.*;

/**
 * Created by Anton on 19.04.2017.
 */
public class Driver {
    public static void main(String args[]){
        String num_string;
        int startverdi, makspotens, antall;

        //Startverdi user input
        num_string = JOptionPane.showInputDialog(null, "Velg start verdi:");
        startverdi = Integer.parseInt(num_string);

        //Makspotens user input
        num_string = JOptionPane.showInputDialog(null, "Velg antall potens:");
        makspotens = Integer.parseInt(num_string);

        //Antall user input
        num_string = JOptionPane.showInputDialog(null, "Velg antall:");
        antall = Integer.parseInt(num_string);

        //Create instance of ExtendedEx3
        ExtendedEx3 potenstabel = new ExtendedEx3();

        //Call to methid
        potenstabel.potenser(startverdi,makspotens,antall);

        //Output
        JOptionPane.showMessageDialog(null, potenstabel.get_textbox(), "Table", JOptionPane.INFORMATION_MESSAGE);

    }
}
