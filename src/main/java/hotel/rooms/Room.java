package hotel.rooms;

import hotel.guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    protected ArrayList<Guest> guests;
    protected int capacity;
    protected RoomType roomType;

    public Room(int capacity, RoomType roomType){
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }
    public ArrayList<Guest> getGuests(){
        return new ArrayList<>(this.guests);
    }
    public RoomType getRoomType(){
        return this.roomType;
    }

}
