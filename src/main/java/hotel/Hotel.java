package hotel;

import hotel.guests.Guest;
import hotel.rooms.Room;
import hotel.rooms.offeredRooms.Bedroom;
import hotel.rooms.offeredRooms.ConferenceRoom;
import hotel.rooms.offeredRooms.DinningRoom;

import java.util.ArrayList;

public class Hotel {
    protected String name;
    protected ArrayList<Bedroom> bedroomList;
    protected ArrayList<DinningRoom> dinningRoomList;
    protected ArrayList<ConferenceRoom> conferenceRoomList;
    protected int till;

    public Hotel(String name){
        this.name = name;
        this.bedroomList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
        this.dinningRoomList = new ArrayList<>();
        this.till = 0;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Room> getBedroomList() {
        return new ArrayList<>(this.bedroomList);

    }
    public ArrayList<Room> getConferenceRoomList() {
        return new ArrayList<>(this.conferenceRoomList);

    }
    public ArrayList<Room> getDinningRoomList() {
        return new ArrayList<>(this.dinningRoomList);

    }

    public void addBedroom(Bedroom room) {
        this.bedroomList.add(room);
    }
    public void addConferenceRoom(ConferenceRoom room) {
        this.conferenceRoomList.add(room);
    }
    public void addDinningRoom(DinningRoom room) {
        this.dinningRoomList.add(room);
    }

    public Bedroom findRoomByNumber(int number){
        Bedroom foundRoom = null;
        for(Bedroom room : this.bedroomList){
            if(room.getRoomNumber() == number){
                foundRoom = room;
            }
        }
        return foundRoom;
    }


    public void addGuestToRoom(int roomNumber, Guest guest1) {
        findRoomByNumber(roomNumber).addGuest(guest1);
    }

    public void removeGuestFromRoom(int roomNumber, Guest guest) {
        findRoomByNumber(roomNumber).removeGuest(guest);
    }

    public ArrayList<Guest> findGuestsInRoomByNumber(int roomNumber) {
       return findRoomByNumber(roomNumber).getGuests();
    }
}
