

public abstract class Imovel
{
    private int numero;
    protected int metrosQuadrados;
    private String proprietario;
    private Condominio condominio;
    
    public Imovel(int numero, int metros, String proprietario){
        this.numero = numero;
        this.metrosQuadrados = metros;
        this.proprietario = proprietario;
    }
    
    public abstract double valorVenal();
    public double valorVenda(){
        return valorVenal() - 15;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getMetrosQuadrados(){
        return numero;
    }
    public void setMetrosQuadrados(int metrosQuadrados){
        this.metrosQuadrados = metrosQuadrados;
    }
    
    public String getProprietario(){
        return proprietario;
    }
    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }
    
    public Condominio getCondominio(){
        return condominio;
    }
    public void setCondominio(Condominio condominio){
        this.condominio = condominio;
    }
}
