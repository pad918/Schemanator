package Schema_relaterat;

import java.time.YearMonth;
import java.util.Calendar;

/*
 * @author Måns Abrahamsson
 */
public class SchemaHändelse {
    public TidPunkt startTid;
    public TidPunkt slutTid;
    public String händelseNamn;
    public String händelseBeskrivning;
    public SchemaHändelse(TidPunkt start, TidPunkt slut, String namn, String beskrivning){
        startTid=start;
        slutTid=slut;
        händelseNamn=namn;
        händelseBeskrivning=beskrivning;
    }
    public boolean ärGiltig(){
        if(startTid.årtal<1900 || slutTid.årtal<1900){
            return false;
        }
        if(startTid.månad<1 || startTid.månad>12 || slutTid.månad<1 || slutTid.månad>12){
            return false;
        }
        YearMonth YM = YearMonth.of(startTid.årtal,startTid.månad);
        if(startTid.dag>YM.lengthOfMonth() || startTid.dag<1){
            return false;
        }
        if(startTid.timme>23 || startTid.timme<0 || slutTid.timme>23 || slutTid.timme<0 ){
            return false;
        }
        if(startTid.minut>59 || startTid.minut<0 || slutTid.minut>59 || slutTid.minut<0 ){
            return false;
        }
        return true;
    }
}
