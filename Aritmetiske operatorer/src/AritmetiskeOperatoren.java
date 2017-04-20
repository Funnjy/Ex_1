import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by Anton on 20.04.2017.
 */
public class AritmetiskeOperatoren {
    public static void main(String args[]){
        String num_string;
        int verdi1, verdi2, verdi3, verdi4, verdi5, temp;

        num_string = JOptionPane.showInputDialog(null, "Skriv in 5 siffer tall");

        //Check if user input is right
        if(num_string.length() < 5 || num_string.length() > 5){
            JOptionPane.showMessageDialog(null, "Tall må vare 5 siffer!");
            return;
        }

        temp = Integer.parseInt(num_string);

        verdi1 = temp%10;
        temp/=10;

        verdi2 = temp%10;
        temp/=10;

        verdi3 = temp%10;
        temp/=10;

        verdi4 = temp%10;
        temp/=10;

        verdi5= temp%10;
        temp/=10;

        JOptionPane.showMessageDialog(null, verdi1+"    "
                                                            +verdi2+"   "
                                                            +verdi3+"   "
                                                            +verdi4+"   "
                                                            +verdi5+"   ");
    }
}
