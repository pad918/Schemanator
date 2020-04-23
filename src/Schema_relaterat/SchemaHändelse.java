package Schema_relaterat;
/*
 * @author Måns Abrahamsson
 */
public class SchemaHändelse {
    TidPunkt startTid;
    TidPunkt slutTid;
    
    public SchemaHändelse(TidPunkt start, TidPunkt slut){
        startTid=start;
        slutTid=slut;
        startTid.skrivTid();
        slutTid.skrivTid();
    }
    
}
