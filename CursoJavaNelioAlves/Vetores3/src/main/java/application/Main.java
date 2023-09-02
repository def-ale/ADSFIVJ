package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros(inteiro) voce vai digitar? ");
        int n = sc.nextInt();
        int[] vnumeros = new int[n];
        sc.nextLine();

        for ( int i = 0; i < vnumeros.length; i++) {
            System.out.print("Digite um numero: ");
            vnumeros[i] = sc.nextInt();
        }

        negativos(vnumeros, false);
    }

    public static void negativos(int[] vnumeros, boolean condicao) {
        //Checando se há algum número negativo
        for ( int numero : vnumeros ) {
            if ( numero < 0 ) {
                condicao = true;
            }
        }

        //If condicao = true
        if ( condicao ) {
            System.out.println("NUMEROS NEGATIVOS: ");
            for (int numero : vnumeros) {
                if (numero < 0) {
                    System.out.println(numero);
                }
            }
        }
        //If condicao = false
        else
            System.out.println("NÃO HÁ NUMEROS NEGATIVOS.");
    }
}