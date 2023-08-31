package application;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria;
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Nome do Titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Deseja fazer um depósito inical? (s/n): ");
        char resposta = sc.next().charAt(0);
        if ( resposta == 's' ) {
            System.out.print("Valor do depósito: ");
            double valorDepositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(numero, valorDepositoInicial, nome);
        }
        else {
            contaBancaria = new ContaBancaria(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.print("Valor que deseja depositar: ");
        double valorDeposito = sc.nextDouble();
        contaBancaria.depositar(valorDeposito);
        System.out.println("- Dados Atualizados -:");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.print("Valor que deseja sacar: ");
        double valorSaque = sc.nextDouble();
        contaBancaria.sacar(valorSaque);
        System.out.println("- Dados Atualizados -:");
        System.out.println(contaBancaria);

    }
}
