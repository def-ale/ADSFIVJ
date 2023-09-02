package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("- Vetor1 -");
        for (int i = 0; i < n; i++) {
            System.out.printf((i+1) + "º Numero = ");
            a[i] = sc.nextInt();
        }

        System.out.println("- Vetor2 -");
        for (int i = 0; i < n; i++) {
            System.out.printf((i+1) + "º Numero = ");
            b[i] = sc.nextInt();
        }

        System.out.println("- VETOR RESULTANTE -");
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%dº Numero = %d%n",i+1, c[i]);
        }
    }
}