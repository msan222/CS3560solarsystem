
public class BlackHole extends CelestialBody
{
    private int typeHole;
    private float charge;
    private float angularMomentum;
    
    public int getTypeHole()
    {
        return typeHole;
    }
    
    public float getCharge()
    {
        return charge;
    }
    
    public float getAngularMomentum()
    {
        return angularMomentum;
    }
    
    public void absorb()
    {
        
    }
    
    public int setTypeHole(int type)
    {
        typeHole = type;
        
        return typeHole;
    }
    
    public float setCharge(float charge)
    {
        this.charge = charge;
        
        return this.charge;
    }
    
    public float setAngularMomentum(float momentum)
    {
        angularMomentum = momentum;
        
        return angularMomentum;
    }
    
    public int loseMass()
    {
        
    }
    
    public BlackHole merge(BlackHole bh1, BlackHole bh2)
    {
        newBh = bh1.mass + bh2.mass;
    }         
}
