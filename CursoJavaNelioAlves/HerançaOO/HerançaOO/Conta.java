

public class Conta
{
   private Integer numero;
   private String titular;
   protected Double saldo;
   
   public Conta(){
   }
   public Conta(Integer numero, String titular, Double saldo){
       this.numero = numero;
       this.titular = titular;
       this.saldo = saldo;
   }
   
   public void saque(Double valorSaque){
       saldo -= valorSaque;
   }
   public void deposito(Double valorDeposito){
       saldo += valorDeposito;
   }
   
   public Integer getNumero(){
       return numero;
   }
   public void setNumero(){
       this.numero = numero;
   }
   
   public String getTitular(){
       return titular;
   }
   public void setTitular(){
       this.titular = titular;
   }
   
   public Double getSaldo(){
       return saldo;
   }
   
}
