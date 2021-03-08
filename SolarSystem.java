import java.util.ArrayList;

public class SolarSystem extends CelestialBody {
    
    private ArrayList<Planet> planets = new ArrayList<Planet>();
    private ArrayList<Comet> comets = new ArrayList<Comet>();
    private ArrayList<Asteroids> asteroids = new ArrayList<Asteroids>();    
    
    SolarSystem(ArrayList<Planet> p, ArrayList<Comet> c, ArrayList<Asteroids> a) {
        planets = p;
        comets = c;
        asteroids = a;
    }

    private int getAmountOfPlanets() {
    	return planets.size();
    }

    private int getAmountOfComets() {
        return comets.size();
    }

    private int getAmountOfAsteroids() {
        return asteroids.size();
    }

    private void newPlanet(float speed, int type, int axialTilt, int atmosphere, float forceOfGravity, int magnetosphere, int numOfRings,
        int satellites, boolean isOrbiting, float distanceFromClosestSun, float orbitalPeriod, float temperature, boolean isDwarf) {
        
    }
}
