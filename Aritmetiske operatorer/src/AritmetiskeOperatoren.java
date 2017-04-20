import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.lang.reflect.Array;

/**
 * Created by Anton on 20.04.2017.
 */
public class AritmetiskeOperatoren {
    public static void main(String args[]){

        //Variables
        String num_string;
        int verdi1, verdi2, verdi3, verdi4, verdi5, temp;
        int[] array;
        JTextArea text = new JTextArea();

        //User input
        num_string = JOptionPane.showInputDialog(null, "Skriv in 5 siffer tall");

        //Check if user input is right
        /*if(num_string.length() < 5 || num_string.length() > 5){
            JOptionPane.showMessageDialog(null, "Tall må vare 5 siffer!");
            return;
        }*/

        temp = Integer.parseInt(num_string);

        array = new int[num_string.length()];

        //Break number into single digits
        for(int i = 0; temp > 0; i++){
            array[i] = temp%10;
            temp/=10;
        }
        verdi1 = array.length-1;
        //Add results into textbox
        for(int i = 0; i < array.length; i++){
            num_string = Integer.toString(array[verdi1]75);
            text.append(num_string + "    ");
            verdi1--;
        }

        JOptionPane.showMessageDialog(null, text, "Table", JOptionPane.INFORMATION_MESSAGE);


       /*verdi1 = temp%10;
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
                                                            +verdi5+"   ");*/
    }
}
