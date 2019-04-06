import Characters.Badguy;
import Characters.Warrior_Type;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public
class Warrior_TypeTest {

    Warrior_Type warrior_type;
    Warrior_Type warrior_type2;
    Weapon sword;
    Weapon Axe;
    Weapon Spear;
    Badguy orc;

    @Before
    public void before(){
        sword = new Weapon("Sword", 5);
        Axe = new Weapon("Axe", 15);
        Spear = new Weapon("spear", 10);
        warrior_type = new Warrior_Type("Xena", 20,"barbarian", sword);
        warrior_type2 = new Warrior_Type( "Bob", 20, "Knight", Axe);
        orc = new Badguy("Ork", 30, "Troll", Spear);
    }

    @Test
    public void canCharacter(){
        assertEquals("Xena",warrior_type.getName());
        assertEquals(20, warrior_type.getHP());
        assertEquals("barbarian", warrior_type.getType());
        assertEquals("Sword", warrior_type.getWeapon(sword));
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
    public void changeWeaponTest(){
        warrior_type.changeWeapon(Axe);
        assertEquals("Axe", warrior_type.getWeapon(Axe));
    }

    @Test
    public void canAttack() {
        orc.reduceHP(warrior_type.attack());
        assertEquals(25, orc.getHP());
    }
}
