import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anton on 20.04.2017.
 */
public class Meteorologi extends JFrame implements ActionListener {

    enum Måneder {JANUAR, FEBRUAR, MARS, APRIL, MAI, JUNI, JULI, AUGUST, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER, UKJENTMÅNED};

    //Lables
    private JLabel d, m, å;

    //Input fields
    private JTextField input1, input2, input3;

    //Output fields
    private JTextArea utskrift;

    //Buttons and controls
    private JButton enter;

    public Meteorologi(){

        super("Meteorologi logg");

        //Output area
        utskrift = new JTextArea(10,30);
        utskrift.setEditable(true);
        JScrollPane scrollUtskrift = new JScrollPane(utskrift);

        //Input area
        input1 = new JTextField(10);
        input2 = new JTextField(10);
        input3 = new JTextField(10);

        //Button listener
        //enter.addActionListener(this);

        //Labels
        d = new JLabel("Opggi dato:");
        m = new JLabel("Oppgi måned:");
        å = new JLabel("Oppgi år");

        //Buttons
        enter = new JButton("Enter");
        enter.addActionListener(this);

        //Containers
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(d);
        c.add(input1);

        c.add(m);
        c.add(input2);

        c.add(å);
        c.add(input3);

        c.add(utskrift);
        c.add(enter);

        utskrift.setText("Registrert informasjon:\n");
    }

    //Check if year is leap year
    public static boolean skuddår(int årstall){
        if (årstall%4 == 0  && årstall%400 == 0){
            return true;
        }
        else
            return false;
    }

    //Return amount of days in given month based on which year user give
    public static int månedsdager(int måned, int år){
        if(måned < 1 || måned > 12){
            JOptionPane.showMessageDialog(null, "Parameter måned kan ikke vare mindre enn 1 eller større en 12");
            return -1;
        }
        if(måned == 2){
            if (skuddår(år) == false){
                return 28;
            }
            else if(skuddår(år) == true){
                return 29;
            }
        }
        if(måned%2 == 0){
            return 30;
        }
        else return 31;
    }

    //Return true if given date is valid based on month and year
    public static boolean okDato(int dag, int mnd, int år){
        if (dag > 1 && dag <= månedsdager(mnd, år)){
            return true;
        }
        return false;
    }

    //Return manth name based on user input. Returns *ukjent måned" if input is invalid
    public static Måneder månedsnavn(int mnd){
        Måneder januar, februar, mars, april, mai, juni, juli, august, september, oktober, november, desember, ukjent;

        //Declare month
        januar = Måneder.JANUAR; februar = Måneder.FEBRUAR; mars = Måneder.MARS;
        april = Måneder.APRIL; mai = Måneder.MAI; juni = Måneder.JUNI;
        juli = Måneder.JULI; august = Måneder.AUGUST; september = Måneder.SEPTEMBER;
        oktober = Måneder.OKTOBER; november = Måneder.NOVEMBER; desember = Måneder.DESEMBER;
        ukjent = Måneder.UKJENTMÅNED;

        Måneder[] måned_array = new Måneder[]{januar,februar,mars,april,mai,juni,juli,august,september,oktober,november,desember, ukjent};

        if(mnd > 12 ||  mnd < 1){
            return måned_array[måned_array.length-1];
        }
        return måned_array[mnd];
    }

    //Take STRING and convert it to numbers. Then make answer
    public static int date_format(String date){

        int dato, mnd, y;

        JOptionPane.showInputDialog("Skriv dato (dd.mm.åååå); ");

        dato = Integer.parseInt(date.substring(0,2));
        if(dato < 1 || dato > 31) {
            JOptionPane.showInputDialog("Dato verdi er ugyldig!");
            return -1;
        }

        mnd = Integer.parseInt(date.substring(3,5));
        if(mnd < 1 || mnd > 12){
            JOptionPane.showInputDialog("Måned verdi er ugyldig!");
            return -1;
        }

        y = Integer.parseInt(date.substring(6));

        JOptionPane.showMessageDialog(null, "" + dato + " " + månedsnavn(mnd)+ " " + y);
        return 1;
    }

    public void actionPerformed(ActionEvent e){
        String dag, måned, år;

        dag = input1.getText();
        måned = input2.getText();
        år = input3.getText();

        utskrift.append("I dag er " + dag + "/" + måned + "/" + år + "\n" );
    }
}
