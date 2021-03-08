import java.util.*;

public class CelestialBody
{
    private String name;
    private float mass;
    private float age;
    private int shape;
    private ArrayList<String> compositionNames = new ArrayList<String>();
    private ArrayList<Integer> compositionPercentages = new ArrayList<Integer>();
    
    public String getName()
    {
        return name;
    }
    
    public float getMass()
    {
        return mass;
    }
    
    public float getAge()
    {
        return age;
    }
    
    public int getShape()
    {
        return shape;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }       
    
    public void setMass(float mass)
    {
        this.mass = mass;
    }
    
    public void setAge(float age)
    {
        this.age = age;
    }
    
    public void setSize(float size)
    {
        this.size = size;
    }
    
    public void setShape(int shape)
    {
        this.shape = shape;
    }     
    
    public String getCompositionName(int index)
    {
        return compositionNames[index];
    }
    
    public int getCompositionPercent(int index)
    {
        return compositionPercentages[index];
    }
    
    public int getComposition(String name, int percent, int index)
    {
        
    }
            
}
