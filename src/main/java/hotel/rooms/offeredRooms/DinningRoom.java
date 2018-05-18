package hotel.rooms.offeredRooms;

import hotel.rooms.Room;

public class DinningRoom  extends Room{

    private int capacity;
    private String name;

    public DinningRoom(int capacity, String name){
        super(capacity);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
