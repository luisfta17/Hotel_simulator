import hotel.rooms.offeredRooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(250, "Sunshine", 150);
    }

    @Test
    public void hasCapacity(){
        assertEquals(250, conferenceRoom.getCapacity());
    }
    @Test
    public void hasName(){
        assertEquals("Sunshine", conferenceRoom.getName());
    }
    @Test
    public void hasGuests(){
        assertEquals(0, conferenceRoom.getGuests().size());
    }
    @Test
    public void hasPrice(){
        assertEquals(150, conferenceRoom.getHourlyPrice());
    }
}
