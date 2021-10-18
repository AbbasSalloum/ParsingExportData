import edu.duke.*;
import org.apache.commons.csv.*;

/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public void countryInfo(CSVParser parser,String countryOfInterest){
     for(CSVRecord record: parser){
         String country=record.get("Country");
         
         if(country.contains(countryOfInterest)){
          System.out.println(country+":"+record.get("Exports"));
             
            }
        }
    }
    public void test(){
      FileResource fr= new FileResource();
      CSVParser parser= fr.getCSVParser();
      countryInfo(parser,"Germany");
     
    }

}
