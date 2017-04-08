/**
 * Created by Anton Ilchenko on 03.04.2017.
 */

import javax.swing.JTextArea;

public class Potenstabell {
    int tall = (int) (Math.random() * 100);

    private JTextArea textarea = new JTextArea();

    public void set_Text(String text){
        textarea.setText(text);
    }

    public JTextArea get_textarea(){
        return textarea;
    }


}
