import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;

/**
 * Created by Anton on 19.04.2017.
 */
public class ExtendedEx3 {
    JTextArea text = new JTextArea();

    public int power(int x, int y){
        return x*y;
    }

    public void potenser(int startverdi, int makseksponent, int antall){
        int h = 1;
        int potens = 1;

        while( h < makseksponent){
            text.append(h + ". potens\t");
            h++;
            if( h == makseksponent)
                text.append(h + ". potens\n");
        }

        int n= 0;

        for(int i = startverdi; i < antall; i ++){
            potens = i;

            while(n < makseksponent){

                if(n != 0){
                    text.append(i * potens + "\t");
                    potens = potens * i;
                }
                else {
                    text.append(i + "\t");
                }

                n++;
                if(n == makseksponent) {
                    text.append("\n");
                }

            }
            n = 0;
            /*for(int n = 1; n <= makseksponent; n++ ) {
                if(i == 1){
                    text.append(i + "\t");
                }

                else if(n == 1){
                    text.append(i + "\t");
                }

                else{
                    text.append(i * h  + "\t");
                    h += i;
                }
            }*/

            text.append("\n");

        }
    }

    public JTextArea get_textbox(){
        return text;
    }
}
