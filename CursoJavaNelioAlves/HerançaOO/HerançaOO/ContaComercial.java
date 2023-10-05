

public class ContaComercial extends Conta
{
    private Double limiteEmprestimo;
    
    public ContaComercial(){
        super();
    }
    public ContaComercial(Integer numero, String titular, Double saldo, Double limiteEmprestimo){
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public void Emprestimo(Double valor){
        if (valor <= limiteEmprestimo){
            saldo += valor - 10.0;
        }
    }
    
    public Double getLimiteEmprestimo(){
       return limiteEmprestimo;
    }
    public void setLimiteEmprestimo(Double limiteEmprestimo){
        this.limiteEmprestimo = limiteEmprestimo;
    }
}
