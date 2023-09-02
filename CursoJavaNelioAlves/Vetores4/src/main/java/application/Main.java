package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vnumeros = new double[n];
        sc.nextLine();

        for ( int i = 0; i < vnumeros.length; i++ ) {
            System.out.print("Digite um numero: ");
            vnumeros[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        double sum = 0;
        for (double num : vnumeros) {
            System.out.printf("%.2f ", num);
            sum += num;
        }

        System.out.println();
        System.out.printf("SOMA = %.2f", sum);
        System.out.println();
        System.out.printf("MEDIA = %.2f", sum/vnumeros.length);

        sc.close();
    }
}