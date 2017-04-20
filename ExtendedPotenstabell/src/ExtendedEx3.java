import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;

/**
 * Created by Anton on 19.04.2017.
 */
public class ExtendedEx3 {

    //Definition of variables needed
    private int potens;
    private int n= 0;
    private JTextArea text = new JTextArea();

    //Calculate and return potens
    public int power(int x, int y){
        return x*y;
    }

    //Create table formed output
    public void potenser(int startverdi, int makseksponent, int antall){
        int h = 1;

        //Create header for text area
        while( h < makseksponent){
            text.append(h + ". potens\t");
            h++;
            if( h == makseksponent)
                text.append(h + ". potens\n");
        }

        //For loop going through "antall" variables and calculate potens
        for(int i = startverdi; i <= antall; i ++){
            potens = i;

            //Calculate and append maks potens
            while(n < makseksponent){
                //If not 1.potens do this
                if(n != 0){
                    text.append(i * potens + "\t");
                    potens = power(potens, i);
                }

                //If 1.st potens do not calculate
                else {
                    text.append(i + "\t");
                }

                //New line after
                if(n == makseksponent) {
                    text.append("\n");
                }
                n++;
            }
            n = 0;
            text.append("\n");
        }
    }

    //Return JTextArea
    public JTextArea get_textbox(){
        return text;
    }
}
