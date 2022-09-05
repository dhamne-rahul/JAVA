package OOPS.Interfaces;

public class MediaPlayes implements MediaPlayer {

    @Override
    public void start() {
        System.out.println("Media player start");
        
    }

    @Override
    public void stop() {
        System.out.println("media player stop"); 
    }
    
    
}
