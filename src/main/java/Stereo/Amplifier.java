package Stereo;

public class Amplifier extends Component {

    private int volume;

    public Amplifier(String manufacturer, String model, String indicator) {
        super(manufacturer,model,indicator);
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }



}
