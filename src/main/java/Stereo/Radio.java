package Stereo;

public class Radio {

    private String station;
    private Band band;

    public Radio(Band band) {
        this.band = band;
    }

    public Band getBand() {
        return this.band;
    }

    public String getStation() {
        return this.station;
    }

    public void pickStation(String selectedStation) {
        this.station = selectedStation;
    }

}
