import java.util.Date;

public class Program
{
    public static void main(String[] args){
        
        Pedido pedido = new Pedido("1080", new Date(), PedidoStatus.PAGAMENTO_PENDENTE);
        
        System.out.println(pedido);
    }
}
