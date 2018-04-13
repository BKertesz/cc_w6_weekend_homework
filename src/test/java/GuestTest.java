import Person.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest john;
    Guest clara;

    @Before
    public void setUp() throws Exception {
        john = new Guest("John Smith");
        clara = new Guest("Clara Smith");
    }

    @Test
    public void hasName() {
        assertEquals("John Smith",john.getName());
    }
}
