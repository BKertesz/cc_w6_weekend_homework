import Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom cRoom1;

    @Before
    public void setUp() throws Exception {
        cRoom1 = new ConferenceRoom(10,"Dorrian",25);
    }

    @Test
    public void hasName() {
        assertEquals("Dorrian",cRoom1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(10,cRoom1.getCapacity());
    }

    @Test
    public void hasDailyRare(){
        assertEquals(25,cRoom1.getDailyRate());
    }

}
