import java.util.ArrayList;

public class Condominio
{
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Pagamento> pagamentos;
    
    public Condominio(){
        this("", "");
    }
    public Condominio(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        despesas = new ArrayList<>();
        imoveis = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }
    
    public double valorCondominio(int mesAno){
        double soma = 0;
        for (Despesa d : despesas){
            if (d.getMesAno() == mesAno){
                soma += d.getValor();
            }
        }
        return soma;
    }
    public String relatorio(int mesAno){
        int qtdApto = 0;
        int aptoPago = 0;
        double arrecadado = 0;
        double aSerPago = 0;
        for (Imovel imovel : imoveis){
            if (imovel.getClass() == Apartamento.class){
                qtdApto++;
                for (Pagamento pagamento : pagamentos){
                    if (pagamento.imovel.equals(imovel)){
                        aptoPago++;
                        arrecadado += pagamento.getValorPago();
                    } else {
                        aSerPago += pagamento.getValorPago();
                    }
                }
            }
        }
        
        int mesAno2 = 0;
        for (Despesa d : despesas){
            if (d.getMesAno() == mesAno){
                mesAno2 = mesAno;
            }
        }
        
        return "Mês: " + mesAno2 + "\n" + qtdApto + " apartamentos (" + aptoPago + " pagos - " + (qtdApto - aptoPago)
        + " não pagos)"
        + "\nValor arrecadado: " + arrecadado + " - Valor a ser pago: " + aSerPago;
    }
    
    public void pagarCondominio(Imovel imovel, int mesAno){
        pagamentos.add(new Pagamento(mesAno, imovel.valorVenda()));
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public ArrayList<Despesa> getDespesas(){
        return despesas;
    }
    public void addDespesa(Despesa desp){
        this.despesas.add(desp);
    }
    public ArrayList<Imovel> getImovel(){
        return imoveis;
    }
    public void addImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }
}
