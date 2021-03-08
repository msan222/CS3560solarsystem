import java.util.*;

public class CelestialBody
{
    private String name;
    private float mass;
    private float age;
    private int shape;
    private ArrayList<String> compositionNames = new ArrayList<String>();
    private ArrayList<Integer> compositionPercentages = new ArrayList<Integer>();
    
    private String getName()
    {
        return name;
    }
    
    private float getMass()
    {
        return mass;
    }
    
    private float getAge()
    {
        return age;
    }
    
    private int getShape()
    {
        return shape;
    }
    
    private void setName(String name)
    {
        this.name = name;
    }       
    
    private void setMass(float mass)
    {
        this.mass = mass;
    }
    
    private void setAge(float age)
    {
        this.age = age;
    }
    
    private void setSize(float size)
    {
        this.size = size;
    }
    
    private void setShape(int shape)
    {
        this.shape = shape;
    }     
    
    private String getCompositionName(int index)
    {
        return compositionNames[index];
    }
    
    private int getCompositionPercent(int index)
    {
        return compositionPercentages[index];
    }
    
    private int getComposition(String name, int percent, int index)
    {
        
    }
            
}
