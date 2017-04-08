/**
 * Created by Anton Ilchenko on 03.04.2017.
 */

import javax.swing.JTextArea;
public class Potenstabell {
    int tall = (int) (Math.random() * 100);

    private JTextArea textarea = new JTextArea();

    public void set_text(String text_in){
        textarea.setText(text_in);
    }

    public JTextArea get_textarea(){
        return textarea;
    }

}
