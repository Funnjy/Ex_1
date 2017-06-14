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

* For å sjekke om et tegn er et blankt tegn, kan du bruke metoden Character.isSpaceChar( tegn ), der parameteren
* tegn er av datatype char. (Linjeskifttegn blir da også regnet som blanke tegn, men det godtas i denne oppgaven.)*/

public class Ex1 extends Component {

    public Ex1(){
        JFileChooser filChoser = new JFileChooser();
        filChoser.setCurrentDirectory(new File("."));
        int output = filChoser.showOpenDialog(this);
    }

    public static void countBlankSymb(String fileName) throws IOException{
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
        System.out.print("Blank = : " + blank + "\nSymbols = : " + symb);
    }

    public static void main(String args[]) throws IOException {
        //Ex1 ex1 = new Ex1();
        countBlankSymb("testCoffeFile.txt");

    }
}
