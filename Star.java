import java.util.ArrayList;

public class Star extends CelestialBody{
    
    private float temperature;
    private int magneticField;
    private float luminosity;
    ArrayList<Planets> orbitingPlanets = new ArrayList<Planets>();

    private float getTemp(){
        return temperature;
    }
    
    private void setTemp(float temp){
        temperature = temp;
    }
    
    private int getField(){
        return magneticField;
    }
    
    private void setField(int field){
        magneticField = field;
    }
    
    private float getLumin(){
        return luminosity;
    }
    
    private void setLumin(float lumin){
        luminosity = lumin;
    }
    
    private ArrayList getOrbitingPlanets(){ 
        return orbitingPlanets;
    }
    
    private boolean shine(){
        return true;
    }
    
    //dies and becomes something else based on mass
    private boolean collapse(int mass){
        return true;
    }
    
    //releases mass
    private int flare(){
        int mass = 0;
        return mass;
    }
    
    //stellar wind ejects gas; cause planet solarStorm
    private int releaseWind(){
        int massOfWind = 0;
        return massOfWind;
    }
    
}
