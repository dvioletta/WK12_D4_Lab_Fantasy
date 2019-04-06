import Characters.Badguy;
import Items.Weapon;
import Rooms.Fighting_Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class FlightRoomTest {

    Fighting_Room dungenon;
    Badguy orc;
    Weapon sword;

    @Before
    public void before(){
       sword = new Weapon("Sword",5);
        orc = new Badguy("Nobby", 15, "orc", sword);
        dungenon = new Fighting_Room(orc);
    }

    @Test
    public void canGetBadguy(){
        assertEquals("orc", dungenon.getBadguy());
    }

}
