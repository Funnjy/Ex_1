import javax.swing.*;

/**
 * Created by Anton on 20.04.2017.
 */
public class Meteorologi {
    public static void main(String args[]){

        //Variables definition
        String numString, mnd;
        int år, antallDager, min, maks, n;
        int[] miTemp, maTemp, nedb;
        boolean boo = true;

        //User input: mnd name, år
        mnd = JOptionPane.showInputDialog(null, "Les inn månedens navn");
        numString = JOptionPane.showInputDialog(null, "Les inn nåværende år");

        //String to int convert
        år = Integer.parseInt(numString);

        //User input: number of days
        numString = JOptionPane.showInputDialog(null, "Les inn antall dager i måned");

        //String to int convert
        antallDager = Integer.parseInt(numString);

        miTemp = new int[antallDager];
        maTemp = new int[antallDager];
        nedb = new int[antallDager];

        int wInt = 0;
        while(wInt < antallDager){

            //User input: min temp, maks temp, nedbør
            numString = JOptionPane.showInputDialog(null, "Les inn minimum temperatur for dag " + (wInt+1));
            min = Integer.parseInt(numString);
            numString = JOptionPane.showInputDialog(null, "Les inn maksimum temperatur for dag " + (wInt+1));
            maks = Integer.parseInt(numString);
            numString = JOptionPane.showInputDialog(null, "Les inn nedbør for dag " + (wInt+1));
            n = Integer.parseInt(numString);

            //Check parameters
            if(min > maks){
                JOptionPane.showMessageDialog(null, "Minimum temperatur kan ikke være større en maksimum");
                boo = false;
            }
            else if(min < -40 || min > 50 || maks < -40 || maks > 50){
                JOptionPane.showMessageDialog(null, "Min/maks temperature range er invalid");
                boo = false;
            }
            else if(n < 0 || n > 40){
                JOptionPane.showMessageDialog(null, "Nedbær er invalid range");
                boo = false;
            }

            if(boo){
                miTemp[wInt] = min;
                maTemp[wInt] = maks;
                nedb[wInt] = n;
                wInt++;
            }
        }

        //Create Statistikk obj
        Statistikk myStatistikk = new Statistikk(mnd, år, miTemp, maTemp, nedb);

        //Text boxt
        JTextArea resutltat = new JTextArea();

        //Fill textbox with information
        myStatistikk.værStatistikk(resutltat);

        //Show resultat
        JOptionPane.showMessageDialog(null, resutltat, "Statistikk", JOptionPane.INFORMATION_MESSAGE);

    }
}
