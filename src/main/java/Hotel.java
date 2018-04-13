import Person.Guest;
import Room.Room;

import java.util.ArrayList;

public class Hotel {
    String name;
    ArrayList<Room> rooms;
    ArrayList<Guest> lobby;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.lobby = new ArrayList<>();
    }
}
