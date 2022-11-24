
/**
 * Write a description of class LogAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         // complete constructor
         records = new ArrayList<LogEntry>(); 
     }
        
     public void readFile(String filename) {
         // complete method
         FileResource resource = new FileResource(filename);
         for(String line : resource.lines()){
            
            records.add(WebLogParser.parseEntry(line));
            
            }
         
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     
     
}
