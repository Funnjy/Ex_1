/**
 * Created by Anton on 23.04.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Workouttestvindu extends JFrame implements ActionListener{

    //Input fields
    private JLabel skrivefelttekst;
    private JTextField øvelse;

    //Output fields
    private JTextArea output;

    //Buttons
    private JButton ok;


    public Workouttestvindu(){

        super("Remembering windows");

        //Container
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //Set properties input fields
        skrivefelttekst = new JLabel("Navngi øvelse:");
        øvelse = new JTextField(10);
        øvelse.addActionListener(this);

        //Set size of output JTextArea and another properties
        output = new JTextArea(10,30);
        output.setEditable(false);
        output.setTabSize(5);

        //Make it possible to scroll
        JScrollPane scroll = new JScrollPane(output);

        //Add components to container c
        c.add(skrivefelttekst);
        c.add(øvelse);
        c.add(scroll);

        output.setText("Oversikt over navngitt øvelser");


        //Window size
        setSize(650, 300);

        //Make window visible
        setVisible(true);
    }

    //Listener method
    public void actionPerformed(ActionEvent e){

        String input = øvelse.getText();

        output.append(input + "\n");
    }
}
