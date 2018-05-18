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


    public void addGuest(Guest guest1) {
        if (this.capacity > this.guests.size()){
            this.guests.add(guest1);
        }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

}
