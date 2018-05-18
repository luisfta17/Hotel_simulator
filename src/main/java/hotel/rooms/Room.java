package hotel.rooms;

import hotel.guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    protected ArrayList<Guest> guests;
    protected int capacity;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }
    public ArrayList<Guest> getGuests(){
        return new ArrayList<>(this.guests);
    }


}
