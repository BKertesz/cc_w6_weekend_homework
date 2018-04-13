import Person.Guest;
import Room.BedRoom;
import Room.bedRoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom singleRoom;
    BedRoom doubleRoom;
    Guest john;
    Guest clara;

    @Before
    public void setUp() throws Exception {
        singleRoom = new BedRoom(1,123,bedRoomType.SINGLE);
        doubleRoom = new BedRoom(2,124,bedRoomType.DOUBLE);
        john = new Guest("John Smith");
        clara = new Guest("Clara Smith");

    }

    @Test
    public void hasCapacity() {
        assertEquals(1,singleRoom.getCapacity());
    }

    @Test
    public void startsOutEmpty() {
        assertEquals(0,singleRoom.getCount());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(123,singleRoom.getRoomNumber());
    }

    @Test
    public void hasRoomPrice() {
        assertEquals(45,singleRoom.getRoomPrice());
    }

    @Test
    public void canCheckIn() {
        assertEquals(true,singleRoom.checkIn(john));
    }

    @Test
    public void canTCheckIn() {
        singleRoom.checkIn(clara);
        assertEquals(false,singleRoom.checkIn(john));
    }


}
