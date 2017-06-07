/**
 * Created by Anton Ilchenko on 04.06.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPSTest extends JFrame{
    public CoffeList coffeList;
    private JTextField tittel;
    private JButton skrivUt;
    private JTextArea utskrift;
    private Kommandolytter lytter;

    public CPSTest(){
        super("Testing");
        coffeList = new CoffeList();

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("New Coffe: "));

        tittel = new JTextField(25);
        c.add(tittel);

        skrivUt = new JButton("Show coffe");
        c.add(skrivUt);

        utskrift = new JTextArea(10,30);
        utskrift.setEditable(false);
        c.add(utskrift);

        c.add(new JScrollPane(utskrift));

        lytter = new Kommandolytter();

        tittel.addActionListener(lytter);
        skrivUt.addActionListener(lytter);

        setSize(400,300);
        setVisible(true);
    }

    public void setInnCoffe(){
        Coffe ny = new Coffe(tittel.getText());
        coffeList.settInn(ny);
        tittel.setText("");
    }

    public void skrivCoffeListe(){
        utskrift.setText(coffeList.toString());
    }

    private class Kommandolytter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == tittel) setInnCoffe();
            else if (e.getSource() == skrivUt) skrivCoffeListe();
        }
    }
}
