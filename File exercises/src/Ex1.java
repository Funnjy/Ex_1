import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Anton Ilchenko on 14.06.2017.
 */

/*Exercise text :
* Lag et program som teller og skriver ut hvor mange blanke tegn (mellomrom) og hvor mange tegn totalt som finnes
* i en tekstfil. Fil skal velges ved hjelp av en JFileChooser. De opptelte antall tegn og blanke tegn skal skrives
* ut i hvert sitt tekstfelt. Bruk et FileReader-objekt ved fil-lesing. Programmet skal behandle eventuelle
* unntakssituasjoner som kan tenkes å oppstå.
*/

public class Ex1 extends JFrame {

    private JTextArea blankOutput, signOutput;

    public Ex1() {
        super("Calculate blank fields and symbols");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        blankOutput = new JTextArea(10,10);
        signOutput = new JTextArea(10,10);

        blankOutput.setEditable(false);
        signOutput.setEditable(false);

        c.add(blankOutput);
        c.add(signOutput);

        setSize(350,350);
        setVisible(true);
    }

    public String choseFile(){

        String fileName;
        JFileChooser filChoser = new JFileChooser();
        filChoser.setCurrentDirectory(new File("."));
        int output = filChoser.showOpenDialog(this);

        if(output == JFileChooser.APPROVE_OPTION){

            File f = filChoser.getSelectedFile();
            fileName = f.getName();
            return fileName;

        }else
            return "ERROR!";
    }

    public void countBlankSymb(String fileName) throws IOException{
        FileReader inText;

        try{
            inText = new FileReader(fileName);
        }
        catch (FileNotFoundException e){
            System.out.print("File not found!" + fileName);
            return;
        }

        int i;
        int blank = 0;
        int symb = 0;
        do {
            i = inText.read();
            if(String.valueOf((char)i).equals(" ")){
                blank++;
            }else if(i != -1) symb ++;
        }while (i != -1);
        blankOutput.append("Total spaces: " + blank);
        signOutput.append("Total symbols: " + symb);
    }
}
