package entities;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private String nome;

    public ContaBancaria(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    public ContaBancaria(int numero, double saldo, String nome) {
        this.numero = numero;
        this.saldo = depositar(saldo);
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        return this.saldo;
    }
    public void sacar(double valorSaque) {
        double taxaBancaria = 5.00;
        this.saldo -= valorSaque + taxaBancaria;
    }

    public String toString() {
        return  " Numero = " + numero +
                "\n Saldo = " + saldo +
                "\n Nome = " + nome;
    }
}