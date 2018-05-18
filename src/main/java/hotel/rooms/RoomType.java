package hotel.rooms;

public enum RoomType {
    Double(2),
    Single(1),
    ConferenceRoom(100),
    DinningRoom(50);


    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
