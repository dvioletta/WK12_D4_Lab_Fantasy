package Rooms;

import Characters.Warrior_Type;
import Items.Weapon;

public
class Turns {
    protected Warrior_Type warrior_type;
    protected Monster monster;
    protected Weapon weapon;

    public Turns(Warrior_Type warrior_type, Monster monster, Weapon weapon){
        this.monster = new Monster("Harriet","Harpy",10);
        this.warrior_type = new Warrior_Type("Xena",20,"Knight",weapon);
        this.weapon = new Weapon("sword",5);
    }

    public int attack(){
        return this.warrior_type.getWeaponDamage(weapon);
    }

    public boolean isAlive(){
        return monster.HP > 0;
    }
}
