package hotel.rooms;

public enum RoomType {
    DOUBLE(2, 25),
    SINGLE(1, 18);

    private final int capacity;
    private final int price;


    RoomType(int capacity, int price){
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity(){
        return capacity;
    }
    public int getPrice(){
        return this.price;
    }
}
