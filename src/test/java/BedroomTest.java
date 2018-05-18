import hotel.guests.Guest;
import hotel.rooms.RoomType;
import hotel.rooms.offeredRooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest, guest1, guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
        guest = new Guest("Luis", 100);
        guest1 = new Guest("Luis", 100);
        guest2 = new Guest("Luis", 100);

    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }
    @Test
    public void hasGuests(){
        assertEquals(0, bedroom.getGuests().size());
    }
    @Test
    public void hasPrice(){
        assertEquals(25, bedroom.getNightRate());
    }
    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.getGuests().size());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

}
