package songdatanew;

/**
 * @author Seydel
 */

import java.util.*;

public class SongdataNew {

    public static void main(String[] args) {
        
        Map<String,Object> musicData = new HashMap<>();
        
        musicData.put("Title","Hard Rock Halleluja");
        musicData.put("Artist","Lordi");
        musicData.put("ReleaseYear",2006);
        musicData.put("Genre","Rock");
        musicData.put("Duration",4.09);
        musicData.put("Country","Finland");
        musicData.put("HasVideo","yes");
        musicData.put("Album","The Arockalypse");
        musicData.put("EurovisionPlace",1);
        musicData.put("UKSinglesPeakPosition",25);
        
        for(String key: musicData.keySet())
        {
            System.out.println(key + ":\t" + musicData.get(key));
        }
        
    }
    
}
