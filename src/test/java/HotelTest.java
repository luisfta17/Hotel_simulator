import hotel.Hotel;
import hotel.guests.Guest;
import hotel.rooms.RoomType;
import hotel.rooms.offeredRooms.Bedroom;
import hotel.rooms.offeredRooms.ConferenceRoom;
import hotel.rooms.offeredRooms.DinningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom, bedroom1, bedroom2;
    ConferenceRoom conferenceRoom;
    DinningRoom dinningRoom;
    Guest guest1, guest2, guest3;


    @Before
    public void before(){
        hotel = new Hotel("Lalo");
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
        bedroom1 = new Bedroom(RoomType.SINGLE, 2);
        bedroom2 = new Bedroom(RoomType.SINGLE, 3);
        conferenceRoom = new ConferenceRoom(250, "Ocaso", 50);
        dinningRoom = new DinningRoom(100, "Sunshine");
        guest1 = new Guest("Luis", 150);
        guest2 = new Guest("Ruri", 30);
        guest3 = new Guest("Ana", 40);
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom1);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addDinningRoom(dinningRoom);
    }

    @Test
    public void hasName(){
        assertEquals("Lalo", hotel.getName());
    }
    @Test
    public void hasListOfRooms(){
        assertEquals(2, hotel.getBedroomList().size());
        assertEquals(1, hotel.getConferenceRoomList().size());
        assertEquals(1, hotel.getDinningRoomList().size());
    }
    @Test
    public void canAddRoom(){
        hotel.addBedroom(bedroom2);
        assertEquals(3, hotel.getBedroomList().size());
    }
    @Test
    public void canFindRoomByNumber(){
        assertEquals(bedroom, hotel.findRoomByNumber(1));
    }

    @Test
    public void canAddGuestToRoom(){
        hotel.addGuestToRoom(1, guest1);
        assertEquals(1, bedroom.getGuests().size());
    }
    @Test
    public void canAddTwoGuest(){
        hotel.addGuestToRoom(1, guest1);
        hotel.addGuestToRoom(1, guest2);
        assertEquals(2, bedroom.getGuests().size());
    }
    @Test
    public void canRemoveGuest(){
        hotel.addGuestToRoom(1, guest1);
        hotel.addGuestToRoom(1, guest2);
        hotel.removeGuestFromRoom(1, guest2);
        assertEquals(1, bedroom.getGuests().size());
    }

}
