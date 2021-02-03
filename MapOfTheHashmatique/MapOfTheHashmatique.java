import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("A song", "Blah Blah");
        trackList.put("The song", "Good songs");
        trackList.put("Our song", "More Goodness");
        trackList.put("Not a song", "Now it is a song");

        String Lyrics = trackList.get("A song");
        System.out.println(Lyrics);
        for(String i : trackList.keySet()){
            System.out.println(i + ": " +  trackList.get(i));
        }


    }

}