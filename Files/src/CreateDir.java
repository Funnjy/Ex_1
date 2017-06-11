/**
 * Created by Anton Ilchenko on 11.06.2017.
 */
import java.io.File;
public class CreateDir {

    public static void main(String args[]){
        String dirname = "F:\\JavaExercises\\Ex_1\\Files\\src\\test";
        File d = new File(dirname);

        d.mkdirs();
    }
}
