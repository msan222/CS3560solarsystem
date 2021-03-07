import java.util.ArrayList;

public class Universe {
    
	private int energy;
    private ArrayList<Supercluster> superclusters = new ArrayList<Supercluster>();
    
    Universe(int e, ArrayList<Supercluster> clusters){
    	energy = e;
    	superclusters = clusters;
    }
    
    private void end() {
    	
    }
    
    private void start() {
    	
    }
    
    private void setEnergy(int newEnergy) {
    	
    }
    
    private boolean newCluster(int zRedshift, ArrayList<GalacticCluster> galaxyClusters) {
    	return true;
    }
    
    private int getNumOfSuperclusters() {
    	return 0;
    }
}
