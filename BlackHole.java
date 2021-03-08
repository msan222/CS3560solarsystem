
public class BlackHole extends CelestialBody
{
    private int typeHole;
    private float charge;
    private float angularMomentum;
    
    private int getTypeHole()
    {
        return typeHole;
    }
    
    private float getCharge()
    {
        return charge;
    }
    
    private float getAngularMomentum()
    {
        return angularMomentum;
    }
    
    private void absorb()
    {
        
    }
    
    private int setTypeHole(int type)
    {
        typeHole = type;
        
        return typeHole;
    }
    
    private float setCharge(float charge)
    {
        this.charge = charge;
        
        return this.charge;
    }
    
    private float setAngularMomentum(float momentum)
    {
        angularMomentum = momentum;
        
        return angularMomentum;
    }
    
    private int loseMass()
    {
        
    }
    
    private BlackHole merge(BlackHole bh1, BlackHole bh2)
    {
        newBh = bh1.mass + bh2.mass;
    }         
}
