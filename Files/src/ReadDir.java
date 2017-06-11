/**
 * Created by Anton Ilchenko on 11.06.2017.
 */
import java.io.*;

public class ReadDir {

    public static void main(String args[]) {
        File file = null;
        String[] paths;

        try{
            //Create new file object
            file = new File("\\tmp");

            //array of files and directory
            paths = file.list();

            for (String path: paths){
                System.out.print(path);
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
