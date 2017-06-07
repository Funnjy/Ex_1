import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by Anton on 03.06.2017.
 */
public class UserGUI extends JFrame {
    private JTextArea utskrift;
    private JTextField name, tlf, email;
    private JButton bestill;
    private Kommandolytter lytter;

    public UserGUI(){
        super("UserGUI");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Velg caffe"));

        name = new JTextField(25);
        name.setText("Enter your name");

        tlf = new JTextField(25);
        tlf.setText("Enter your tlf. number");

        email = new JTextField(25);
        email.setText("Enter your mail");

        c.add(name);
        c.add(tlf);
        c.add(email);

        bestill = new JButton("Bestill");
        c.add(bestill);

        utskrift = new JTextArea(10,30);
        utskrift.setEditable(false);
        c.add(utskrift);

        lytter = new Kommandolytter();
        bestill.addActionListener(lytter);

        setSize(400,300);
        setVisible(true);
    }

    public void sendBestilling(){
        utskrift.setText("Bestilt");
    }

    private class Kommandolytter implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == bestill )
                sendBestilling();
        }
    }

}
