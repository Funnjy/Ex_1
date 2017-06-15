/**
 * Created by Anton Ilchenko on 04.06.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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

    public void writeDataToFile(String fileName){

        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))){
            //String input = tittel.getText();

            //out.writeUTF("sdasd"); //Dette her fungerer helt OK.
            out.writeUTF(tittel.getText()); //Fungerer ikke, men begge to er String da.
            out.close();
        }
        catch(IOException e){
            System.out.println("Problem with file.\n");
        }
    }

    public void showDataFromFile(String fileName){
        String coffe;
        try(DataInputStream in = new DataInputStream(new FileInputStream(fileName))){
                coffe = in.readUTF();
                utskrift.append("Registrert i file" + coffe);
        }
        catch (EOFException e){
            //utskrift.append("ss");
        }
        catch (FileNotFoundException fnfe){
            System.out.print("File not found");
            return;
        }
        catch (IOException e){
            System.out.println("Was not able to read from file");
        }
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
            if(e.getSource() == tittel){
                setInnCoffe();

                writeDataToFile("testfile.dta");
                showDataFromFile("testfile.dta");
            }
            else if (e.getSource() == skrivUt) skrivCoffeListe();
        }
    }
}
