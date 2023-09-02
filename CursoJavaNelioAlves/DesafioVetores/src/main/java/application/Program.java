package application;

import entities.Hotel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hotel[] hotel = new Hotel[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        for ( int i = 0; i < n; i++ ) {
            System.out.printf("-= Aluguel #%d =- %n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            hotel[room] = new Hotel(name, email);
        }

        System.out.println();
        System.out.println("- Busy rooms -");
        Hotel.busyRooms(hotel);

        sc.close();
    }
}