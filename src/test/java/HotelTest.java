import Person.Guest;
import Room.BedRoom;
import Room.bedRoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HotelTest {

    Guest john;
    Guest clara;
    BedRoom doubleRoom;
    Hotel hydro;

    @Before
    public void setUp() throws Exception {
        john = new Guest("John Smith");
        clara = new Guest("Clara Smith");
        doubleRoom = new BedRoom(2,110, bedRoomType.DOUBLE);
        hydro = new Hotel("The Pitlochry Hydro");
    }

    @Test
    public void startOutEmpty() {
        assertEquals(0,hydro.getRoomCount());
    }

    @Test
    public void hasName() {
        assertEquals("The Pitlochry Hydro",hydro.getName());
    }

    @Test
    public void hasEmptyLobby() {
        assertEquals(0,hydro.getLobbyCount());
    }

    @Test
    public void thereArePeopleWaiting() {
        hydro.addWaitingPeople(john);
        hydro.addWaitingPeople(clara;
        assertEquals(2,hydro.getLobbyCount());
    }

    @Test
    public void canGenerateBedroom(){
        hydro.newBedRoom(1,124,bedRoomType.DOUBLE);
        assertEquals(1,hydro.getRoomCount());
    }

    @Test
    public void checkInPeople(){
        hydro.checkIn(doubleRoom,john);

    }
}
