import java.io.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class DataIOTest extends JFrame
{
    private JTextArea utskrift;

    public DataIOTest()
    {
        super("Test av DataOutputStream og DataInputStream");
        utskrift = new JTextArea(10, 40);
        add(new JScrollPane(utskrift));
        pack();
        setVisible(true);
    }

    public void skrivDatafil(String filnavn)
    {
        try (DataOutputStream ut =
                     new DataOutputStream(new FileOutputStream(filnavn)))
        {
            //data som skal skrives til fil
            double[] priser = {99.00, 149.90, 75.50, 223.90, 145.90};
            int[] enheter = {12, 8, 13, 29, 50};
            String[] bok = {"Sandemose: Varulven",
                    "Borgen: Lillelord",
                    "Camus: La peste",
                    "Hugo: Notre-Dame de Paris",
                    "Pasternak: Dr. Zhivago"};

            //utskrift
            for ( int i = 0; i < priser.length; i ++ )
            {
                ut.writeDouble( priser[i] );
                ut.writeInt( enheter[i] );
                ut.writeUTF( bok[i] );
            }
        }
        catch ( IOException e )
        {
            System.out.println("Filproblem.");
        }
    }

    public void visDatafil( String filnavn )
    {
        double pris;
        int enhet;
        String bok;
        double total = 0.0;
        DecimalFormat formatterer = new DecimalFormat("0.00");
        utskrift.setText("Faktura\n");
        //leser data inn igjen fra fila og skriver ut i
        //tekstområde utskrift
        try (DataInputStream inn = new DataInputStream(
                new FileInputStream(filnavn)))
        {
            while (true)
            {
                pris = inn.readDouble();
                enhet = inn.readInt();
                bok = inn.readUTF();
                utskrift.append( "Du har bestilt " +
                        enhet + " enheter av " +
                        bok + " til pris kr. " +
                        formatterer.format( pris ) + "\n" );
                total = total + enhet * pris;
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Finner ikke fil " + filnavn);
            return;
        }
        catch (EOFException e)
        {
            //hele fila er lest, går videre
            utskrift.append("Totalt: kr. " + formatterer.format(total));
        }
        catch (IOException e)
        {
            System.out.println("Problem med lesing fra fil.");
        }
    }

    public static void main(String[] args)
    {
        DataIOTest tester = new DataIOTest();
        tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tester.skrivDatafil("faktura1.dta");
        tester.visDatafil("faktura1.dta");
    }
}