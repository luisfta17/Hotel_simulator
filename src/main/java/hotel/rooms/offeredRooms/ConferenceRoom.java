package hotel.rooms.offeredRooms;

import hotel.rooms.Room;

public class ConferenceRoom extends Room {
    private int capacity;
    private String name;
    private int hourlyPrice;

    public ConferenceRoom(int capacity, String name, int hourlyPrice){
        super(capacity);
        this.name = name;
        this.hourlyPrice = hourlyPrice;
    }

    public String getName(){
        return this.name;
    }
    public int getHourlyPrice(){
        return this.hourlyPrice;
    }
}
