public class Planet {

	private int type;
	private float speed;
	private float axialTilt;
	private int atmosphere;
	private float forceOfGravity;
	private int magnetosphere;
	private int numOfRings;
	private ArrayList<Satellites> satellites = new ArrayList<Satellites>();
	private boolean isOribiting;
	private float distanceFromClosestSun;
	private float orbitalPeriod;
	private float temperature;
	private boolean isDwarf;
	private int dst;
	
	Planet() {
		// 
	}

	private int getType() {
		return type;
	}

	private float getSpeed() {
		return speed;
	}

	private float getAxialTilt() {
		return axialTilt;
	}

	private int getAtmosphere() {
		return atmosphere;
	}

	private float getForceOfGravity() {
		return forceOfGravity;
	}

	private int getMagnetosphere() {
		return magnetosphere;
	}

	private int getNumOfRings() {
		return numOfRings;
	}

	private boolean getIsOribiting() {
		return isOribiting;
	}

	private float getDistanceFromClosestSun() {
		return distanceFromClosestSun;
	}

	private float getOrbitalPeriod() {
		return orbitalPeriod;
	}

	private float getTemperature() {
		return temperature;
	}

	private boolean getIsDwarf() {
		return isDwarf;
	}

	private Satellites getSatellites() {
		return satellites;
	}

	private void newSatellite(float distanceFromPlanet, float speed, boolean hasSatellites) {

	}

	private int getDST() {
		return dst;
	}

	private int setType(int type) {
		this.type = type;
	}

	private float setSpeed(float speed) {
		this.speed = speed;
	}

	private float setAxialTilt(float tilt) {
		this.axialTilt = tilt;
	}

	private int setAtmosphere(int atmo) {
		this.atmosphere = atmo;
	}

	private float setForceOfGravity(float gravity) {
		this.forceOfGravity = gravity;
	}

	private int setMagnetosphere(int type) {
		this.magnetosphere = type;
	}

	private int setNumOfRings(int numRings) {
		this.numOfRings = numRings;
	}

	private float setIsOribiting(boolean orbit) {
		this.isOribiting = orbit;
	}

	private float setDistanceFromClosestSun(float distance) {
		this.distanceFromClosestSun = distance;
	}

	private float setOrbiralPeriod(float period) {
		this.orbitalPeriod = period;
	}

	private float setTemperature(float temp) {
		this.temperature = temp;
	}

	private boolean setIsDwarf(boolean isDwarf) {
		this.isDwarf = isDwarf;
	}

	private void leaveSystem() {
		
	}

	private int solarStorm(int energy) {

	}

}
