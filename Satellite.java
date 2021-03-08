public class Satellite  extends CelestialBody{

    float distanceFromOrbitingObject;
    boolean hasSatellites;

    private float getDistance(){
        return distanceFromOrbitingObject;
    }
    
    private void setDistance(float distance){
        distanceFromOrbitingObject = distance;
    }

    private void orbit(){}

}
