public class Moon extends Satellite{

    Planet orbitingPlanet;
    int orbitalPeriod;
    
    private Planet getPlanet(){
        return Planet;
    }
    
    private void setPlanet(Planet planet){
        orbitingPlanet = planet;
    }
    
    private int getOrbitalPeriod(){
        return orbitalPeriod;
    }
    
    
    private void setOrbitalPeriod(int period){
        orbitalPeriod = period;
    }
    
    //changes type
    private boolean leaveOrbit(){return true;}
    
}
