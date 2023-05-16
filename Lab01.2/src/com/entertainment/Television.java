package com.entertainment;

import java.util.Comparator;
import java.util.Objects;

/*
 * natural order is defined by brand(String), then by volume(int)
 *
 * NOTE: to be consistent with equals, natural order must use the
 * same properties that are used in equals().
 * hashCode() must be consistent with equals as well.
 */
public class Television implements Comparable<Television> {
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

    //natural order is defined by brand which is a String and then volume(int)
    @Override
    public int compareTo(Television other) {
        int result = this.getBrand().compareTo(other.getBrand());

        if ( result == 0) {
            result = Integer.compare(this.getVolume(), other.volume);
        }

        return result;
    }

    @Override
    public int hashCode(){
        //this is a poorly written hash function, because it easily yields "hash collisions"
        //a hash collision is when different objectds hash to the same value ( dumb luck)
        // return getBrand().length() + getVolume();
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj){
        boolean result = false;

        //only proceed if obj is a reference to another television object
        if (obj instanceof Television ){
            //downcast obj to more specific Television so we can call Television methods
            Television other = (Television) obj;

            result = Objects.equals(this.getBrand(), other.getBrand()) &&       //null safe check
                    this.getVolume() == other.getVolume();                      // primitives can't be null
        }

        return result;
    }

    //toString method
    public String toString(){
        return "The TV brand is:"+ getBrand() + " and volume:" + getVolume() + " channel:" + tuner.getChannel();
    }
}
