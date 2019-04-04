import Characters.Warrior_Type;
import Characters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class Warrior_TypeTest {

    Warrior_Type warrior_type;
    Warrior_Type warrior_type2;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void before(){
        weapon1 = new Weapon("Sword", 5);
        weapon2 = new Weapon("Axe", 15);
        warrior_type = new Warrior_Type("Xena", 20,"barbarian", weapon1);
        warrior_type2 = new Warrior_Type( "Bob", 20, "Knight", weapon2);

    }

    @Test
    public void canCharacter(){
        assertEquals("Xena",warrior_type.getName());
        assertEquals(20, warrior_type.getHP());
        assertEquals("barbarian", warrior_type.getType());
    }

    @Test
    public void changeCharacterTest(){
        warrior_type.setName("Sheila");
        assertEquals("Sheila", warrior_type.getName());
        warrior_type.setHP(19);
        assertEquals(19, warrior_type.getHP());
        warrior_type.setType("Knight");
        assertEquals("Knight", warrior_type.getType());
    }

    @Test
    public
}
