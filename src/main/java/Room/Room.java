package Room;
import Person.Guest;

import Person.Person;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> occupants;

    public Room(int capacity) {
        this.capacity = capacity;
        this.occupants = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<Guest> occupants) {
        this.occupants = occupants;
    }

    public int getCount(){
        return occupants.size();
    }

    public boolean checkIn(Guest guest) {
        if (getCount() < capacity) {
            occupants.add(guest);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOut(Guest guest){
        if(occupants.contains(guest)){
            occupants.remove(guest);
            return true;
        }
        else {
            return false;
        }
    }

}
