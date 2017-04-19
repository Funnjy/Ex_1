/**
 * Created by Anton Ilchenko on 03.04.2017.
 */
import javax.swing.*;

public class Potenstabelltest {
    public static void main(String[]args){
        int tall = (int) (Math.random() * 100);
        String h_input;
        int m = 100, s = 0;
        int nm = m, ns = s;
        //Create new Potenstabell
        Potenstabell ptabell = new Potenstabell();

        //Toptext for text area
        ptabell.set_text("Tall\n");

        for(int i = 1; i < 100; i++){
            tall = (int) (Math.random() * 100);
            if(m == -1) m = tall;
            if(s == -1) s = tall;

            if(i%10 != 0 /*|| i == 0*/) {
                ptabell.textarea.append(tall + "\t");
            }
            else{
                ptabell.textarea.append(tall +"\n");
            }

            if(tall < m ){
                nm = m;
                m = tall;
            }else if( tall < nm && tall > m) nm = tall;

            if(tall > s){
                ns = s;
                s = tall;
            }else if(tall > ns && tall < s) ns = tall;
        }

        ptabell.textarea.append("\n\nMinst: " + m
                + ", Nest Minst: " + nm
                + ", Størst: " + s
                + ", Nest Størst: " + ns);
        //h_input = JOptionPane.showInputDialog(null, "Write your text");
        //ptabell.set_text(h_input);

        //Show table of all numbers
        JOptionPane.showMessageDialog(null, ptabell.get_textarea(), "Testing JText Area",
                JOptionPane.INFORMATION_MESSAGE);


    }

}
