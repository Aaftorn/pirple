/*
#########################################################################
#                                                                       #
#                         program that prints                           #
#                             some data                                 #
#                       about my favourite song                         #
#                                                                       #
#                                                        author:        #
#                                                       Balázs Szeidl   #
#                                                                       #
#########################################################################
*/
package songdata;

public class Songdata {

    public static void main(String[] args) {
        // TODO code application logic here
        String Title = "Hard Rock Halleluja";
        String Artist = "Lordi";
        int ReleaseYear = 2006;
        String Genre = "Rock";
        double Duration = 4.09;
        String Country = "Finland";
        String HasVideo = "yes";
        String Album = "The Arockalypse";
        int EurovisionPlace = 1;
        int UKSinglesPeakPosition = 25;
        
        System.out.println("Title: " + Title);
        System.out.println("Artist: " + Artist);
        System.out.println("Release Year: " + ReleaseYear);
        System.out.println("Genre: " + Genre);
        System.out.println("Duration: " + Duration);
        System.out.println("Country: " + Country);
        System.out.println("Has a video clip? " + HasVideo);
        System.out.println("Album: " + Album);
        System.out.println("Eurovision Placement: " + EurovisionPlace);
        System.out.println("UK Singles Highest Position: " + UKSinglesPeakPosition);
    }
    
}
