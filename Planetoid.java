public class Planetoid extends Satellite{
    
    private float orbitingSpeed;
    private float distanceFromClosestSun;
    private String orbitingObject;
    private float orbitalPeriod;
    
    private float getSpeed(){
        return orbitingSpeed;
    }
    
    private void setSpeed(float speed){
        orbitingSpeed = speed;
    }
    
    private float getDistanceFromClosestSun(){
        return distanceFromClosestSun;
    }
    
    private void setDistanceFromClosestSun(float distance){
        distanceFromClosestSun = distance;
    }
    
    private float getOrbitalPeriod(){
        return orbitalPeriod;
    }
    
    private void setOrbitalPeriod(float period){
        orbitalPeriod = period;
    }
    
    private String getOrbitingObject(){
        return orbitingObject;
    }
    
    private void setOrbitingObject(String object){
        orbitingObject = object;
    }
    
}
