
public class Casa extends Imovel implements CondominioFechado
{
    private int metragemTerreno;
    
    public Casa(){
        super(0, 0, "");
    }
    public Casa(int metragemTerreno){
        super(0, 0, "");
        this.metragemTerreno = metragemTerreno;
    }
    
    @Override
    public double valorVenda(){
        return valorVenal() - 15 + valorTerreno();
    }
    
    public double valorTerreno(){
        return 350.00 * metragemTerreno;
    }
    
    public double valorVenal(){
        return metrosQuadrados * 1500.00;
    }
    
    public int getMetragemTerreno(){
        return metragemTerreno;
    }
    public void setMetragemTerreno(){
        this.metragemTerreno = metragemTerreno;
    }
}
