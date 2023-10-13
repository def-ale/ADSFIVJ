package org.alexandrePOO;

public class Aluno {
    private String nome;
    private int numVotos;

    public Aluno(){
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.numVotos = 0;
    }

    public void votar(Aluno aluno){
        this.numVotos++;
    }

    public String getNome() {
        return nome;
    }


    public int getNumVotos() {
        return numVotos;
    }

}
