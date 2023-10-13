package org.alexandrePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();

        for (int i = 1; i <= 5; i++){
            System.out.println("Aluno " + i);
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            turma.addAluno(new Aluno(nome));
        }

        System.out.println();
        System.out.println("### VOTACAO ###");
        for(int i = 0; i <= turma.tamanho() - 1; i++){
            Aluno eleitor = turma.getAlunos().get(i);
            System.out.println("Aluno: " + eleitor.getNome());
            System.out.println("Nome de quem deseja votar: ");
            String votouEm = sc.nextLine();
            for (int j = 0; j <= turma.tamanho() - 1; j++){
                if(turma.getAlunos().get(j).getNome().equals(votouEm)){
                    turma.getAlunos().get(j).votar(eleitor);
                }
            }
        }

        Aluno alunoMaisVotado = turma.achaAlunoMaisVotado();
        System.out.println("Aluno mais votado: " + alunoMaisVotado.getNome());
        System.out.println("Numero de votos: " + alunoMaisVotado.getNumVotos());

    }
}
