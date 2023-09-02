package entities;

import java.util.Objects;

public class Hotel {
    private String name;
    private String email;
    private int room;

    public Hotel() {
    }
    public Hotel(String nome, String email) {
        this.name = nome;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public static void busyRooms(Hotel[] hotel) {
        for ( int i = 0; i < hotel.length; i++ ) {
            if ( hotel[i] != null ) {
                System.out.println(i + ": " + hotel[i].name + ", " + hotel[i].email);
            }
        }
    }
}
