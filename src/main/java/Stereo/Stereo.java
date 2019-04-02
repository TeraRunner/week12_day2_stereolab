package Stereo;

import java.util.ArrayList;

public class Stereo {

    private ArrayList<Component> components;
    private String name;

    public Stereo(String name) {

        this.name = name;
        this.components = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void changeVolume(Amplifier amplifier, int newVolume) {
        amplifier.setVolume(newVolume);
    }

}
