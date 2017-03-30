import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;

/**
 * Created by Anton Ilchenko on 30.03.2017.
 */
public class Exercise_2 {

    private String kursnavn;

    public void setKursnavn(String navn){
        kursnavn = navn;
    }

    public String getKursnavn(){
        return kursnavn;
    }

    public void visTittel(){
        JOptionPane.showMessageDialog(null, "Kursnavn er " + kursnavn);
    }
}
