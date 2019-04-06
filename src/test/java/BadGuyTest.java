import Characters.Badguy;
import Characters.Warrior_Type;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class BadGuyTest  {

    Badguy orc;
    Warrior_Type knight;
    Weapon sword;
    Weapon axe;

    @Before
    public void before(){
        sword = new Weapon("sword", 5);
        axe = new Weapon("axe", 10);
        orc = new Badguy("Echo",30, axe);
        knight = new Warrior_Type ("Xena", 20,"knight", sword);

    }

    @Test
    public void canCharacterTest(){
        assertEquals("Echo", orc.getName());
        assertEquals(30, orc.getHP());
        assertEquals("axe", orc.getWeapon(axe));
    }

    @Test
    public void changeCharacterTest(){
        orc.setName("Harry");
        assertEquals("Harry", orc.getName());
        orc.setHP(10);
        assertEquals(10, orc.getHP());
    }

    @Test
    public void changeWeaponTest(){
        orc.changeWeapon(sword);
        assertEquals("sword", orc.getWeapon(sword));
    }

    @Test
    public void canAttack(){
        knight.reduceHP(orc.attack());
        assertEquals(10, knight.getHP());
    }

}
