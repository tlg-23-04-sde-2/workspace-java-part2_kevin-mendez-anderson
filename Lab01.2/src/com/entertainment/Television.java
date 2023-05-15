package com.entertainment;

public class Television {
    //Fields declaration
    private String brand = "LG";
    private int volume;
    private Tuner tuner = new Tuner();
    //constructors
    public Television(){

    }
    public Television(String brand, int volume){
        this.brand = brand;
        this.volume = volume;
    }
    //business methods
    public int getCurrentChannel(){
        return tuner.getChannel();
    }

   public void changeChannel(int channel){
        tuner.setChannel(channel);
    }
    //accessor methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj){
        boolean result = false;

        //only proceed if obj is a reference to another television object
        if (obj instanceof Television ){
            //downcast obj to more specific Television so we can call Television methods
            Television other = (Television) obj;

        }

        return result;
    }

    //toString method
    public String toString(){
        return "The TV brand is:"+ getBrand() + " and volume:" + getVolume() + " channel:" + tuner.getChannel();
    }
}
