import hotel.rooms.RoomType;
import hotel.rooms.offeredRooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
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

}
