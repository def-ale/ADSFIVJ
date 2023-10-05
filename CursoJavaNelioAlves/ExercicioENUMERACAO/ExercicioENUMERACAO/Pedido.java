import java.util.Date;

public class Pedido
{
    private String id;
    private Date data;
    private PedidoStatus status;
    
    public Pedido(){
    }
    public Pedido(String id, Date data, PedidoStatus status){
        this.id = id;
        this.data = data;
        this.status = status;
    }
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public Date getData(){
        return data;
    }
    public void setData(Date data){
        this.data = data;
    }
    
    public PedidoStatus getStatus(){
        return status;
    }
    public void setStatus(PedidoStatus status){
        this.status = status;
    }
    
    public String toString(){
        return "Pedido [ ID = " + id + " | Data/hora = " + data + " | Status = " + status + " ]";
    }
}
