import java.util.ArrayList;

public class StellarSystem extends Galaxy {
   private ArrayList<SolarSystem> solarSystems = new ArrayList<SolarSystem>();
   private int amtStars; 

   StellarSystem(int starAmount, ArrayList<SolarSystem> listOfSystems) {
       solarSystems = listOfSystems;
       amtStars = starAmount;
   }
    
   private void newSolarSystem(int amountOfPlanets, int amountOfComets) {

   }
   private boolean newStar(float temperature, int magneticField,  float luminosity,  ArrayList<SolaySystem> orbitingPlanets) {

   }
   private int getAmountOfStars() {
       return amtStars;
   }
}