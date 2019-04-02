package Stereo;

public abstract class Component{


    private String manufacturer;
    private String model;



    private String powerIndicator;


    public Component(String manufacturer, String model, String indicator){
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerIndicator = indicator;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public String getModel() {
        return model;
    }


    public String getPowerIndicator() {
        return powerIndicator;
    }

    public void setPowerIndicator(String powerIndicator) {
        this.powerIndicator = powerIndicator;
    }




}
