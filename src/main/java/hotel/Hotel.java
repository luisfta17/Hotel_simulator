package hotel;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
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

    public ConferenceRoom findConferenceByName(String name){
        ConferenceRoom foundRoom = null;
        for(ConferenceRoom room : this.conferenceRoomList){
            if(room.getName() == name){
                foundRoom = room;
            }
        }
        return foundRoom;
    }
    public DinningRoom findDinningRoomByName(String name){
        DinningRoom foundRoom = null;
        for(DinningRoom room : this.dinningRoomList){
            if(room.getName() == name){
                foundRoom = room;
            }
        }
        if ( foundRoom == null){
            return null;
        } else {
            return foundRoom;
        }

    }


    public void addGuestToRoom(int roomNumber, Guest guest) {
        findRoomByNumber(roomNumber).addGuest(guest);
    }
    public void addGuestToConferenceRoom(String roomName, Guest guest) {
        findConferenceByName(roomName).addGuest(guest);
    }
    public void addGuestToDinningRoom(String roomName, Guest guest) {
        findDinningRoomByName(roomName).addGuest(guest);
    }

    public void removeGuestFromRoom(int roomNumber, Guest guest) {
        findRoomByNumber(roomNumber).removeGuest(guest);
    }
    public void removeGuestFromConferenceRoom(String roomName, Guest guest) {
        findConferenceByName(roomName).removeGuest(guest);
    }
    public void removeGuestFromDinningRoom(String roomName, Guest guest) {
        findDinningRoomByName(roomName).removeGuest(guest);
    }

    public ArrayList<Guest> findGuestsInRoomByNumber(int roomNumber) {
       return findRoomByNumber(roomNumber).getGuests();
    }

    public ArrayList<Bedroom> findEmptyRooms() {
        ArrayList<Bedroom> emptyrooms = new ArrayList<>();
        for(Bedroom room : this.bedroomList){
            if(room.getGuests().size() == 0){
                emptyrooms.add(room);
            }
        }
        return emptyrooms;

    }

    public ArrayList<Guest> findGuestsInRoomByName(String roomName) {
        if (findConferenceByName(roomName) != null){
            return findConferenceByName(roomName).getGuests();
        } else {
            return findDinningRoomByName(roomName).getGuests();
        }

    }
}
