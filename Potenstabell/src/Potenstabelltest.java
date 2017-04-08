/**
 * Created by Anton Ilchenko on 03.04.2017.
 */
import javax.swing.*;

public class Potenstabelltest {
    public static void main(String[]args){
        String human_input;
        int tall = (int) (Math.random() * 100);
        Potenstabell ptabell = new Potenstabell();

        //ptabell.textarea.setText("Tekst\t tekst2 \n");
        human_input = JOptionPane.showInputDialog(null, "Write your tex here");

        ptabell.set_Text(human_input);

        JOptionPane.showMessageDialog(null,/*ptabell.textarea*/ptabell.get_textarea(),"Informasjon", JOptionPane.INFORMATION_MESSAGE);
    }
}
