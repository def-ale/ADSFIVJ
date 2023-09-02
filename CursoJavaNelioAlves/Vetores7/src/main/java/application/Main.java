package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        double maior = 0;
        int aux = 0;

        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();

            if ( numeros[i] > maior ) {
                maior = numeros[i];
                aux = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", numeros[aux]);
        System.out.println("POSICAO DO MAIOR VALOR = " + aux);
    }
}