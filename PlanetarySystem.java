import java.util.ArrayList;

public class PlanetarySystem extends CelestialBody {
    
	private boolean orbitAroundStarSystem;
    private ArrayList<Satellites> orbitingBodies = new ArrayList<Satellites>();
    
    PlanetarySystem(boolean orbit, ArrayList<Satellites> orbBodies)
    {
        orbitAroundStarSystem = orbit;
        orbitingBodies = orbBodies;
    }

    private boolean isOrbiting() {
    	return true;
    }

    private String getStarSystem() {
    	return "a";
    }
}
