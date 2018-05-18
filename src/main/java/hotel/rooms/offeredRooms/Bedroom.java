package hotel.rooms.offeredRooms;

import hotel.rooms.Room;
import hotel.rooms.RoomType;

public class Bedroom extends Room {
    protected int roomNumber;
    protected int nightRate;
    protected RoomType roomType;

    public Bedroom(RoomType roomType, int roomNumber){
        super(roomType.getCapacity());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightRate = roomType.getPrice();
    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
    public int getNightRate(){
        return this.nightRate;
    }
    public RoomType getRoomType(){
        return this.roomType;
    }
}
