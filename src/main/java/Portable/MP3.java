package Portable;
import Stereo.IConnect;
import Stereo.Stereo;

public class MP3 implements IConnect {
    private String playStatus;
    public  MP3(){

    }
    public String connect(Stereo stereo){
        return "Connected to " + stereo.getName();
    }

    public void play(){
         this.playStatus = "playing";
    }

    public void stop(){
        this.playStatus = "Stopped";
    }

    public String getPlayStatus(){
        return this.playStatus;
    }



}
