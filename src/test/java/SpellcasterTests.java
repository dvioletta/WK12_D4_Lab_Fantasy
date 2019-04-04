import Characters.MagicPowers;
import Characters.Spellcaster_Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class SpellcasterTests {

    Spellcaster_Type witch;
    MagicPowers fireburst;
    MagicPowers raven;

    @Before
    public void before() {
        fireburst = new MagicPowers("fireburst", 10);
        raven = new MagicPowers("raven", 7);
        witch = new Spellcaster_Type("Harry", 15, "witch", fireburst);
    }

    @Test
    public void canCharacter(){
        assertEquals("Harry",witch.getName());
        assertEquals(15, witch.getHP());
        assertEquals("witch", witch.getType());
        assertEquals("fireburst", witch.getPowerName(fireburst));
    }

    @Test
    public void changeCharacterTest(){
        witch.setName("Sheila");
        assertEquals("Sheila", witch.getName());
        witch.setHP(19);
        assertEquals(19, witch.getHP());
        witch.setType("Wizard");
        assertEquals("Wizard", witch.getType());
    }

    @Test
    public void changeWeaponTest(){
        witch.changeMagicPowers(raven);
        assertEquals("raven", witch.getPowerName(raven));
    }
}
