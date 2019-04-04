import Characters.Warrior_Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class Warrior_TypeTest {

    Warrior_Type warrior_type;

    @Before
    public void before(){
        warrior_type = new Warrior_Type("Xena", 20,"barbarian","Axe");
    }

    @Test
    public void canCharacter(){
        assertEquals("Xena",warrior_type.getName());
        assertEquals(20, warrior_type.getHP());
        assertEquals("barbarian", warrior_type.getType());
        assertEquals("Axe", warrior_type.getWeapon());

    }

    @Test
    public void changeName(){
        
    }


}
