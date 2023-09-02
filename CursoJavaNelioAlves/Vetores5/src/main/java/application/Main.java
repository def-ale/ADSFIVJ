package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoas = new Pessoa[n];

        for ( int i = 0; i < pessoas.length; i++ ) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = sc.nextDouble();
            sc.nextLine();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        System.out.printf("Altura media: %.2fm%n", Pessoa.alturaMedia(pessoas));
        Pessoa.menorQueDezesseis(pessoas);

        sc.close();
    }
}