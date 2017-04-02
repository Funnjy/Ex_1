import javax.swing.*;

/**
 * Created by Anton Ilchenko on 30.03.2017.
 */
public class WorkoutBook {
    private String musclegroup, repetitions, sets;

    public WorkoutBook(String m, String r, String s){
        musclegroup = m;
        repetitions = r;
        sets = s;
    }

    public void set_group(String group){ //set group
        musclegroup = group;
    }
    public void set_repetitions(String r){ //set repetitions
        repetitions = r;
    }
    public void set_sets(String s){ //set sets
        sets = s;
    }

    public String get_group(){ //Return sets
        return musclegroup;
    }

    public String get_repetitions(){    //Return repetitions
        return repetitions;
    }

    public String get_sets(){ //return sets
        return  sets;
    }

    public void visGroup(){
        JOptionPane.showMessageDialog(null, "Muscle group is " + musclegroup);
    }
}
