import java.util.ArrayList;

public class Galaxy extends CelestialBody {
	
	private ArrayList<Galaxy> nebulas = new ArrayList<Galaxy>();
	private ArrayList<BlackHoles> blackHoles = new ArrayList<BlackHoles>();
	private ArrayList<StellarSystems> stelSystems = new ArrayList<StellarSystems>();
	
	private boolean newNebula (int type) {
		return true;
	}
	
	private int getNumOfNebulas() {
		return 0;
	}
	
	private int getNumOfStelSystems() {
		return 0;
	}
	
	private int getNumOfBlackHoles() {
		return 0;
	}
	
	private void newBlackHole(int type, float charge, float momentum) {
		
	}
	
	private void newStelSystem() {
		
	}
}

