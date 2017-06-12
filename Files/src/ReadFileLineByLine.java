import java.io.*;


/**
 * Created by Anton on 12.06.2017.
 */
public class ReadFileLineByLine {

    public static void main(String args[]) throws IOException{
        try(BufferedReader inText = new BufferedReader(new FileReader("testCoffeFile.txt"))){
            System.out.print("File testsCoffeFile.txt conteins \n");
            //read lines until file ends
            String innLine = null;
            do {
                innLine = inText.readLine();
                if(innLine != null){
                    System.out.print(innLine + " 'chenge line'\n");
                }
            }while (innLine != null);
        }
        catch (FileNotFoundException e){
            System.out.print("Finner ikke file testCoffeFile.txt");
        }
    }
}
