package entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static double alturaMedia(Pessoa[] pessoas) {
        double soma = 0;
        for ( Pessoa p : pessoas ) {
            soma += p.altura;
        }
        return soma / pessoas.length;
    }

    public static void menorQueDezesseis(Pessoa[] pessoas) {
        int cont = 0;
        for ( Pessoa p : pessoas ) {
            if ( p.idade < 16 ) {
                cont++;
            }
        }

        System.out.printf("Porcentagem de pessoas menores de 16 anos = %.1f%%%n", ( cont * 100.0 ) / pessoas.length);

        for ( Pessoa p : pessoas ) {
            if ( p.idade < 16 ) {
                System.out.println(p.nome);
            }
        }

    }
}
