
public class Cobertura extends Imovel
{
    private boolean duplex;
    private boolean triplex;
    
    public Cobertura(boolean duplex, boolean triplex){
        super(0, 0, "");
        this.duplex = duplex;
        this.triplex = triplex;
    }
    
    public double valorVenal(){
        if (duplex){
            return (metrosQuadrados * 1000.00) * 2;
        } else if (triplex){
            return (metrosQuadrados * 1000.00) * 3;
        }
        
        return 0;
    }
    
    public boolean getDuplex(){
        return duplex;
    }
    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
    
    public boolean getTriplex(){
        return triplex;
    }
    public void setTriplex(boolean triplex){
        this.triplex = triplex;
    }
}
