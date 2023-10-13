package org.alexandrePOO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> alunos;

    public Turma(){
        alunos = new ArrayList<>();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno achaAlunoMaisVotado(){
        Aluno alunoMaisVotado = alunos.get(0);
        for(Aluno a : alunos){
            if(a.getNumVotos() > alunoMaisVotado.getNumVotos()){
                alunoMaisVotado = a;
            }
        }
        return alunoMaisVotado;
    }

    public int tamanho(){
        return alunos.size();
    }

}
