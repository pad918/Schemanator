package Schema_relaterat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Måns Abrahamsson
 */
public class SchemaHanterare {
    public ArrayList<SchemaHändelse> händelser;
    public SchemaHanterare(){
        händelser = new ArrayList<SchemaHändelse>();
        //Skapa exempel händelse Matte lektion 1
        SchemaHändelse h1;
        h1=new SchemaHändelse(new TidPunkt(2020,4,24,10,0),new TidPunkt(2020,4,24,11,0),
                "Matte", "Läxhjälp med Viggo");
        händelser.add(h1);
        händelser.add(new SchemaHändelse(new TidPunkt(2020,4,25,9,0),new TidPunkt(2020,4,25,11,0),
                "Svenska", "GÖR KLART SVENSKAN NU VIGGO"));
    }
    public void hämtaSchema(String filPosition){
        System.out.println("FILE = " + filPosition);
        händelser.clear();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    filPosition));
            String line = reader.readLine();
            SchemaHändelse laddadHändelse = new SchemaHändelse(new TidPunkt(1337,1,1,1,0),
                           new TidPunkt(1337,1,1,2,0), "Namnlös", "");
            while (line != null) {
                //System.out.println(line);
                //Laddar funktioner här
               
               if(line.startsWith(":S")){
                   laddadHändelse = new SchemaHändelse(new TidPunkt(1337,1,1,1,0),
                           new TidPunkt(1337,1,1,2,0), "Namnlös", "");
               }    else if(line.startsWith(":E")){
                   händelser.add(laddadHändelse);
               }    else if(line.startsWith(":T1")){
                   String[] tider = line.split(" ");
                   if(tider.length!=6){
                       System.out.println("Fel uppstod i databasen");
                   }
                   else{
                       laddadHändelse.startTid = new TidPunkt(Integer.parseInt(tider[1]),
                               Integer.parseInt(tider[2]), Integer.parseInt(tider[3]), 
                               Integer.parseInt(tider[4]), Integer.parseInt(tider[5]));
                   }
               }    else if(line.startsWith(":T2")){
                    String[] tider = line.split(" ");
                   if(tider.length!=6){
                       System.out.println("Fel uppstod i databasen");
                   }
                   else{
                       laddadHändelse.slutTid = new TidPunkt(Integer.parseInt(tider[1]),
                               Integer.parseInt(tider[2]), Integer.parseInt(tider[3]), 
                               Integer.parseInt(tider[4]), Integer.parseInt(tider[5]));
                   }
               }    else if(line.startsWith(":N")){
                   laddadHändelse.händelseNamn = line.substring(3);
               }    else if(line.startsWith(":B")){
                   laddadHändelse.händelseBeskrivning = line.substring(3);
               }
                
                
                //Läser in nästa rad och fortsätter
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Kunde inte läsa filen");
            e.printStackTrace();
        }
    }
    
    public void läggTillHändelse(SchemaHändelse inHändelse){
        händelser.add(inHändelse);
    }
    
    public void sparaSchema(){ // INTE KLAR
        //Sparar schemat till en textfil med ett eget scripting språk
        try {
            FileWriter skrivare = new FileWriter("schemat2.txt");
            // Kod för att skriva till filen
            skrivare.write("# v0_01 Schemascript\n");
            //:S Start av ny händelse
            //:E Slut av ny händelse
            
            for(int i=0; i<händelser.size(); i++){
                //SKRIV IN ALL INFORMATION
                /*
                :T1 = starttid
                :T2 = sluttid
                :N = namn på händelse
                :B = Beskrivning av händelse
                */
                skrivare.write(":S\n");
                skrivare.write(":T1 ");
                skrivare.write(händelser.get(i).startTid.årtal + " ");
                skrivare.write(händelser.get(i).startTid.månad + " ");
                skrivare.write(händelser.get(i).startTid.dag + " ");
                skrivare.write(händelser.get(i).startTid.timme + " ");
                skrivare.write(händelser.get(i).startTid.minut + "\n");
                skrivare.write(":T2 ");
                skrivare.write(händelser.get(i).slutTid.årtal + " ");
                skrivare.write(händelser.get(i).slutTid.månad + " ");
                skrivare.write(händelser.get(i).slutTid.dag + " ");
                skrivare.write(händelser.get(i).slutTid.timme + " ");
                skrivare.write(händelser.get(i).slutTid.minut + "\n");
                skrivare.write(":N " + händelser.get(i).händelseNamn + "\n");
                skrivare.write(":B " + händelser.get(i).händelseBeskrivning + "\n");
                skrivare.write(":E\n"); 
            }
            //skrivare.write("Det fungerererer typ !!! LULs");
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
    
}
