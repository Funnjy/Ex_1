import javax.swing.*;

/**
 * Created by Anton on 19.04.2017.
 */
public class Driver {
    public static void main(String args[]){
        ExtendedEx3 potenstabel = new ExtendedEx3();
        potenstabel.potenser(1,5,10);
         JOptionPane.showMessageDialog(null, potenstabel.get_textbox(), "Table", JOptionPane.INFORMATION_MESSAGE);

    }
}
