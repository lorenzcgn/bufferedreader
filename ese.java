package prova;
import java.io.*;

public class Prova {
public static void main(String[] args) {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        int spazio;
        int tempo;
        double velocita;
        
   
        try{
            System.out.println("Inserisci spazio: ");
            String stringa = tastiera.readLine();
         spazio = Integer.valueOf(stringa).intValue();
        }
        catch(Exception e){
            System.out.println("Qualcosa non va!");
            return;
            
        }    
        try{
           System.out.println("Inserisci tempo: ");
           String stringa = tastiera.readLine();
         tempo = Integer.valueOf(stringa).intValue();
        }
        catch(Exception e){
            System.out.println("Qualcosa non va!");
            return;
            
        }
        
        velocita = (spazio/tempo)*3.6;
        System.out.println("la velocità: "+velocita+" km/h");
       
    }

}
