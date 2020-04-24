package Schema_relaterat;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Måns Abrahamsson
 */
public class SchemaHanterare {
    ArrayList<SchemaHändelse> händelser = new ArrayList<SchemaHändelse>();
    public SchemaHanterare(){
        //Skapa exempel händelse Matte lektion 1
        SchemaHändelse h1;
        h1=new SchemaHändelse(new TidPunkt(2020,4,24,10,0),new TidPunkt(2020,4,24,11,0),
                "Matte", "Läxhjälp med Viggo");
        händelser.add(h1);
        händelser.add(new SchemaHändelse(new TidPunkt(2020,4,25,9,0),new TidPunkt(2020,4,25,11,0),
                "Svenska", "GÖR KLART SVENSKAN NU VIGGO"));
    }
    public void sparaSchema(){ // INTE KLAR
        //Sparar schemat till en textfil med ett eget scripting språk
        try {
            FileWriter skrivare = new FileWriter("schemat1.txt");
            // Kod för att skriva till filen
            skrivare.write("# Skriven i Schema script v0_01");
            for(int i=0; i<händelser.size(); i++){
                //SKRIV IN ALL INFORMATION
            }
            skrivare.write("Det fungerererer typ !!! LULs");
            //Stänger filen när den är klar
            skrivare.close();
            System.out.println("Skrev till filen");
        } 
        catch (IOException e) {
            System.out.println("Ett fel uppstod");
            e.printStackTrace();
        }
        
    }
    
    public void skrivUtAllaHändelser(){ // För debugging främst
        for(int i=0; i<händelser.size();i++){
            System.out.println("----------------------");
            System.out.println(händelser.get(i).händelseNamn);
            händelser.get(i).startTid.skrivTid();
            System.out.println("och");
            händelser.get(i).slutTid.skrivTid();
            System.out.println("Beskrivning:");
            System.out.println(händelser.get(i).händelseBeskrivning);
        }
        System.out.println("----------------------");
    }
    public void dö(){
        System.out.println("UPS... Han dogade");
    }
    
}
