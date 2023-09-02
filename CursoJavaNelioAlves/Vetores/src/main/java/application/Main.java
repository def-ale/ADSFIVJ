package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Irá cadastrar a altura de quantas pessoas? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for ( int i = 0; i < vect.length; i ++ ) {
            System.out.print("Altura (em metros): ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double i : vect) {
            sum += i;
        }
        double media = sum / n;

        System.out.printf("Média das alturas: %.2f", media);

        sc.close();
    }
}