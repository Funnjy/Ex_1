import java.io.IOException;

/**
 * Created by Anton Ilchenko on 15.06.2017.
 */

import javax.swing.*;

public class Ex1Driver {
    public static void main(String args[]) throws IOException {
        Ex1 e = new Ex1();
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        e.countBlankSymb( e.choseFile());
    }
}
