
public class Pagamento
{
    private int mesAno;
    private double valorPago;
    public Imovel imovel;
    private Condominio condominio;
    
    public Pagamento(){
    }
    public Pagamento(int mesAno, double valorPago){
        this.mesAno = mesAno;
        this.valorPago = valorPago;
    }
    
    public int getMesAno(){
        return mesAno;
    }
    public void MesAno(int mesAno){
        this.mesAno = mesAno;
    }
    public double getValorPago(){
        return valorPago;
    }
    public void setValorPago(double valorPago){
        this.valorPago = valorPago;
    }
    public Condominio getCondominio(){
        return condominio;
    }
    public void setCondominio(Condominio condominio){
        this.condominio = condominio;
    }
    public Imovel getImovel(){
        return imovel;
    }
    public void setImovel(Imovel imovel){
        this.imovel = imovel;
    }
}
