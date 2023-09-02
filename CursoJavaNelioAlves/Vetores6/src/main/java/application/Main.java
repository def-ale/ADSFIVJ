package application;

import entities.Numero;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        Numero[] numeros = new Numero[n];

        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.println("Digite um numero: ");
            numeros[i] = new Numero(sc.nextInt());
        }
        Numero.achaPares(numeros);
    }
}