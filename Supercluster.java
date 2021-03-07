import java.util.ArrayList;

public class Supercluster extends CelestialBody{
	
	private int zRedshift;
	private ArrayList<GalacticCluster> galaxyClusters = new ArrayList<GalacticCluster>();
	
	Supercluster(int z, ArrayList<GalaxyCluster> clusters){
		zRedshift = z;
		galaxyClusters = clusters;
	}
	
	private boolean newGalaxyCluster(ArrayList<Galaxy> galaxies, float diameter, float velocityOfSpread) {
		return true;
	}
	
	private int getZ() {
		return zRedshift;
	}
	
	private int getNumOfClusters() {
		return 0;
	}
	
	private void setZRedShift(int shift) {
		
	}
	
}
