import hotel.guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Luis", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Luis", guest.getName());
    }
    @Test
    public void hasMoney(){
        assertEquals(100, guest.getWallet());
    }

}
