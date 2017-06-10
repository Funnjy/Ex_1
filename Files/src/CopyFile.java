import java.io.*;

/**
 * Created by Anton Ilchenko on 11.06.2017.
 */
public class CopyFile{

    public static void main(String args[]) throws IOException {
        //FileInputStream in = null;
        //FileOutputStream out = null;
        FileReader in = null;
        FileWriter out = null;

        try {
            //in = new FileInputStream("input.txt");
            //out = new FileOutputStream("output.txt");
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}

