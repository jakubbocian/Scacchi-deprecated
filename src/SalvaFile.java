
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SalvaFile {
   
    
    Path currentRelativePath = Paths.get("");
    private final String percorso_progetto = currentRelativePath.toAbsolutePath().toString();
    
    public final String percorso_finite = percorso_progetto + "\\Partite\\partite_finite.txt";
    public final String percorso_salvate = percorso_progetto + "\\Partite\\partite_salvate.txt";
    
    public int PartitaFinita(){
        
        //qua dobbiamo generare la stringa da scrivere quando finisce una partita
        String scrivi = new String();
        
        if (ScriviFile(scrivi, percorso_finite) == -1){
            
            System.out.println("errore");
            return -1;
            //ovviamente non possiamo satampare l'errore in console, da cambiare.
            
        } 
                
        return 1;
        
    }
    
    public int PartitaSalvata(){
    
        //generare stringa partita salvata
        String scrivi = new String();
        
        if(ScriviFile(scrivi, percorso_salvate)==-1){
        
            System.out.println("errore");
            return -1;
            //ovviamente non possiamo satampare l'errore in console, da cambiare.
                
        }
        
        return 1;
        
    }
    
    public int ScriviFile(String scrivi, String percorso){
    
        try {
            
            FileWriter output = new FileWriter(percorso);
            
            output.append("\n" + scrivi);
            output.close();
            
            
        } catch (IOException ex) {
            
            return -1;
        }
        
        return 1;
    
    }
    
}
