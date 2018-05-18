import hotel.rooms.offeredRooms.DinningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {
    DinningRoom dinningRoom;

    @Before
    public void before(){
        dinningRoom = new DinningRoom(100, "Ocaso");
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, dinningRoom.getCapacity());
    }
    @Test
    public void hasName(){
        assertEquals("Ocaso", dinningRoom.getName());
    }
    @Test
    public void hasGuests(){
        assertEquals(0, dinningRoom.getGuests().size());
    }

}
