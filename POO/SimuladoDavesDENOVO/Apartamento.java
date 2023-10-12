
public class Apartamento extends Imovel
{
    private int numeroQuartos;
    
    public Apartamento(int numeroQuartos){
        super(0, 0, "");
        this.numeroQuartos = numeroQuartos;
    }
    
    public double valorVenal(){
        return (1000.00 * metrosQuadrados) + numeroQuartos * 500.00;
    }
    
    public int getNumeroQuartos(){
        return numeroQuartos;
    }
    public void setNumeroQuartos(int numeroQuartos){
        this.numeroQuartos = numeroQuartos; 
    }
}
