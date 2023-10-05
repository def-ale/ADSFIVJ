
public class Funcionario
{
    protected String nome;
    private Integer horas;
    private Double valorHora;
    
    public Funcionario(){
    }
    public Funcionario(String nome, Integer horas, Double valorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }
    
    public double pagamento(){
        return valorHora * horas;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getHoras(){
        return horas;
    }
    public void setHoras(Integer horas){
        this.horas = horas;
    }
    
    public double getValorHora(){
        return valorHora;
    }
    public void setValorHora(Double valorHora){
        this.valorHora = valorHora;
    }
    
    public String toString(){
        return nome + " - R$ " + pagamento();
    }
}
