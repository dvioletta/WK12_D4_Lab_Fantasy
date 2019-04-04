import Characters.Healer_Type;
import Characters.Health;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer_Type healer;
    Health potion;
    Health herb;

    @Before
    public void before() {
        potion = new Health("Potion", -10);
        herb = new Health("Herb", -5);
        healer = new Healer_Type("Hank", 15, "Healer", herb);
    }

    @Test
    public void canCharacter(){
        assertEquals("Hank",healer.getName());
        assertEquals(15, healer.getHP());
        assertEquals("Healer", healer.getType());
        assertEquals("Herb", healer.getHealingToolName(herb));
    }

    @Test
    public void changeCharacterTest(){
        healer.setName("Sheila");
        assertEquals("Sheila", healer.getName());
        healer.setHP(19);
        assertEquals(19, healer.getHP());
        healer.setType("Cleric");
        assertEquals("Cleric", healer.getType());
    }

    @Test
    public void changeWeaponTest(){
        healer.changeHealingName(potion);
        assertEquals("Potion", healer.getHealingToolName(potion));
    }
}
