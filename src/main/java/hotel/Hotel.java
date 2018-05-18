package hotel;

import hotel.rooms.Room;

import java.util.ArrayList;

public class Hotel {
    protected ArrayList<Room> roomList;
    protected int till;

    public Hotel(){
        this.roomList = new ArrayList<>();
        this.till = 0;
    }
}
