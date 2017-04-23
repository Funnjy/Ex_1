/**
 * Created by Anton on 23.04.2017.
 */
import javax.swing.*;
import java.awt.*;

public class Workouttestvindu extends JFrame {
    private JTextArea output;

    public Workouttestvindu(){

        super("Remembering windows");

        //Container
        Container c = getContentPane();

        //Set size of output JTextArea and another properties
        output = new JTextArea(10,30);
        output.setEditable(false);
        output.setTabSize(5);

        //Make it possible to scroll
        JScrollPane scroll = new JScrollPane(output);

        //Add scroll to container c
        c.add(scroll);

        //Window size
        setSize(300, 150);

        //Make window visible
        setVisible(true);
    }
}
