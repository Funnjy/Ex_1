import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Anton Ilchenko on 11.06.2017.
 */
public class ShowFile {

    public static void main(String args[]) throws IOException{

        FileReader inText;

        try{
            inText = new FileReader("testCoffeFile.txt");
        }
        catch (FileNotFoundException e){
            System.out.print("File is not found.");
            return;
        }

        System.out.print("File testCoffeFile.txt contains" + "\n");

        int i;
        do {
            i = inText.read(); //read single sign
            if(i != -1) //-1 = file end
                System.out.print(String.valueOf((char)i));
        }while (i != -1);
        inText.close();
    }
}
