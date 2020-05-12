package inloggning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author mansa
 */
public class InloggningsDatabas {
    public InloggningsDatabas(){
    
    }
    public boolean testaInlogging(String användarnamn, String lösenord){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("inloggningdatabas.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] input = line.split(" ");
                if(input[0].equals(användarnamn)){
                    System.out.println("Rätt användarnamn");
                    if(input[1].equals(lösenord)){
                        System.out.println("Rätt lösenord");
                        return true;
                    }
                }
                line = reader.readLine();
            }
            reader.close();
        }   catch(IOException e){
            System.out.println("Kunde inte läsa filen");
            e.printStackTrace();
        }
        
        return false;
    }
    public boolean registreraAnvändare(String användarnamn, String lösenord) throws IOException{
        String[] uppgifter;
        int längd=0;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("inloggningdatabas.txt"));
            String line = reader.readLine();
            
            while (line != null) {
                String[] input = line.split(" ");
                if(input[0].equals(användarnamn)){
                   return false;
                }
                längd++;
                line = reader.readLine();
            }
            reader.close();
        }   catch(IOException e){
            System.out.println("Kunde inte läsa filen");
            e.printStackTrace();
        }
        uppgifter = new String[längd+1];
        
        try {
            reader = new BufferedReader(new FileReader("inloggningdatabas.txt"));
            String line = reader.readLine();
            int i=0;
            while (line != null) {
                uppgifter[i]=line;
                i++;
                line = reader.readLine();
            }
            reader.close();
        }   catch(IOException e){
            System.out.println("Kunde inte läsa filen");
            e.printStackTrace();
        }
        
        if(lösenord.length()<5)
            return false; // För kort lösenord
        if(användarnamn.length()<5)
            return false; // För kort användarnamn
        System.out.println("UPPGIFTER = " + Arrays.toString(uppgifter));
        uppgifter[uppgifter.length-1]=användarnamn+" "+lösenord;
        System.out.println("UPPGIFTER = " + Arrays.toString(uppgifter));
        
         try {
            FileWriter skrivare = new FileWriter("inloggningdatabas.txt");
            for(int i=0; i<uppgifter.length;i++){
                skrivare.write(uppgifter[i] + "\n");
            }
            System.out.println("Skrev till inloggningsdatabasen");
            skrivare.close();
         } catch (IOException e) {
            System.out.println("Ett fel uppstod");
            e.printStackTrace();
        }
        return true;
    }
    
}
