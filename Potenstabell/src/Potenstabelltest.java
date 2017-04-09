/**
 * Created by Anton Ilchenko on 03.04.2017.
 */
import javax.swing.*;

public class Potenstabelltest {
    public static void main(String[]args){
        int tall = (int) (Math.random() * 100);
        String h_input;
        Potenstabell ptabell = new Potenstabell();

        h_input = JOptionPane.showInputDialog(null, "Write your text");

        ptabell.set_text(h_input);

        JOptionPane.showMessageDialog(null, ptabell.get_textarea(), "Testing JText Area",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
