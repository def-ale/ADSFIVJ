
public class FuncionarioTerceirizado extends Funcionario
{
    private Double despesaAdicional;
    
    public FuncionarioTerceirizado(){
        super();
    }
    public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double despesaAdicional){
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public double pagamento(){
        return super.pagamento() + (1.1 * despesaAdicional);
    }
    
    public double getDespesaAdicional(){
        return despesaAdicional;
    }
    public void setDespesaAdicional(Double despesaAdicional){
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public String toString(){
        return nome + " - R$ " + pagamento();
    }
}
