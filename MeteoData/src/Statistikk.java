/**
 * Created by Anton on 20.04.2017.
 */
public class Statistikk {

    //Variables definition
    private String måned;
    private int år;
    private int[] minTemp;
    private int[] maxTemp;
    private int[] nedbør;

    //Constructor
    public Statistikk(String mnd, int å, int[] min, int[] max, int[] ned){
        måned = mnd;
        år = å;
        minTemp = min;
        maxTemp = max;
        nedbør = ned;
    }

    //Rainy days that have more then 5mm
    public int regndager(){

        int teller = 0;

        for(int i = 0; i < nedbør.length; i ++){
            if(nedbør[i] > 5){
                teller++;
            }
        }
        return teller;
    }

    //Median temperature of days with more than 5 mm rain
    public double maksTempSnitt(){
        double sumTemp = 0;
        double teller = regndager();

        if(teller == 0){
            return -100.00; //If no such days found
        }

        for(int i = 0; i < maxTemp.length; i++){
            if(nedbør[i] > 5){
                sumTemp += maxTemp[i];
            }
        }
        return sumTemp/teller;
    }

    //Return biggest temperature variation for one day of the month
    public int maksTempVariasjon(){
        int variasjon = 0;

        for (int i = 0; i < minTemp.length; i++){
            if((maxTemp[i]-minTemp[i]) > variasjon){
                variasjon = maxTemp[i]-minTemp[i];
            }
        }

        return variasjon;
    }

    //Return dates which have same temp variation as maximal, and information about how many days it was
    public String maksTempVariasjonDager(){

    }



}
