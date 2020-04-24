package Schema_relaterat;
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
    
}
